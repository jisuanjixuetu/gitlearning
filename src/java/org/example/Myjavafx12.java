package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class Myjavafx12 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(new MyEllipse(),300,200);
        primaryStage.setTitle("ShowEllipse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
class MyEllipse extends Pane {
    private void paint(){
        getChildren().clear();
        for (int i = 0; i < 16;i++) {
            Ellipse e1 = new Ellipse(getWidth()/2,getHeight() / 2,getWidth() / 2-50,getHeight() / 2-50);
            e1.setStroke(Color.color(Math.random(),Math.random(),Math.random()));
            e1.setFill(Color.WHITE);
            e1.setRotate(i*180/16);
            getChildren().add(e1);
        }
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
