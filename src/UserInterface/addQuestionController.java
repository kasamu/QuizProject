/**
 * Sample Skeleton for 'addQuestion.fxml' Controller Class
 */

package UserInterface;

import java.io.IOException;

import application.FmxlPageLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class addQuestionController {

	private application.FmxlPageLoader window;
	
    @FXML // fx:id="clearButton"
    private Button clearButton; // Value injected by FXMLLoader

    @FXML // fx:id="correctOptionTextField"
    private TextField correctOptionTextField; // Value injected by FXMLLoader

    @FXML // fx:id="makeQuizLabel"
    private Label makeQuizLabel; // Value injected by FXMLLoader

    @FXML // fx:id="option1TextField"
    private TextField option1TextField; // Value injected by FXMLLoader

    @FXML // fx:id="option2TextField"
    private TextField option2TextField; // Value injected by FXMLLoader

    @FXML // fx:id="option3TextField"
    private TextField option3TextField; // Value injected by FXMLLoader

    @FXML // fx:id="option4TextField"
    private TextField option4TextField; // Value injected by FXMLLoader

    @FXML // fx:id="previousButton"
    private Button previousButton; // Value injected by FXMLLoader

    @FXML // fx:id="questionTextField"
    private TextField questionTextField; // Value injected by FXMLLoader
    
    @FXML
    private Text textQuesNumber;

    @FXML // fx:id="saveAndNextButton"
    private Button saveAndNextButton; // Value injected by FXMLLoader
    
    private int count = 0;
    
    
    public void saveAndNext(ActionEvent event) throws IOException {
		//change the scene
    	count++;
    	
    	while(count < QuizSettingsController.totalQues()) {
	    
		textQuesNumber.setText("" + (count + 1));
    	}
		
	}

}

