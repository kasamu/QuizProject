package application;

import java.util.Scanner;
import java.util.*;
import java.io.*;
/**
 * Represent the quiz
 */
public class Quiz 
{
    /**
     * A number of question in the list
     */
    int quizNum;
    /**
     * An linked list of Question
     */
    ArrayList<Questions> arrayOfQuestion = new ArrayList<Questions>();
    
    /**
     * Declare question Obj in quiz
     */
    Questions question;

    /**
     * Constructor Quiz that contain the number of Question
     */
    public Quiz()
    {
    }

    /** 
     * a method that add the questions according to the number of Question
     * @param quizNum The number of Question will be add to the Quiz
     */
    public void makeQuiz(int quizNum)
    {
        Scanner scan = new Scanner(System.in);
        String question; 
        char answer;
        for (int i = 0; i < quizNum ; i++)
        {
            System.out.printf("Please input your question");
            question = scan.nextLine();
            System.out.printf("Please input the answer of your question");
            answer = scan.next().charAt(0);
            
            Questions newQuestion = new Questions(question,answer);
            addQuestion(newQuestion);
            
        }
        
    }
    
    /**
     * A method to add the question to the list
     * @param q The Question q the will be added to the list
     */
    public void addQuestion(Questions q)
    {
        arrayOfQuestion.add(q);
    }
    
    /**
     * A method that print out the number of Question
     * @return the size of the list
     */
    public int getSize()
    {
        return arrayOfQuestion.size();
    }
}
