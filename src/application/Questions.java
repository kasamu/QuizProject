package application;

import java.util.*;
import java.io.*;
/**
 * Represent the question with answer and question
 */
public class Questions
{
    /**
     * A string that contain the question
     */
    String question;
    /**
     * A correct answer from A-D
     */
    char answer;
    
    /**
     * Constructs a list of questions
     * @param question The question
     * @param answer The answer of the Question
     */
    public Questions(String question, char answer)
    {
        this.question = question;
        this.answer = answer;
        
    }
    
    /**
     * A method to check if the given variable is Instructor or not
     * @param p The person object
     * @return A boolean is the person is Instructor
     */
    public boolean isInstructor(Person p)
    {
        return p instanceof Instructor;
    }
    
    /**
     * A method to check if the given variable is Contestant or not
     * @param p The person object
     * @return A boolean is the person is Contestant
     */
    public boolean isContestant(Person p)
    {
        return p instanceof Contestant;
    }
    
    /**
     * A method to set a question to the list
     * @param answer The answer of the question
     */
    public void setQuestionAnswer(char answer)
    {
        this.answer = answer;
    }
    
    /**
     * A method that return the question
     * @return String of question
     */
    public String getQuestion()
    {
        return question;
    }
    
    /**
     * A method that return the answer 
     * @return char of Answer
     */
    public char getAnswer()
    {
        return answer;
    }
    
    
    
    
}