package UserInterface;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import application.FmxlPageLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.CheckBox;

public class RegisterViewController implements Initializable{
	
	private application.FmxlPageLoader window;
	
	@FXML
	private AnchorPane AnchorPane;
	
	@FXML
	private TextField Name;
	
	@FXML
	private Button RegisterMe;
	
	@FXML
	private TextField Email;
	
	@FXML
	private TextField Password1;
	
	@FXML
	private TextField Password2;
	
	@FXML
	private CheckBox Instructor;
	
	@FXML
	private CheckBox Contestant;
	
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
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		//initialise window.
		window = new FmxlPageLoader();
		
	}


}
