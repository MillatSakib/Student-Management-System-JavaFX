/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package View.AllStudent;

import Controller.AddStudent.AddStudentController;
import Controller.AddStudentData;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Sakib
 */
public class AllStudentController implements Initializable {

    @FXML
    private TableColumn<AddStudentData, String> nameColl;
    @FXML
    private TableColumn<AddStudentData, String> emailColl;
    @FXML
    private TableColumn<AddStudentData, String> depertmentColl;
    @FXML
    private TableColumn<AddStudentData, String> addressColl;
    @FXML
    private TableView<AddStudentData> studentTable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        studentTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        nameColl.setCellValueFactory(new PropertyValueFactory<AddStudentData, String>("name"));
        emailColl.setCellValueFactory(new PropertyValueFactory<AddStudentData, String>("email"));
        depertmentColl.setCellValueFactory(new PropertyValueFactory<AddStudentData, String>("department"));
        addressColl.setCellValueFactory(new PropertyValueFactory<AddStudentData, String>("address"));
        studentTable.setItems(AddStudentController.stdList);
    }    
    
}
