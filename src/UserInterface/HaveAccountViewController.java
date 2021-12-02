package UserInterface;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import application.FmxlPageLoader;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.*;
import javafx.fxml.Initializable;

/*
 * question to register or sign in view Controller class
 * 
 * @author Kabir Asamu
 */

public class HaveAccountViewController implements Initializable {

    private application.FmxlPageLoader window;
	
	@FXML
    private AnchorPane AnchorPane;

    @FXML
    private Button Register;

    @FXML
    private Button SignIn;
    
    @FXML // fx:id="Forward"
	private Button Forward; // Value injected by FXMLLoader

	@FXML // fx:id="Previous"
	private Button Previous; // Value injected by FXMLLoader

	public void signIn(ActionEvent event) throws IOException {
		//change the scene
		window = new FmxlPageLoader("SignInView.fxml");
		window.setPrimaryStage();
	}
	
	public void register(ActionEvent event) throws IOException {
		
		//change the scene
		window = new FmxlPageLoader("RegisterView.fxml");
		window.setPrimaryStage();
	}
	
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
