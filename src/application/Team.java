package application;

import java.util.*;
import java.io.*;

/**
 * Represent a team of contestant
 */
class Team
{
    /**
     * The name of the team
     */
    String teamName;
    
    /**
     * The list of Contestant
     */
    ArrayList<Contestant> arrayOfContestant;
    
    /**
     * Constructs a team that has name and list of Contestant
     * @param name The name of the Team
     */
    
    public Team(String name)
    {
        arrayOfContestant= new ArrayList<Contestant>();
        teamName = name;
    }
    
    /**
     * A method to add member to the team
     * @param teamMember Contestant object that contain name, userID of contestant
     */
    public void enroll(Contestant teamMember)
    {
        arrayOfContestant.add(teamMember);
    }
    
    /**
     * A method that print out the name of team member
     */
    public void teamMembers()
    {
        String names = "";
        for (int i = 0; i < arrayOfContestant.size(); i++)
        {
            names += arrayOfContestant.get(i).getUserID();
            names +="\n";
        }
        System.out.println(names);
    }
}