package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MyJavaFx23 extends Application {
    private Circle circle= new Circle(60);
    private Rectangle rectangle = new Rectangle(120,120);
    private StackPane pane = new StackPane();
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        circle.setFill(Color.GRAY);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        pane.getChildren().addAll(circle,rectangle);
        Scene scene = new Scene(pane,140,140);
        primaryStage.setTitle("ResizableCircleRectangle");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    private void resize(){
        double length = Math.min(pane.getWidth(), pane.getHeight());
        circle.setRadius(length/2-15);
        rectangle.setWidth(length-30);
        rectangle.setHeight(length-30);
    }
}
