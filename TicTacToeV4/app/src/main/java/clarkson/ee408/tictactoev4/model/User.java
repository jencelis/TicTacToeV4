package clarkson.ee408.tictactoev4.model;

/**
 * Models a user who will play the TicTacToe game.
 * <p>
 *     Each user object represents a registered player in the system.
 *     The username uniquely identifies every player.
 *
 *     Maps to the 'User' table in the database.
 * </p>
 *
 * @author Seth King
 * @version 1.0
 */

public class User {

    // ==============================
    // Attributes
    // ==============================
    private String username;
    private String password;
    private String displayName;
    private Boolean online;

    // ==============================
    // Constructors
    // ==============================

    /**
     * Default constructor.
     * Initializes a blank user.
     */

    public User() {};

    /**
     *
     * @param username    the username of the player
     * @param password    the password of the player
     * @param displayName the display name of the player
     * @param online      true if the user is currently online, false otherwise
     */
    public User(String username, String password, String displayName, Boolean online) {
        this.username = username;
        this.password = password;
        this.displayName = displayName;
        this.online = online;
    };

    // ==============================
    // Getters and Setters
    // ==============================

    /**
     * Gets the username of user
     *
     * @return the username
     */

    public String getUsername() {return username;};

    /**
     * Sets the username of the user
     *
     * @param newUsername
     */
    public void setUsername(String newUsername) {username = newUsername; }

    /**
     * Gets the password of user
     *
     * @return the password
     */
    public String getPassword() {return password;}

    /**
     * Sets the password of the user
     *
     * @param newPassword the new password
     */
    public void setPassword(String newPassword) {password = newPassword;}

    /**
     * Gets the display name of the user
     *
     * @return the display name
     */
    public String getDisplayName() {return displayName;}

    /**
     * Sets the display name of the user
     *
     * @param newDisplayName the new display name
     */
    public void setDisplayName(String newDisplayName) {displayName = newDisplayName;}

    /**
     * Gets the online status of the user
     *
     * @return true if the user is online, false otherwise
     */
    public Boolean getOnline() {return online;}

    /**
     * Sets the online status of the user
     *
     * @param newOnline true to set user online, false for offline
     */
    public void setOnline(Boolean newOnline) {online = newOnline;}
    // ==============================
    // Methods
    // ==============================

    /**
     * Checks if the two users are equal based on their username.
     *
     * @param obj the object to compare
     * @return true if the usernames are the same, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        User user = (User) obj;
        return username != null && username.equals(user.username);
    };

    /**
     * Returns a readable representation of the User object.This is useful for debugging code
     *
     * @return  formatted string containing username, displayName and online status.
     */
    @Override
    public String toString() {
        return "User{" + "username=" + username + ", displayName=" + displayName + ", online=" + online + '}';
    }
}
