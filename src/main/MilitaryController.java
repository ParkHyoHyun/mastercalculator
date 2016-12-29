package main;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

public class MilitaryController implements Initializable {
	
	@FXML private BorderPane military;
	@FXML private Button BtnCommute;
	@FXML private Button BtnReset;
	@FXML private ProgressBar commuteProbar;
	@FXML private Text resetText;
	@FXML private Text commuteText1;
	@FXML private Label commuteLabel1;
	@FXML private Label commuteLabel2;
	@FXML private Label commuteLabel3;
	@FXML private Label commuteLabel4;
	@FXML private Label commuteLabel5;
	@FXML private Label commuteLabel6;
	@FXML private Label commuteLabel7;
	@FXML private Label commuteLabel8;
	@FXML private ComboBox ComboBox;
	@FXML private TextField InDate;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		BtnCommute.setOnAction(event->handleBtnCommute(event)); // ��� ��ư
		BtnReset.setOnAction(event->handleBtnReset(event));    // ���� ��ư
	}

	/* ��)  public void handleBtnLogin(ActionEvent event) {
	 * try {
	 * �̺�Ʈ ����
	 * ��} catch(Exception e) {
	 * e.printStackTrace();
	 }
	}
  */
	// �ٸ� ����� �̵��ϴ� �ҽ�
	public void handleBtnEngineering(ActionEvent event) {
		try {  /* ���п� ���� ���ư��� Engineering �޴� ��ư (����)
			StackPane root = (StackPane) commuteBtn.getScene().getRoot();
			root.getChildren().remove(military);*/
			  // ���п� ����� ����  (�߰�)
			Parent engineering = FXMLLoader.load(getClass().getResource("Engineering.fxml"));
			StackPane root = (StackPane) BtnCommute.getScene().getRoot();
			root.getChildren().add(engineering);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void handleBtnSubject(ActionEvent event) {
		try { // ���� ����� ���� (�߰�)
			Parent subject = FXMLLoader.load(getClass().getResource("SubjectTest.fxml"));
			StackPane root2 = (StackPane) BtnCommute.getScene().getRoot();
			root2.getChildren().add(subject);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void handleBtnSaving(ActionEvent event) {
		try { // ���� ����� ���� (�߰�)
			Parent saving = FXMLLoader.load(getClass().getResource("SavingTest.fxml"));
			StackPane root3 = (StackPane) BtnCommute.getScene().getRoot();
			root3.getChildren().add(saving);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// ��� ��ư �ҽ� (UI ����)
	public void handleBtnCommute(ActionEvent event) {
		try {
			resetText.setVisible(false);
			commuteText1.setVisible(true);
			commuteLabel1.setVisible(true);
			commuteLabel2.setVisible(true);
			commuteLabel3.setVisible(true);
			commuteLabel4.setVisible(true);
			commuteLabel5.setVisible(true);
			commuteLabel6.setVisible(true);
			commuteLabel7.setVisible(true);
			commuteLabel8.setVisible(true);
			commuteProbar.setVisible(true);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	// ���� ��ư �ҽ� (UI ����)
	public void handleBtnReset(ActionEvent event) {
		try {
			resetText.setVisible(true);
			commuteText1.setVisible(false);
			commuteLabel1.setVisible(false);
			commuteLabel2.setVisible(false);
			commuteLabel3.setVisible(false);
			commuteLabel4.setVisible(false);
			commuteLabel5.setVisible(false);
			commuteLabel6.setVisible(false);
			commuteLabel7.setVisible(false);
			commuteLabel8.setVisible(false);
			commuteProbar.setVisible(false);
			ComboBox.setValue("���� ����");
			InDate.setText(""); // �Է� ���� ��ĭ���� ����� PromptText�� ����� ��
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
