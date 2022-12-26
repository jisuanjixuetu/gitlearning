//package org.example;
//
//import javafx.application.Application;
//import javafx.scene.Group;
//import javafx.scene.input.MouseButton;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Polygon;
//import javafx.stage.Stage;
//
//import java.awt.geom.Point2D;
//import java.util.ArrayList;
//
//public class MyJavaFx32 extends Application {
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) {
//        MapPane map = new MapPane();
//    }
//}
//class MapPane extends BorderPane {
//    private Group group = new Group();
//    MapPane() {
//        ArrayList<ArrayList<Point2D>>points = getPoints();
//        for (int i = 0; i < points.size(); i++) {
//            Polygon polygon = new Polygon();
//            for (int j = 0; j < points.get(i).size(); j++) {
//                polygon.getPoints().addAll(points.get(i).get(j).getX(),points.get(i).get(j).getY());
//                polygon.setFill(Color.WHITE);
//                Polygon.setStroke(Color.BLACK);
//                polygon.setStrokeWidth(1/14.0);
//                Polygon.setOnMouseClicked(e->{
//                    if(e.getButton()== MouseButton.PRIMARY){
//                        polygon.setFill(Color.RED);
//                    } else if (e.getButton() == MouseButton.SECONDARY) {
//                        polygon.setFill(Color.BLUE);
//                    }
//                    else {
//                        polygon.setFill(Color.WHITE);
//                    }
//                });
//                group.getChildren().add(polygon);
//            }
//            group.setScaleX(14);
//            group.setScaleY(14);
//            this.setCenter(group);
//        }
//        public void enlarge(){
//            group.setScaleX(1.1*group.getScaleX());
//            group.setScaleY(1.1*group.getScaleY());
//        }
//        public void shrink(){
//            group.setScaleX(0.9*group.getScaleX());
//            group.setScaleY(0.9*group.getScaleY());
//        }
//        private ArrayList<ArrayList<Point2D>>getPoints(){
//            ArrayList<ArrayList<Point2D>>points = new ArrayList<>;
//            try {
//
//            }
//        }
//    }
//}
