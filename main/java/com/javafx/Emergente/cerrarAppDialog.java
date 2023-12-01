package com.javafx.Emergente;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class cerrarAppDialog {
    public static boolean mostrar(String mensaje, String titulo){

        botonSipulsado = false;

        miStage = new Stage();  // Create a new stage

        miStage.initModality(Modality.APPLICATION_MODAL);
        miStage.setMinWidth(250);
        miStage.setTitle(titulo);

        Label milabel = new Label();
        milabel.setText(mensaje);

        Button mibotonSi = new Button();
        Button mibotonNo = new Button();
        mibotonSi.setText("sI");
        mibotonNo.setText("No");

        mibotonSi.setOnAction(e->miBotonSi_clicked());
        mibotonNo.setOnAction(e->miBotonNo_clicked());

        HBox panelBotones = new HBox(20);
        panelBotones.getChildren().addAll(mibotonSi,mibotonNo);
        panelBotones.setAlignment(Pos.CENTER);

        VBox panelVertical = new VBox(30);
        panelVertical.getChildren().addAll(milabel,panelBotones);
        panelVertical.setAlignment(Pos.CENTER);

        Scene miScene = new Scene(panelVertical);
        miStage.setScene(miScene);

        miStage.showAndWait();

        return botonSipulsado;
    }

    private static void miBotonNo_clicked() {
        miStage.close();
        botonSipulsado = false;
    }

    private static void miBotonSi_clicked() {
        botonSipulsado = true;
        miStage.close();
    }

    private static Stage miStage;
    private static boolean botonSipulsado;
}
