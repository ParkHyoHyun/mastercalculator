package main;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

public class SubjecttestController implements Initializable {
	@FXML private Button HoHo;
	@FXML private BorderPane test;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}

	public void handleBtnEngineering(ActionEvent event) {
		try {  // 공학용 계산기 돌아가는 Engineering 메뉴 버튼 (제거)
			//StackPane root = (StackPane) HoHo.getScene().getRoot();
			//root.getChildren().remove(test);
			 // 공학용 계산기로 들어가기 (추가)
			Parent engineering = FXMLLoader.load(getClass().getResource("Engineering.fxml"));
			StackPane root = (StackPane) HoHo.getScene().getRoot();
			root.getChildren().add(engineering);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void handleBtnMilitary(ActionEvent event) {
		try { // 군전역 계산기 들어가기 (추가)
			Parent military = FXMLLoader.load(getClass().getResource("Military.fxml"));
			StackPane root2 = (StackPane) HoHo.getScene().getRoot();
			root2.getChildren().add(military);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void handleBtnSaving(ActionEvent event) {
		try { // 적금 계산기로 들어가기 (추가)
			Parent saving = FXMLLoader.load(getClass().getResource("SavingTest.fxml"));
			StackPane root3 = (StackPane) HoHo.getScene().getRoot();
			root3.getChildren().add(saving);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
		
}
