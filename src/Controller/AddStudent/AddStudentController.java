/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller.AddStudent;

import Controller.AddStudentData;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AddStudentController implements Initializable {

    private void clearInput() {
        studentName.setText("");
        studentEmail.setText("");
        department.setText("");
        address.setText("");
    }

    @FXML
    private TextField studentName;
    @FXML
    private TextField studentEmail;
    @FXML
    private TextField department; 
    @FXML
    private TextArea address;

    public static ObservableList<AddStudentData> stdList = FXCollections.observableArrayList();
    @FXML
    private void saveButtonAction() {
        AddStudentData saveData = new AddStudentData(studentName.getText(), studentEmail.getText(), department.getText(), address.getText());
        System.out.println(saveData.toString());
        stdList.add(saveData);
        clearInput();
    }

    @FXML
    private void resetButtonAction() {
        clearInput();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
