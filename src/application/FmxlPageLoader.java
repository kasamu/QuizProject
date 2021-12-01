package application;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class FmxlPageLoader {
	
	//declare file location url name history;
	private static DLLFileUrl fileHistory;
	
	//declare file location url name
	private static String fileUrl;
	
	//declaring a loader class
	private static FXMLLoader loader;
	
	//declare root file
	private static Parent root;
	
	//declaring the scene
	private static Scene scene;
	
	//declare the stage
	private static Stage primaryStage;
	
	//declaring the back form
	private static String backFile = null;
	
	//declaring the forward form;
	private static String forwardFile = null;
	
	
	public FmxlPageLoader(String inFileUrl) {
		
		insertInFileHistory(inFileUrl);
		
		setFileUrl();
		
		init();
		
	}
	
	public FmxlPageLoader(Stage stageIn) {
		
		fileUrl = "HomeView.fxml";
		
		createFileHistory("HomeView.fxml");
		
		primaryStage = stageIn;
		
		init();
		
	}
	
	public FmxlPageLoader() {
		
	}
	
	public void show() {
		
		// Show the primary Stage (window)
		primaryStage.show();
		
	}
	
	public void init() {
		
		setRoot();
		
		setScene();
		
	}
	
	public void setScene() {
		
		scene = new Scene(root, 1000,800);
		
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	}
	
	public void setRoot() {
		
		try {
			
			setLoader();
			root = FmxlPageLoader.loader.load();
			
		}catch (IOException e) {
			
			System.out.println("THE ROOT URL IS NOT FUCTIONING PROPERLY");
			e.printStackTrace();
		
		}
		
	}
		
	public void setFileUrl(String infileUrl) {
		
		FmxlPageLoader.fileUrl = infileUrl;
		
	}
	
	public void setFileUrl() {
		
		FmxlPageLoader.fileUrl = FmxlPageLoader.fileHistory.getCurrentNode().getFileUrl();
		
	}
	
	public String getFileUrl() {
		
		setBackFile();
		setForwardFile();
		return fileUrl;
	
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
		primaryStage.setTitle("Quiz Trivial System");
		System.out.println("Complete.");
		getFileHistory().display();
	}

	public FXMLLoader getLoader() {
		
		return loader;
	}

	public void setLoader() {
		
		FmxlPageLoader.loader = new FXMLLoader();
		FmxlPageLoader.loader.setLocation((getClass().getResource("/UserInterface/" + getFileUrl())));
		System.out.println("Loading Page ....");
		
	}
	
	
	public void getBackFile() {
		
		if(backFile != null) {
			getFileHistory().setCurrentNode(fileHistory.getCurrentNode().getPrevious());
			setFileUrl(backFile);
			System.out.println("BackFile: " + backFile);
			
			init();
		}
		
		
	}

	public void setBackFile() {
		
		if(getFileHistory().getCurrentNode().getPrevious() != null)
			FmxlPageLoader.backFile = getFileHistory().getCurrentNode().getPrevious().getFileUrl();
		
		return;
		
	}

	public void getForwardFile() {
		
		if(forwardFile == getFileHistory().getCurrentNode().getFileUrl())
			forwardFile = null;
		
		if(forwardFile != null) {
			getFileHistory().setCurrentNode(fileHistory.getCurrentNode().getNext());
			setFileUrl(forwardFile);
			System.out.println("forwardFile: " + forwardFile);
			
		}
		
		
		
		init();
		
		
	}

	public void setForwardFile() {
		
		if(getFileHistory().getCurrentNode().getNext() != null)
			FmxlPageLoader.forwardFile = getFileHistory().getCurrentNode().getNext().getFileUrl();
		
		return;
		
	}

	/**
	 * @return the fileHistory
	 */
	public DLLFileUrl getFileHistory() {
		
		return FmxlPageLoader.fileHistory;
	
	}

	
	public void createFileHistory(String inFileUrl) {
		
		FmxlPageLoader.fileHistory = new DLLFileUrl(inFileUrl);
		
	}
	
	public void insertInFileHistory(String inFileUrl) {
		
		FmxlPageLoader.fileHistory.insert(inFileUrl);
	}

}
