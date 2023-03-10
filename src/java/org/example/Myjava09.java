package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Myjava09 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane pane = new BorderPane();
        pane.setTop(getHBox());
        pane.setLeft(getVBox());
        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowHBoxVBox");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    private HBox getHBox() {
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15,15,15,15));
        hBox.setStyle("fx-background-color:gold");
        hBox.getChildren().add(new Button("Computer Science"));
        hBox.getChildren().add(new Button("Chemistry"));
        ImageView image = new ImageView(new Image(this.getClass().getResource("image/us.gif").toExternalForm(),true));
        hBox.getChildren().add(image);
        return hBox;
    }
    private VBox getVBox(){
        VBox vBox = new VBox(15);
        vBox.setPadding(new Insets(15, 5,5,5));
        vBox.getChildren().add(new Label("Coursea:"));
        Label[]courses = {new Label("CSCI 1301"),new Label("CSCI 1302"),new Label("CSCI 2410"),new Label("CSCI 3720")};
        for (Label course:courses){
            VBox.setMargin(course,new Insets(0,0,0,15));
            vBox.getChildren().add(course);
        }
        return vBox;
    }
}