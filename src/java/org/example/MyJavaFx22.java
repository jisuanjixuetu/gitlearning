package org.example;

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.stage.Stage;

public class MyJavaFx22 extends Application {

    public static void main(String[] args) {
        DoubleProperty balance = new SimpleDoubleProperty();
        balance.addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                System.out.println("The new value is "+balance.doubleValue());
            }
        });
        balance.set(4.5);
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
    }
}
