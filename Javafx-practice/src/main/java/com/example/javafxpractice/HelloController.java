package com.example.javafxpractice;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
    private Label showlabel;

    @FXML
    private TextField input1;

    @FXML
    private TextField input2;
}