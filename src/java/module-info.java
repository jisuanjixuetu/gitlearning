module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;
    requires javafx.graphicsEmpty;
    requires java.compiler;
    requires javafx.baseEmpty;
    requires javafx.controlsEmpty;
    requires java.desktop;
    requires javafx.media;

    opens com.example.demo to javafx.fxml;
    exports zhanshi11;
    exports com.example.demo;
    exports org.example;
    opens org.example to javafx.fxml;
    opens org.example.image to javafx.fxml;
}