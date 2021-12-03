package UserInterface;

import java.io.IOException;

import application.FmxlPageLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class QuizSettingsController {

	/**
	 * Sample Skeleton for 'QuizSettings.fxml' Controller Class
	 */

	    @FXML // fx:id="PreviousButton"
	    private Button PreviousButton; // Value injected by FXMLLoader

	    @FXML // fx:id="QuizSettingsLabel"
	    private Label QuizSettingsLabel; // Value injected by FXMLLoader

	    @FXML // fx:id="applySettingsButton"
	    private Button applySettingsButton; // Value injected by FXMLLoader

	    @FXML // fx:id="maxPointsTextField"
	    private TextField maxPointsTextField; // Value injected by FXMLLoader

	    @FXML // fx:id="numQuestionsTextField"
	    private TextField numQuestionsTextField; // Value injected by FXMLLoader

	    @FXML // fx:id="numTeamsTextField"
	    private TextField numTeamsTextField; // Value injected by FXMLLoader

	    @FXML // fx:id="timeLimitTextField"
	    private TextField timeLimitTextField; // Value injected by FXMLLoader

		public void applySettings(ActionEvent event) throws IOException {
			//change the scene
			application.FmxlPageLoader window = new FmxlPageLoader("addQuestion.fxml");
			window.setPrimaryStage();
			
		}

	
}
