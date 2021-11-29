package UserInterface;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import javafx.scene.layout.Pane;

public class SignInViewController {
	
	@FXML
	private Pane Pane;
	
	@FXML
	private TextArea UserId;
	
	@FXML
	private TextArea Password;
	
	@FXML
	private Button LogIn;
	
	@FXML
	private Label Message;
	
	@FXML // fx:id="Forward"
	private Button Forward; // Value injected by FXMLLoader

	@FXML // fx:id="Previous"
	private Button Previous; // Value injected by FXMLLoader


}
