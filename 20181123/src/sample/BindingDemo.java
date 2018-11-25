package sample;/**
 * Created by Qwhying on 2018/11/24
 */

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class BindingDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        DoubleProperty d1=new SimpleDoubleProperty(1);
        DoubleProperty d2=new SimpleDoubleProperty(2);
        DoubleProperty d3=new SimpleDoubleProperty(3);
        DoubleProperty d4=new SimpleDoubleProperty(4);
        d3.bind(d1);
        d3.bind(d4);
        System.out.println("d1 is"+d1.getValue()+"and d2 is "+d2.getValue());
        d2.setValue(70.2);
        System.out.println("d1 is"+d1.getValue()+"and d2 is "+d2.getValue());
        d1.bindBidirectional(d2);
        d1.setValue(23);
        System.out.println("d1 is"+d1.getValue()+"and d2 is "+d2.getValue());
        d2.setValue(9);
        System.out.println("d1 is"+d1.getValue()+"and d2 is "+d2.getValue());
        d1.setValue(12);
        System.out.println("d3 is"+d3.getValue()+"and d4 is "+d4.getValue());


    }
}
