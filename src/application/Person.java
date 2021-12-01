package application;

/**
 * Represent the person with userID and password
 */
public abstract class Person
{   
    /**
     * Declare userID variable
     */
    
    String userID;
    /**
     * Declare password variable
     */
    
    String password;
    /**
     * create a register method which contain userID and password
     * @param userID The ID of the new or current user
     * @param password The password of the user
     */
    public void register(String userID, String password)
    {
        this.userID = userID;
        this.password = password;
    }
    
    /**
     * A method that check if the ID and password that was given correct or not
     * @param givenID The id of the user
     * @param givenPassword The password of the user
     * @return Boolean variable if it correct or not
     */
    public boolean isRegistered (String givenID, String givenPassword)
    {
        if (userID.equals(givenID))
        {
            if (password.equals(givenPassword))
                {
                    return true;
                }
        }
        return false;
    }
    
    /**
     * Boolean method to check true or false for the password
     * @param password The password of the user
     * @return Boolean variable
     */
    public boolean isCorrectPassword(String password)
    {
        return this.password==password;
    }
    
    /**
     * Boolean method to check true or false
     * @param password The id of the user
     * @return Boolean variable
     */
    public boolean isCorrectUsername(String userID)
    {
        return this.userID==userID;
    }
    
    /**
     * A that method return userID
     * @return userID
     */
    public String getUserID()
    {
        return userID;
    } 
}