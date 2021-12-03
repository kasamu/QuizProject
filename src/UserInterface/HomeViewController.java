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
	
	@FXML
	private String person;
	
	
	public void click(ActionEvent event) throws IOException {
		//change the scene
		if(event.getSource() == contestant) {
		    application.FmxlPageLoader window = new FmxlPageLoader("HaveAccountView.fxml");
		    window.setPrimaryStage();
		}
		
	}
	
	/*
	 * initialise the controller for the home view 
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		//contestant;
		//instructor;
		
	}
	
	
}
