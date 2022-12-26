package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MyJavaFx19 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Text text = new Text(20,20,"Song YuShan");
        pane.getChildren().addAll(text);
        text.setOnMouseDragged(e->{
            text.setX(e.getX());
            text.setY(e.getY());
        });
        Scene scene = new Scene(pane,300,100);
        primaryStage.setTitle("MouseEventDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
