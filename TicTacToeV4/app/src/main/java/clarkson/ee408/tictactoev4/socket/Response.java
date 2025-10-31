package clarkson.ee408.tictactoev4.socket;

/**
 * Server response to a client request.
 * <p>
 * This class models all server responses to client requests.
 * The server creates an object of this class to communicate back to the client.
 * Contains information about the request status (SUCCESS or FAILURE) and a
 * descriptive message.
 * </p>
 *
 * @author Zi Jun Kenneth Seah
 * @version 1.0
 */

public class Response {

    /**
     * Enumeration type for different response statuses
     */
    public enum ResponseStatus
    {
        SUCCESS, FAILURE
    }

    // ==============================
    // Attributes
    // ==============================
    private ResponseStatus status;
    private String message;

    // ==============================
    // Constructors
    // ==============================

    /**
     * Default constructor for the class.
     * Initializes a blank Response.
     */
    public Response(){}

    /**
     * Constructs a Response with all attributes specified.
     *
     * @param status  the response status (SUCCESS or FAILURE)
     * @param message a descriptive message about the response
     */
    public Response(ResponseStatus status, String message)
    {
        this.status = status;
        this.message = message;
    }

    // ==============================
    // Getters and Setters
    // ==============================

    /**
     * Gets the response status.
     *
     * @return the response status
     */
    public ResponseStatus getStatus() {
        return status;
    }

    /**
     * Sets the response status.
     *
     * @param status the new response status
     */
    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    /**
     * Gets the response message.
     *
     * @return the descriptive message
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * Sets the response message.
     *
     * @param message the new descriptive message
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
