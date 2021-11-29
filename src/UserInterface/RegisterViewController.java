package UserInterface;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;

import javafx.scene.control.Label;

import javafx.scene.layout.AnchorPane;

import javafx.scene.control.CheckBox;

public class RegisterViewController {
	
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

}
