package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Myjavafx15 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ClockPane clock = new ClockPane();
        String timeString = clock.getHour()+":"+ clock.getMinute()+":"+ clock.getSecond();
        Label currentTime = new Label(timeString);
        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane.setBottom(currentTime);
        BorderPane.setAlignment(currentTime, Pos.TOP_CENTER);
        Scene scene = new Scene(pane,250,250);
        primaryStage.setTitle("showClock");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

