package clarkson.ee408.tictactoev4.socket;

/**
 * Client requests that are sent to the server.
 * <p>
 * This class models all requests a client will send to the server.
 * The client must create an object of this class to communicate with the server.
 * The server always expects an object of this class when receiving a request.
 * </p>
 * <p>
 * The client must specify the type of request using one of the RequestType
 * enumeration values and optional serialized data when needed.
 * </p>
 *
 * @author Zi Jun Kenneth Seah
 * @version 1.0
 */

public class Request {

    /**
     * Enumeration type for different request types.
     * Defines all possible request types a client can send to the server.
     */
    public enum RequestType
    {
        LOGIN,REGISTER,UPDATE_PAIRING,SEND_INVITATION,ACCEPT_INVITATION,DECLINE_INVITATION,
        ACKNOWLEDGE_RESPONSE,REQUEST_MOVE,SEND_MOVE, ABORT_GAME, COMPLETE_GAME
    }

    // ==============================
    // Attributes
    // ==============================
    private RequestType type;
    private String data;

    // ==============================
    // Constructors
    // ==============================

    /**
     * Default constructor for the class.
     * Initializes a blank Request.
     */
    public Request() {}

    /**
     * Constructs a Request with specified type and data.
     *
     * @param type the type of request
     * @param data the serialized data for the request
     */
    public Request(RequestType type, String data)
    {
        this.type = type;
        this.data = data;
    }

    // ==============================
    // Getters and Setters
    // ==============================

    /**
     * Gets the request type
     *
     * @return the request type
     */
    public RequestType getType()
    {
        return type;
    }

    /**
     * Sets the request type
     *
     * @param type the request type
     */
    public void setType(RequestType type)
    {
        this.type = type;
    }

    /**
     * Get the data
     *
     * @return data
     */
    public String getData()
    {
        return data;
    }

    /**
     * Sets the data
     *
     * @param Data the data
     */
    public void setData(String Data)
    {
        this.data = data;
    }
}