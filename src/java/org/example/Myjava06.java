package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Myjava06 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane = new FlowPane();
        pane.setPadding(new Insets(11,12,13,14));
        pane.setHgap(5);
        pane.setVgap(5);
        pane.getChildren().addAll(new Label("First name:"),new TextField(),new Label("Secret:"));
      TextField text = new TextField();
      text.setPrefColumnCount(1);
      pane.getChildren().addAll(text,new Label("Last name:"),new TextField());
      Scene scene = new Scene(pane,200,250);
      primaryStage.setTitle("ShowFlowpane");
      primaryStage.setScene(scene);
      primaryStage.show();
    }
}
