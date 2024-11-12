/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package Controller;


import Model.MYSQLDatabaseOP;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/View/Root/Root.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Student Management System!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        
        String URL = "jdbc:mysql://localhost:3306";
        String USERNAME = "root";
        String PASSWORD = "";
        
        MYSQLDatabaseOP dbOp = new MYSQLDatabaseOP(URL, USERNAME, PASSWORD);

        try {
            
            dbOp.handleQuery("vugijugi", "SELECT NAME FROM students");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
    
        launch(args);
    }
    
}
