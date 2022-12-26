package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URISyntaxException;

public class MyJavaFx34 extends Application {
    protected Text text = new Text(50,50,"Shao Yichen");
    protected BorderPane getPane() throws URISyntaxException {
        HBox paneForButtons  = new HBox(20);
        Button btLeft = new Button("Left",new ImageView(getClass().getResource("image/left.gif").toURI().toString()));
        Button btRight = new Button("Right",new ImageView(getClass().getResource("image/right.gif").toURI().toString()));
        paneForButtons.getChildren().addAll(btLeft,btRight);
        paneForButtons.setAlignment(Pos.CENTER);
        paneForButtons.setStyle("-fx-border-color:green");
        BorderPane pane = new BorderPane();
        pane.setBottom(paneForButtons);
        Pane paneForText = new Pane();
        paneForText.getChildren().add(text);
        pane.setCenter(paneForText);
        btLeft.setOnAction(e->text.setX(text.getX()-10));
        btRight.setOnAction(e -> text.setX(text.getX()+10));
        return pane;
    }
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws URISyntaxException {
        Scene scene = new Scene(getPane(),450,200);
        primaryStage.setTitle("ButtonDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
