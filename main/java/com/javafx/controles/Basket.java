package com.javafx.controles;

import javafx.application.Application;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class Basket extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        ChoiceBox<Jugadores> estrellas = new ChoiceBox<Jugadores>();
        estrellas.getItems().add(new Jugadores("jose","Zepeda"));
        estrellas.getItems().add(new Jugadores("juan","Zepeda"));
        estrellas.getItems().add(new Jugadores("carlos","Zepeda"));

        estrellas.show();;

    }
}



class Jugadores {

    public Jugadores(String nombre, String apellido) {
        this.nombre =  nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Jugadores{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    private String nombre;
    private String apellido;
}