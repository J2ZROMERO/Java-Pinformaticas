package com.javafx.Ventanas;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.javafx.Emergente.cerrarAppDialog;
import com.javafx.Emergente.cerrarApp;

public class exitApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        miStage =primaryStage;

        Button botonClick = new Button();
        botonClick.setText("Pulsar");
        botonClick.setOnAction(e->hazmeClick());

        Button botonCerrar = new Button();
        botonCerrar.setText("Cerrar");
        botonCerrar.setOnAction(e->botonCerrar());
        VBox miPane = new VBox(10);
        miPane.getChildren().addAll(botonClick,botonCerrar);
        miPane.setAlignment(Pos.CENTER);

        Scene miScene = new Scene(miPane,350,200);

        primaryStage.setScene(miScene);
        primaryStage.setTitle("Contador de clicks");
        primaryStage.setOnCloseRequest(e->{
            e.consume();
            botonCerrar();
        });
        primaryStage.show();


    }
    public void hazmeClick(){
        contadorDeCliks++;
        if(contadorDeCliks==1) cerrarApp.mostrar("Click numero #" + contadorDeCliks, "CLICKS!");
        else cerrarApp.mostrar("Haz hecho click #" + contadorDeCliks + " veces", "CLICKS!");
    }

    public void botonCerrar(){

        boolean confirmar   = cerrarAppDialog.mostrar("cerradno app ", "¿Are you sure?");
        if (confirmar){
            // aqui debemos de agregar todas las tareas a realizar antes de cerrar
            miStage.close();
        }

    }
    Stage miStage;
    int contadorDeCliks;
}
