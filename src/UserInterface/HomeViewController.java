package UserInterface;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

import application.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.Parent;
import javafx.scene.Scene;


/*
 * Home view Controller class
 * 
 * @author Kabir Asamu
 */
public class HomeViewController implements Initializable{
	
	@FXML // fx:id="AnchorPane"
    private AnchorPane AnchorPane;
	
	@FXML // fx:id="contestant"
	private Button contestant;
	
	
	@FXML // fx:id="instructor"
	private Button instructor;
	
	
	public void click(ActionEvent event) throws IOException {
		
		/*application.FmxlPageLoader page = new FmxlPageLoader();
		
		page.setFileUrl("HaveAccountView.fxml");
		page.setRoot();
		page.setScene();
		
		*/
		//declare haveAccountView and connect it.
		FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("HaveAccountView.fxml"));
		Parent haveAccountView = loader.load();
		
		//getting the controller for the have account scene
		HaveAccountViewController controller = loader.getController();		
		
		//set scene
		Scene haveAccountViewScene = new Scene(haveAccountView);
		
		//set and print stage
		Stage primaryStage = new Stage();
		primaryStage.setScene(haveAccountViewScene);
		primaryStage.show();
		
	}
	
	/*
	 * initialise the controller for the home view 
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
	
	
}
