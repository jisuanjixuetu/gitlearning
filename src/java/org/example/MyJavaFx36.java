package org.example;

import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.net.URISyntaxException;

public class MyJavaFx36 extends MyJavaFx35{
    protected BorderPane getPane() throws URISyntaxException {
        BorderPane pane = super.getPane();
        VBox paneForRadioButton = new VBox(20);
        paneForRadioButton.setPadding(new Insets(5,5,5,5));
        paneForRadioButton.setStyle("-fx-border-width:2px;-fx-border-color:green");
        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbGreen = new RadioButton("Green");
        RadioButton rbBlue = new RadioButton("Blue");
        paneForRadioButton.getChildren().addAll(rbRed,rbGreen,rbBlue);
        pane.setLeft(paneForRadioButton);
        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        rbBlue.setToggleGroup(group);
        rbRed.setOnAction(e->{
            if(rbRed.isSelected()){
                text.setFill(Color.RED);
            }
        });
        rbGreen.setOnAction(e -> {
            if(rbGreen.isSelected()){
                text.setFill(Color.GREEN);
            }
        });
        rbBlue.setOnAction(e -> {
            if (rbBlue.isSelected()) {
                text.setFill(Color.BLUE);
            }
        });
        return pane;
    }
    public static void main(String[] args) {
        launch(args);
    }
}
