module QuizProject {
	requires java.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
	opens UserInterface to javafx.graphics, javafx.fxml;
	
	exports UserInterface;
}
