package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import zhanshi11.BallPane;

public class MyJavaFx31 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BallPane ballPane = new BallPane();
        ballPane.setOnMousePressed(e->ballPane.pause());
        ballPane.setOnMouseReleased(e-> ballPane.play());
        ballPane.setOnKeyPressed(e->{
            if(e.getCode()== KeyCode.UP){
                ballPane.increaseSpeed();
            } else if (e.getCode() == KeyCode.DOWN) {
                ballPane.increaseSpeed();
            }
        });
        Scene scene = new Scene(ballPane,250,150);
        primaryStage.setTitle("BounceBallControl");
        primaryStage.setScene(scene);
        primaryStage.show();
        ballPane.requestFocus();
    }
}
