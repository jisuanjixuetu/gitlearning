package org.example;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;


public class Myjavafx14 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new MyEllipse(),400,400);
        primaryStage.setTitle("showPolygon");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
class MyPolygon extends Pane {
    private void paint() {
        Polygon polygon = new Polygon();
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);
        ObservableList<Double> list = polygon.getPoints();
        double centerX = getWidth() / 2, centerY = getHeight() / 2;
        double radius = Math.min(getWidth(), getHeight()) * 0.4;
        for (int i = 0; i < 6; i++) {
            list.add(centerX + radius * Math.cos(2 * i * Math.PI / 6));
            list.add(centerY - radius * Math.sin(2 * i * Math.PI / 6));
        }
        getChildren().clear();
        getChildren().add(polygon);
    }
    public void setWidth(double width){
        super.setWidth(width);
        paint();
    }
    public void setHeight(double height){
        super.setHeight(height);
        paint();
    }
}
