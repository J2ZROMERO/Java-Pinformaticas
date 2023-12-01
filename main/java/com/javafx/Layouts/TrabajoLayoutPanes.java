package com.javafx.Layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class TrabajoLayoutPanes extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Button boton1 = new Button("Boton 1");
        Button boton2 = new Button("Boton 2");
        Button boton3 = new Button("Boton 3");
        Button boton4 = new Button("Boton 4");
        Button boton5 = new Button("Boton 5");
        Button boton6 = new Button("Boton 6");

        HBox miPane = new HBox();
        //VBox miPaneV = new VBox(10);

        miPane.getChildren().addAll(boton1,boton2,boton3,boton4,boton5,boton6);
        //miPaneV.getChildren().addAll(boton1,boton2,boton3,boton4,boton5,boton6);

        Scene miScene = new Scene(miPane,400,200);

        stage.setScene(miScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}

// Para agregar una separacion podemos cheacar el construnctor  newHBox(10px)
// HBbox por muchos compoenets qu se agregen estos se van a agregar en esa misma linea como uin D-flex

// flow-pane respeta las dimensiones de los componentes y los agrega segun sus dimensiones

