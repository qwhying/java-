package sample;/**
 * Created by Qwhying on 2018/11/25
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.text.*;

//import java.awt.*;

public class FontDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane=new StackPane();
        Circle circle=new Circle();
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(new Color(0.5,0.5,0.5,0.1));
        //pane.getChildren().add(circle);
        Label label=new Label("JavaFX");
        label.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,20));
        //pane.getChildren().add(label);
        pane.getChildren().addAll(circle,label);
        Scene scene=new Scene(pane);
        primaryStage.setTitle("FontDemo");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
