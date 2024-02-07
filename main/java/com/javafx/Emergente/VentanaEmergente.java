package com.javafx.Emergente;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class VentanaEmergente {
    public static void mostrar(String mensaje, String titulo, int ancho, int alto){

        Stage miStage = new Stage();
        miStage.initModality(Modality.APPLICATION_MODAL);

        miStage.setTitle(titulo);

        miStage.setMinWidth(250);
        Label milabel = new Label();

        milabel.setText(mensaje);

        Button miboton = new Button();
        miboton.setText("Cerrar");

        miboton.setOnAction(e->miStage.close());

        BorderPane mipanel = new BorderPane();

        Scene miScene = new Scene(mipanel,ancho,alto);
        mipanel.setTop(milabel);
        mipanel.setCenter(miboton);

        miStage.setScene(miScene);
        miStage.showAndWait();

    }

    public static void mostrar(String mensaje, String titulo){

        Stage miStage = new Stage();
        miStage.initModality(Modality.APPLICATION_MODAL);

        miStage.setTitle(titulo);

        miStage.setMinWidth(250);
        Label milabel = new Label();

        milabel.setText(mensaje);

        Button miboton = new Button();
        miboton.setText("Cerrar");

        miboton.setOnAction(e->miStage.close());

        BorderPane mipanel = new BorderPane();

        Scene miScene = new Scene(mipanel,100,250);
        mipanel.setTop(milabel);
        mipanel.setCenter(miboton);

        miStage.setScene(miScene);
        miStage.showAndWait();

    }
}
