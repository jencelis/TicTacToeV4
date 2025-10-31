package clarkson.ee408.tictactoev4.socket;

/**
 * Server response to a REQUEST_MOVE request.
 * <p>
 * This is a subclass of Response that includes additional information
 * specific to gameplay. The server responds with the opponent's last move
 * and whether the game is still active (opponent hasn't disconnected or aborted).
 * </p>
 *
 * @author Conor O'Brien
 * @version 1.0
 */

public class GamingResponse extends Response {

    // ==============================
    // Attributes
    // ==============================
    /**
     * The opponents most recent move.
     * Value from (0-8) represents the cell of TicTacToe from top to bottom, left to right.
     */
    private int move;
    /**
     * A variable to indicate if the opponent is still active in the game.
     */
    private boolean active;

    // ==============================
    // Constructors
    // ==============================
    /**
     * Default no-arg constructor.
     * Calls the superclass constructor.
     */
    public GamingResponse(){
        super();
    }

    /**
     * Parameterized constructor
     *
     * @param status    the response status (SUCCESS or FAILURE)
     * @param message   message about the response
     * @param move      opponents most recent move (0-8)
     * @param active    true if the opponent is still active, false otherwise
     */
    public GamingResponse(ResponseStatus status, String message, int move, boolean active) {
        super(status ,message);
        this.move = move;
        this.active = active;
    }

    // ==============================
    // Getters and Setters
    // ==============================

    /**
     * Gets the opponent's most recent move.
     *
     * @return the opponent's most recent move (0-8)
     */
    public int getMove() {
        return move;
    }

    /**
     * Sets the opponent's most recent move.
     *
     * @param move the move value (0-8)
     */
    public void setMove(int move){
        this.move =move;
    }

    /**
     * Checks if the opponent is still active in the game.
     *
     * @return true if the opponent is still active, false otherwise
     */
    public boolean isActive(){
        return active;
    }

    /**
     * Sets whether the opponent is still active in the game.
     *
     * @param active true if opponent is active, false if disconnected/aborted
     */
    public void setActive(boolean active) {
        this.active = active;
    }

}
