package sample;/**
 * Created by Qwhying on 2018/11/24
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Circle circle=new Circle();
        circle.setCenterX(200);
        circle.setCenterY(200);
        circle.setRadius(100);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.GOLDENROD);

        //create a pane to hold the circle
        Pane pane=new Pane();
        pane.getChildren().add(circle);
        //create a scene and place it in the stage
        Scene scene=new Scene(pane,400,400);
        primaryStage.setTitle("ShowCircle");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
