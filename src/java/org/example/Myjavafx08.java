package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Myjavafx08 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane pane = new BorderPane();
        pane.setTop(new CustomerPane("Top"));
        pane.setBottom(new CustomerPane("Bottom"));
        pane.setRight(new CustomerPane("Right"));
        pane.setLeft(new CustomerPane("Left"));
        pane.setCenter(new CustomerPane("Center"));
        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowBorderPane");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}

class CustomerPane extends StackPane{
    public CustomerPane(String title) {
        getChildren().add(new Label(title));
        setStyle("-fx-border-color:red");
        setPadding(new Insets(11.5,12.5,13.5,14.5));
    }
}