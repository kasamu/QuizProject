package application;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public final class FmxlPageLoader {
	
	//set file location url;
	private static String fileUrl;
	
	//declare root file
	private static Parent root;
	
	//declaring the scene
	private static Scene scene;
	
	//declare the stage
	private static Stage primaryStage;
	
	
	public FmxlPageLoader() {
		
		fileUrl = "HomeView.fxml";
		
		setRoot();
		
		setScene();
		
		setPrimaryStage();
		
	}
	
	public void setScene() {
		
		scene = new Scene(root, 1000,800);
		
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	}
	
	public void setRoot() {
		
		try {
			
			root = FXMLLoader.load(getClass().getResource("/UserInterface/" + fileUrl));
		
		}catch (IOException e) {
			
			System.out.println("THE ROOT URL IS NOT FUCTIONING PROPERLY");
			e.printStackTrace();
		
		}
		
	}
		
	public void setFileUrl(String fileUrl) {
			
		FmxlPageLoader.fileUrl = fileUrl;
	}
	
	public Parent getRoot() {
		
		return FmxlPageLoader.root;
	}
	
	public Scene getScene() {
		
		return FmxlPageLoader.scene;
	}

	public Stage getPrimaryStage() {
		
		return primaryStage;
	}

	public void setPrimaryStage() {
		
		// JavaFX  Scene (window content) inside a primaryStage (window)
		primaryStage.setScene(FmxlPageLoader.scene);
	}
}
