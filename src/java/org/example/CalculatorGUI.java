package org.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculatorGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator");

        // Create a text field for displaying the results
        TextField resultField = new TextField();
        resultField.setAlignment(Pos.CENTER_RIGHT);
        resultField.setEditable(false);

        // Create a grid pane for the buttons
        GridPane buttonGrid = new GridPane();
        buttonGrid.setHgap(5);
        buttonGrid.setVgap(5);
        buttonGrid.setPadding(new Insets(5, 5, 5, 5));

        // Add the buttons to the grid pane
        String[][] buttonLabels = {
                {"7", "8", "9", "/"},
                {"4", "5", "6", "*"},
                {"1", "2", "3", "-"},
                {"0", ".", "=", "+"}
        };

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                Button button = new Button(buttonLabels[row][col]);
                buttonGrid.add(button, col, row);
            }
        }

        // Add the text field and grid pane to a root pane
        GridPane root = new GridPane();
        root.add(resultField, 0, 0);
        root.add(buttonGrid, 0, 1);

        // Set the scene and show the stage
        primaryStage.setScene(new Scene(root, 250, 300));
        primaryStage.show();
    }
}

