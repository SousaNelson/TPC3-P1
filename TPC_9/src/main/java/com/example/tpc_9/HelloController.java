package com.example.tpc_9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class HelloController {
    @FXML
    private Label loginMessagelabel;
    @FXML
    private Button cancelButton;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordPasswordField;
    @FXML
    private Label welcomeText;

    public void loginButtonOnAction(ActionEvent e){

        if (usernameTextField.getText().isBlank()==false && passwordPasswordField.getText().isBlank()==false){
            loginMessagelabel.setText("You try to login!");
            validateLogin();
        } else {
            loginMessagelabel.setText("Please enter username and password.");
        }
    }

    public void cancelButtonOnAction(ActionEvent e){
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    public void validateLogin(){
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDB = connectNow.getConnection();
        String verifyLogin = "SELECT COUNT(1) FROM useraccounts WHERE Username = '"+usernameTextField.getText().isBlank()+"' AND Password = '"+passwordPasswordField.getText()+"'";

        try {
            Statement statement = connectDB.createStatement();
            ResultSet queryResult = statement.executeQuery(verifyLogin);

            while (queryResult.next()){
                if (queryResult.getInt(1)==1){
                    loginMessagelabel.setText("Welcome!");
                } else {
                    loginMessagelabel.setText("Invalid Login. Please try again");
                }
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }

}