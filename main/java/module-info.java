module com.example.java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java to javafx.fxml;
    exports com.example.java;
    exports com.javafx.Layouts;
    exports com.javafx.Ventanas;
    exports com.javafx.Emergente;
    exports com.javafx.AppCompleta;
    exports com.javafx.Controles;
    exports com.javafx.sceneBuilder;
}