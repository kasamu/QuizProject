package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			
			//declare root file
			Parent root = FXMLLoader.load(getClass().getResource("/UserInterface/HomeView.fxml"));
			
			// JavaFX  Scene (window content) inside a primaryStage (window)
			Scene scene = new Scene(root, 1000,800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Quiz Trivial System");
			primaryStage.setScene(scene);
			
			// Show the primary Stage (window)
			primaryStage.show();
			
			
		} catch (Exception e) {
			//print stack
			
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
