package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFx20 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Text text = new Text(20,20,"A");
        pane.getChildren().add(text);
        text.setOnKeyPressed(e->{
            switch (e.getCode()){
                case DOWN :
                    text.setY(text.getY()+10);
                    break;
                case UP:
                    text.setY(text.getY() - 10);
                    break;
                case LEFT:
                    text.setX(text.getX() - 10);
                    break;
                case RIGHT:
                    text.setY(text.getY() + 10);
                    break;
                    default :
                        if(e.getText().length()>0) {
                            text.setText(e.getText());
                        }
                        break;
            }
        });
        Scene scene = new Scene(pane);
        primaryStage.setTitle("KetEventDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
