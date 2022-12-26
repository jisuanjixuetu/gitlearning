package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Myjavafx02 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.BLUE);
        Button button = new Button("OK");
        pane.getChildren().add(button);
        pane.getChildren().add(circle);
        Scene scene = new Scene(pane,200,200);
        primaryStage.setTitle("circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
