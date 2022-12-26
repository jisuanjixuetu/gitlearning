package org.example;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatClient extends Application {
    BorderPane pane = new BorderPane();
    @Override
    public void start(Stage primaryStage) throws Exception {


        MenuBar mb = new MenuBar();
        mb.prefWidthProperty().bind(primaryStage.widthProperty());
        Menu File = new Menu("File");
        MenuItem quit = new MenuItem("quit");
        quit.setOnAction(e->{
            primaryStage.close();
        });
        File.getItems().add(quit);
        Menu Help = new Menu("Help");
        MenuItem About = new MenuItem("About");
        Help.getItems().add(About);
        About.setOnAction(new aboutUs());
        mb.getMenus().addAll(File, Help);
        pane.setTop(mb);


        VBox butVBox = new VBox();
        Button sendBut = new Button("Send");
        Button quitBut = new Button("Quit");
        sendBut.setStyle(" -fx-background-color:orange;-fx-text-fill:white;");
        quitBut.setStyle(" -fx-background-color:orange;-fx-text-fill:white;");
        butVBox.getChildren().add(sendBut);
        butVBox.getChildren().add(quitBut);


        ChoiceBox users = new ChoiceBox(FXCollections.observableArrayList(
                "tzb", "hh")
        );
        butVBox.getChildren().add(users);


        butVBox.setPadding(new Insets(10,10,10,10));
        butVBox.setStyle("-fx-border-color: orange;"
                + "-fx-background-color:orange;"
                +"-fx-border-width: 4;");
        butVBox.setSpacing(10);


        TextField tf = new TextField();
        pane.setBottom(tf);


        TextArea ta = new TextArea();
        pane.setCenter(ta);
        ta.setWrapText(true);
        ta.setEditable(false);


        sendBut.setOnAction(e->{
            String username;
            if(tf.getText().equals("")){
                return;
            }
            String str = tf.getText();
            Date date = new Date();
            SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            if(users.getSelectionModel().getSelectedItem() != null){
                str = users.getSelectionModel().getSelectedItem() + " "+ dateFormat.format(date) + "\n" + str;
            }else{
                str = "user" + " " + dateFormat.format(date) + "\n" + str;
            }
            ta.appendText(str+"\n");
            tf.clear();
        });

        quitBut.setOnMouseClicked(e->{
            primaryStage.close();
        });

        ta.setMinSize(320,210);
        primaryStage.setMinWidth(430);
        primaryStage.setMinHeight(350);
        pane.setRight(butVBox);

        Scene scene = new Scene(pane, 300, 150);
        primaryStage.setTitle("ChatClient"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    class aboutUs implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText("Information");
            alert.showAndWait();
        }
    }

}