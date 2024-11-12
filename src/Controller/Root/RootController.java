/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller.Root;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Sakib
 */
public class RootController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private void addStudent(){
    try{
        Parent pane = FXMLLoader.load(getClass().getResource("/View/AddStudent/AddStudent.fxml"));
        mainContent.getChildren().setAll(pane);
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
    @FXML
    private void showAllStudent(){
    try{
        Parent pane = FXMLLoader.load(getClass().getResource("/View/AllStudent/AllStudent.fxml"));
        mainContent.getChildren().setAll(pane);
        }catch(IOException ex){
            System.out.println(ex);
        }
    }
        @FXML
    private VBox mainContent;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try{
        Parent pane = FXMLLoader.load(getClass().getResource("/View/AddStudent/AddStudent.fxml"));
        mainContent.getChildren().add(pane);
        }catch(IOException ex){
            System.out.println(ex);
        }
    }    
    
}
