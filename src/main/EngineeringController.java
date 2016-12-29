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

public class EngineeringController implements Initializable {
	// ��) @FXML private Button btnLogin;
	@FXML private Button btnMilitary;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// ��) btnLogin.setOnAction(e->handleBtnLogin(e));
	}
/* ��)  public void handleBtnLogin(ActionEvent event) {
	 * try {
	 * �̺�Ʈ ����
	 * ��} catch(Exception e) {
	 * e.printStackTrace();
	 }
	}
  */
	public void handleBtnMilitary(ActionEvent event) {
		try { // ������ ���� ���� (�߰�)
			Parent military = FXMLLoader.load(getClass().getResource("Military.fxml"));
			StackPane root = (StackPane) btnMilitary.getScene().getRoot();
			root.getChildren().add(military);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void handleBtnSubject(ActionEvent event) {
		try { // ���� ����� ���� (�߰�)
			Parent subject = FXMLLoader.load(getClass().getResource("SubjectTest.fxml"));
			StackPane root2 = (StackPane) btnMilitary.getScene().getRoot();
			root2.getChildren().add(subject);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void handleBtnSaving(ActionEvent event) {
		try { // ���� ����� ���� (�߰�)
			Parent saving = FXMLLoader.load(getClass().getResource("SavingTest.fxml"));
			StackPane root3 = (StackPane) btnMilitary.getScene().getRoot();
			root3.getChildren().add(saving);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
