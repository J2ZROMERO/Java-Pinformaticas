package com.javafx.Layouts;

import com.JavaFx.emergente.VentanaEmergente;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ApplicationTextField extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Etiqueta del equipo
        Label lbEquipo = new Label("Nombre del equipo: ");
        lbEquipo.setMinWidth(100);
        lbEquipo.setAlignment(Pos.BOTTOM_RIGHT);
        // campo de texto del equipo SETPROMPT ayuda en el background es lo mismo si lo hacemos en el constructor
        txtEquipo = new TextField();
        txtEquipo.setMinWidth(200);
        txtEquipo.setMaxWidth(200);
        txtEquipo.setPromptText("Nombre del equipo");

        // Etiqueta del jugador
        Label lbJugador = new Label("Nombre del jugador: ");
        lbJugador.setMinWidth(100);
        lbJugador.setAlignment(Pos.BOTTOM_RIGHT);
        // campo de texto del equipo SETPROMPT ayuda en el background es lo mismo si lo hacemos en el constructor
        txtJugador = new TextField();
        txtJugador.setMinWidth(200);
        txtJugador.setMaxWidth(200);
        txtJugador.setPromptText("Nombre del jugador: ");

        // Etiqueta del jugador
        Label lbPuntos = new Label("Nombre del puntos: ");
        lbPuntos.setMinWidth(100);
        lbPuntos.setAlignment(Pos.BOTTOM_RIGHT);
        // campo de texto del equipo SETPROMPT ayuda en el background es lo mismo si lo hacemos en el constructor
        txtPuntos = new TextField();
        txtPuntos.setMinWidth(200);
        txtPuntos.setMaxWidth(200);
        txtPuntos.setPromptText("Nombre del Puntos: ");

        // Creacion del boton
        Button btnAction = new Button("Enviar");
        btnAction.setMinWidth(80);
        btnAction.setMaxWidth(80);

        btnAction.setOnAction(e -> btnAccionClick());

        // Creacion del panel de equipo
        // for using padding we need to add a new package.
        HBox panelEquipo = new HBox(20, lbEquipo, txtEquipo);
        panelEquipo.setPadding(new Insets(10));

        // Panle jugador
        HBox panelJugador = new HBox(20, lbJugador, txtJugador);
        panelJugador.setPadding(new Insets(10));

        // Panle puntos
        HBox panelPuntos = new HBox(20, lbPuntos, txtPuntos);
        panelPuntos.setPadding(new Insets(10));

        // Panel boton
        HBox panelBoton = new HBox(20, btnAction );
        panelBoton.setPadding(new Insets(10));
        panelBoton.setAlignment(Pos.BOTTOM_RIGHT);


        // creacion del VBox
        VBox panelVertical = new VBox(10, panelEquipo, panelJugador, panelPuntos, panelBoton); //estos 10 se agregar como extra al padding

        // Creacion de la escena

        Scene laScene = new Scene(panelVertical);
        primaryStage.setScene(laScene);
        primaryStage.setTitle("Datos del Jugador");
        primaryStage.show();





    }

    private void btnAccionClick() {
        String mensaje = "";
        if(txtEquipo.getText().length()==0) mensaje+="\nEl nombre del equipo es requerido.";
        if(txtJugador.getText().length()==0) mensaje+="\nEl nombre del jugador es requerido.";
        if(mensaje.length()==0){
            mensaje = "El jugador " + txtJugador.getText() + " que juega en " + txtEquipo.getText() + " anota" + txtPuntos.getText() + " puntos por partido";
            VentanaEmergente.mostrar(mensaje, "Datos del jugador");
        }else{
            VentanaEmergente.mostrar(mensaje, "Faltan datos");
        }

    }

    private TextField txtEquipo, txtJugador, txtPuntos;
}
