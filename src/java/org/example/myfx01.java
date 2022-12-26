package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class myfx01 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane pane = new StackPane();
        Button button = new Button("OK");
        pane.getChildren().add(button);
        Scene scene = new Scene(pane,200,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("hello");
        primaryStage.show();

    }
}
