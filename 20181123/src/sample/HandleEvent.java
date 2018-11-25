package sample;/**
 * Created by Qwhying on 2018/11/25
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class HandleEvent extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox pane =new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button btOK=new Button("OK");
        Button btCancel=new Button("Cancel");
        OKHandlerClass handler1=new OKHandlerClass();
        btOK.setOnAction(handler1);
        CancelHandlerClass handler2=new CancelHandlerClass();
        btCancel.setOnAction(handler2);
        pane.getChildren().addAll(btOK,btCancel);
        //Create a scene and place it in the stage
        Scene scene=new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("HandleEvent");
        primaryStage.show();

    }
}
class OKHandlerClass implements EventHandler<ActionEvent>{
    @Override
    public void handle(ActionEvent e)
    {
        System.out.println("OK button clicked");
    }
}
class CancelHandlerClass implements  EventHandler<ActionEvent>{
    @Override
    public void handle(ActionEvent e)
    {
        System.out.println("Cancel button clicked");
    }
}
