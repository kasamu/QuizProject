package UserInterface;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import application.FmxlPageLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class SignInViewController implements Initializable{
	
	private application.FmxlPageLoader window;
	
	//@FXML
    private AnchorPane AnchorPane;
	
	@FXML
	private TextField UserId;
	
	@FXML
	private PasswordField Password;
	
	@FXML
	private Button LogIn;
	
	@FXML
	private Label Message;
	
	@FXML // fx:id="Forward"
	private Button Forward; // Value injected by FXMLLoader

	@FXML // fx:id="Previous"
	private Button Previous; // Value injected by FXMLLoader
	
	
	public void previous(ActionEvent event) throws IOException {
		
		//go to the previous scene
		window.getBackFile();
		window.setPrimaryStage();
	}
	
	public void forward(ActionEvent event) throws IOException {
		
		//go to the next scene
		window.getForwardFile();
		window.setPrimaryStage();
		
	}
	
	public void logIn(ActionEvent event)throws IOException{
		
		//declare varables
		boolean valid = true; //set to false;
		
		//check that the account is valid as either an instructor or contestant
		
		if(HomeViewController.getPerson() == "contestant") {
			window = new FmxlPageLoader("ContestantDashBoard.fxml");
			window.setPrimaryStage();
		}
		else {
			window = new FmxlPageLoader("QuizSettings.fxml");
			window.setPrimaryStage();  
		}
	}

	public void message(ActionEvent event)throws IOException{
		
		//set the text to the meassage sent from the account
		Message.setText("!! Wrong Password");
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		//initialise window.
		window = new FmxlPageLoader();
		//SignInViewController controller = window.getLoader().getController();
		
	}


}
