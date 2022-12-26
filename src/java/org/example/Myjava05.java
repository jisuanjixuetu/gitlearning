package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Myjava05  extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new HBox(100);
        pane.setPadding(new Insets(5,5,5,5));
        Image image = new Image("file:source/image/us.gif");
        pane.getChildren().add(new ImageView(image));
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        pane.getChildren().add(imageView);
        ImageView imageView1 = new ImageView(image);
        imageView1.setRotate(90);
        pane.getChildren().add(imageView1);
        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowImage");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}
