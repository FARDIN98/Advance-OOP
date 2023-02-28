package com.example.javafxpractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private void add(){
        String s1 = input1.getText();
        String s2 = input2.getText();

        double result = Double.parseDouble(s1) + Double.parseDouble(s2);
        showlabel.setText(result + "");
    }

    @FXML
    private void multiply(){
        String s3 = input1.getText();
        String s4 = input2.getText();

        double res = Double.parseDouble(s3) * Double.parseDouble(s4);
        showlabel.setText(res + "");
    }

    @FXML
    private void changeScene(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("sample2.fxml"));
        Scene tableViewScene = new Scene(parent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }


    @FXML
    private Label showlabel;

    @FXML
    private TextField input1;

    @FXML
    private TextField input2;
}