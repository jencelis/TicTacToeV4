package clarkson.ee408.tictactoev4.client;

import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import android.util.Log;

import clarkson.ee408.tictactoev4.socket.Request;

/**
 * Establishes a socket connection with the server.
 * <p>
 *     A singleton class that helps the application connect to the socket server.
 *     Sends responses, then receives requests.
 *     Only one instance will exist at a time.
 * </p>
 *
 * @author Joseph Witte
 * @version 1.0
 */
public class SocketClient {
    private static SocketClient instance;

    private Socket socket;
    private DataInputStream inputStream;
    private DataOutputStream outputStream;
    private Gson gson;

    /**
     * A private constructor for the class.
     * Can be accessed only within the class for the purpose of singleton design.
     */
    private SocketClient() {
        gson = new GsonBuilder().serializeNulls().create();
        try {
            socket = new Socket("localhost", 5000);
            inputStream = new DataInputStream(socket.getInputStream());
            outputStream = new DataOutputStream(socket.getOutputStream());
        } catch (UnknownHostException e) {
            Log.e("SocketClient", "Unable to resolve host", e);
        } catch (IOException e) {
            Log.e("SocketClient", "IOException creating socket", e);
        }
    }

    /**
     * A static function that serves as a getter for the only class instance.
     * @return the class instance
     */
    public synchronized static SocketClient getInstance() {
        if (instance == null) {
            instance = new SocketClient();
        }
        return instance;
    }

    /**
     * Close socket connection and all IO streams.
     */
    public void close() {
        try {
            socket.close();
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            Log.e("SocketClient", "Failed to close socket connection / IO streams", e);
        }
    }

    /**
     * Sends a serialized request to the server and returns a response of class responseClass.
     * @param request the outgoing request
     * @param responseClass class of the response
     * @return the incoming response
     * @param <T> generic type for the response class
     */
    public <T> T sendRequest(Request request, Class<T> responseClass) {
        try {
            String serializedRequest = gson.toJson(request);
            outputStream.writeUTF(serializedRequest);
            outputStream.flush();
            String serializedResponse = inputStream.readUTF();
            return gson.fromJson(serializedResponse, responseClass);
        } catch (IOException e) {
            close();
            Log.e("SocketClient", "IOException sending client request", e);
        }
        return null;
    }
}
