package clarkson.ee408.tictactoev4.model;

/**
 * Models a game lifecycle, from initiating a request to being declined,
 * completed, or aborted after being accepted
 *
 * <p>
 *     Each Event object represents a game invitation and its progression through
 *     various states. The eventId uniquely identifies every event in the system.
 * </p>
 * <p>
 *     Maps to the 'Event' table in the database.
 * </p>
 *
 * @author Zi Jun Kenneth Seah
 * @version 1.0
 */

public class Event {
    /**
     * Enumeration type for different game statuses.
     * Represents the lifecycle of a game from invitation to completion.
     */
    public enum EventStatus
    {
        PENDING, DECLINED, ACCEPTED, PLAYING, COMPLETED, ABORTED
    }

    // ==============================
    // Attributes
    // ==============================
    private int eventId;
    private String sender;
    private String opponent;
    private EventStatus status;
    private String turn;
    private int move;

    // ==============================
    // Constructors
    // ==============================

    /**
     * Default constructor for the class.
     * Initializes a blank Event.
     */
    public Event()
    {

    }

    /**
     * Constructs an Event with all attributes specified.
     * @param eventId   the unique event identifier
     * @param sender    the username of the invitation sender
     * @param opponent  the username of the invitation recipient
     * @param status    the current status of the event
     * @param turn      the username of the player who made the last move
     * @param move      the last move made in the game
     */
    public Event(int eventId, String sender, String opponent, EventStatus status, String turn, int move)
    {
        this.eventId = eventId;
        this.sender = sender;
        this.opponent = opponent;
        this.status = status;
        this.turn = turn;
        this.move = move;
    }

    // ==============================
    // Getters and Setters
    // ==============================

    /**
     * Gets the event ID
     *
     * @return the event ID
     */
    public int getEventId() {
        return eventId;
    }

    /**
     * Sets the event ID
     *
     * @param eventId the new event ID
     */
    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    /**
     * Gets the sender's username
     *
     * @return the sender's username
     */
    public String getSender() {
        return sender;
    }

    /**
     * Sets the sender's username
     *
     * @param sender the new sender's username
     */
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * Gets the opponent's username
     *
     * @return the opponent's username
     */
    public String getOpponent() {
        return opponent;
    }

    /**
     * Sets the opponent's username
     *
     * @param opponent the new opponent's username
     */
    public void setOpponent(String opponent) {
        this.opponent = opponent;
    }

    /**
     * Gets the current status of the event
     *
     * @return the event status
     */
    public EventStatus getStatus() {
        return status;
    }

    /**
     * Sets the current status of the event
     *
     * @param status the new event status
     */
    public void setStatus(EventStatus status) {
        this.status = status;
    }

    /**
     * Gets the username of the player who made the last move
     *
     * @return the username of the last player to move
     */
    public String getTurn() {
        return turn;
    }

    /**
     * Sets the username of the player who made the last move
     *
     * @param turn the username of the player
     */
    public void setTurn(String turn) {
        this.turn = turn;
    }

    /**
     * Gets the last move made in the game
     *
     * @return the last move
     */
    public int getMove() {
        return move;
    }

    /**
     * Sets the last move made in the game
     *
     * @param move the move value
     */
    public void setMove(int move) {
        this.move = move;
    }

    // ==============================
    // Methods
    // ==============================

    /**
     * Checks if two events are equal based on their eventId
     *
     * @param obj the object to compare
     * @return true if the eventIds are the same, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Event event = (Event) obj;
        return this.eventId == event.eventId;
    }
}
