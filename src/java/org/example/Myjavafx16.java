package org.example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Myjavafx16 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button buttonOk = new Button("OK");
        Button buttonCancel = new Button("Cancel");
        OKHandlerClass handler1 = new OKHandlerClass();
        buttonOk.setOnAction(handler1);
        CancelHandlerClass handler2 = new CancelHandlerClass();
        buttonCancel.setOnAction(handler2);
        pane.getChildren().addAll(buttonOk,buttonCancel);
        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowAction");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
class OKHandlerClass implements EventHandler<ActionEvent>{

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("OK button clicked");
    }
}
class CancelHandlerClass implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Cancel button clicked");
    }
}
