package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainWindow extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Master Calculator");
		primaryStage.setWidth(500);
		primaryStage.setHeight(325); //325로 해야함  맨위에 타이틀창 height가 25임
		primaryStage.setResizable(false);
		
		Parent root = FXMLLoader.load(getClass().getResource("Engineering.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}