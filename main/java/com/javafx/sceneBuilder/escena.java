package com.javafx.sceneBuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class escena extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
try {
    Parent root = FXMLLoader.load(getClass().getResource("/com/example/java/other.fxml"));

    String css =  this.getClass().getResource("/com.example.java.styles/app.css").toExternalForm();

    Scene scene = new Scene(root);
    scene.getStylesheets().add(css);
    primaryStage.setScene(scene);
    primaryStage.show();
}catch (Exception e){
    e.printStackTrace();
}

    }
}
