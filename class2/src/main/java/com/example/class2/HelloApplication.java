package com.example.class2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Group root = new Group();
        Scene scene = new Scene(root, Color.valueOf("#9d7bc7"));

        stage.setWidth(500);
        stage.setHeight(500);
        //  stage.setResizable(false); //does not allow stage to change size
        stage.setX(100);  //sets starting point of stage
        stage.setY(100);

     /*   stage.setFullScreen(true); //Full Screen mode
        stage.setFullScreenExitHint("Press p to escape"); //Text at full screen, gives hint to escape
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("p")); //Set escape button
       */

        //TEXT
        Text text = new Text();
        text.setText("Hello Students");
        text.setX(100);
        text.setY(100);
        text.setFont(Font.font("Times New Roman",25));
        text.setFill(Color.WHITESMOKE);

        root.getChildren().add(text); //Adds TEXT node to root

        //LINE
        Line line = new Line();
        line.setStartX(250);
        line.setStartY(250);
        line.setEndX(300);
        line.setEndY(300);
        line.setStrokeWidth(10); //Sets thickness of line
        line.setStroke(Color.RED); //Sets color of line
        line.setOpacity(0.6); // Sets transparency of line
        line.setRotate(30); //Rotates line

        root.getChildren().add(line);

        //RECTANGLE
        Rectangle rect = new Rectangle();
        rect.setX(200);
        rect.setY(200);
        rect.setWidth(50);
        rect.setHeight(100);
        rect.setFill(Color.BLUE); //Colors rectangle
        rect.setStrokeWidth(5); //Border width
        rect.setStroke(Color.WHITE); //Border color

        root.getChildren().add(rect);

        //CIRCLE
        Circle circle = new Circle();
        double X = 200;
        double Y = 200;
        circle.setCenterX(X);
        circle.setCenterY(Y);
        circle.setRadius(25);
        circle.setFill(Color.YELLOW);
        circle.setStrokeWidth(5);
        circle.setStroke(Color.WHITESMOKE);

        root.getChildren().add(circle);

        //BUTTON
        Button button = new Button();
        button.setText("Change Scene");
        button.setLayoutX(100);
        button.setLayoutY(400);

        root.getChildren().add(button);

        Group rt2 = new Group();
        Scene scene2 = new Scene(rt2);

        //Set button action using lambda expression
        button.setOnAction(e -> {
            stage.setScene(scene2); } //Scene does not change
        );



        Image icon = new Image("C:\\Users\\student\\Desktop\\AOOP D\\Class 2\\Basic\\src\\icon.jpg");
        stage.getIcons().add(icon);

        /*
        IMAGE
        ImageView image = new ImageView(icon); //Pass the image object, make image object similarly as done in icon
        image.setX(10);
        image.setY(150);
        image.setFitWidth(150);
        image.setFitHeight(150);

        root.getChildren().add(image); */


        stage.setTitle("HELLO WORLD");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}