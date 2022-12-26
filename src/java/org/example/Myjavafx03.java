package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Myjavafx03 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane pane = new StackPane();
        Button button = new Button("OK");
        button.setStyle("-fx-border-color:blue");
        pane.getChildren().add(button);
        pane.setRotate(45);
        pane.setStyle("-fx-border-color: red;-fx-background-color: gray;");
        Scene scene = new Scene(pane,200,250);
        primaryStage.setTitle("node");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
