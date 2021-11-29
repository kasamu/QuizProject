package UserInterface;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.fxml.Initializable;

/*
 * question to register or sign in view Controller class
 * 
 * @author Kabir Asamu
 */

public class HaveAccountViewController implements Initializable {

    //@FXML
    //private AnchorPane AnchorPane;

    @FXML
    private Button Register;

    @FXML
    private Button SignIn;
    
    @FXML // fx:id="Forward"
	private Button Forward; // Value injected by FXMLLoader

	@FXML // fx:id="Previous"
	private Button Previous; // Value injected by FXMLLoader

	public void signIn(ActionEvent event) throws IOException {
		//declare haveAccountView and connect it.
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/SignInView.fxml"));
		Parent signInView = loader.load();
				
		//getting the controller for the have account scene
		SignInViewController controller = loader.getController();		
				
		//set scene
		Scene signInViewScene = new Scene(signInView);
				
		//set and print stage
		Stage primaryStage = new Stage();
		primaryStage.setScene(signInViewScene);
		primaryStage.show();
	}
	
	public void register(ActionEvent event) throws IOException {
		//declare haveAccountView and connect it.
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("/SignInView.fxml"));
		Parent registerView = loader.load();
				
		//getting the controller for the have account scene
		//RegisterViewController controller = loader.getController();		
				
		//set scene
		Scene registerViewScene = new Scene(registerView);
				
		//set and print stage
		Stage primaryStage = new Stage();
		primaryStage.setScene(registerViewScene);
		primaryStage.show();
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
