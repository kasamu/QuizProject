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
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.control.MenuButton;

public class ContestantDashBoardController implements Initializable{
	
	private application.FmxlPageLoader window;
	
	//@FXML
    private AnchorPane AnchorPane;

	
	@FXML
    private Pane DashboardPane;
	 
	@FXML
	private Button Competition;

	@FXML
	private Button Forward;

	@FXML
	private MenuItem LogOut;

	@FXML
	private Label Name;

	@FXML
	private Button Practice;

	@FXML
	private Button Previous;

	@FXML
	private Button Quiz;

	@FXML
	private Button Team;

	@FXML
	private Button UserInformation;

	@FXML
	private MenuButton menu;

	@FXML
	private MenuItem settingsId;
	
	public void previous(ActionEvent event) throws IOException {
		
		//go to the previous scene
		window.getBackFile();
		window.setPrimaryStage();
	}
	
	public void userInformation(ActionEvent event) throws IOException{
		
		String background = UserInformation.getStyle(); 
		
		System.out.println(background);
		System.out.println(Previous.getStyle());
		
		if (!(background.equals(Previous.getStyle()))) {
			UserInformation.setStyle("-fx-background-color: white; -fx-font-weight: 900;");
			
		}else {
			UserInformation.setStyle("-fx-background-color: darkgrey; -fx-font-weight: 900;");
		}
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
		
		Previous.setStyle("-fx-background-color: white; -fx-font-weight: 900;");
	}
}

