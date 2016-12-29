package main;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class SavingtestController implements Initializable {
	@FXML private Button savBtn;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

	public void handleBtnEngineering(ActionEvent event) {
		try{ // 공학용 계산기 들어가기 (추가)
			Parent engineering = FXMLLoader.load(getClass().getResource("Engineering.fxml"));
			StackPane root = (StackPane) savBtn.getScene().getRoot();
			root.getChildren().add(engineering);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void handleBtnMilitary(ActionEvent event) {
		try { // 군전역 계산기 들어가기 (추가)
			Parent military = FXMLLoader.load(getClass().getResource("Military.fxml"));
			StackPane root2 = (StackPane) savBtn.getScene().getRoot();
			root2.getChildren().add(military);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void handleBtnSubject(ActionEvent event) {
		try { // 학점 계산기로 들어가기 (추가)
			Parent subject = FXMLLoader.load(getClass().getResource("SubjectTest.fxml"));
			StackPane root3 = (StackPane) savBtn.getScene().getRoot();
			root3.getChildren().add(subject);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
