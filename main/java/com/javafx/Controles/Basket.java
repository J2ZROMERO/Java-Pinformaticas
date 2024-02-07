package com.javafx.Controles;
import com.javafx.Emergente.VentanaEmergente;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Basket extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


         estrellas = new ChoiceBox<Jugadores>();
/*        estrellas.getItems().add(new Jugadores("jose","Zepeda"));
        estrellas.getItems().add(new Jugadores("juan","Zepeda"));
        estrellas.getItems().add(new Jugadores("carlos","Zepeda"));
*/

        Jugadores jordan = new Jugadores("Jordan","Sanchez");
        Jugadores jose = new Jugadores("Jose","zepeda");
        Jugadores juan = new Jugadores("Juan","romero");
        estrellas.getItems().addAll(jordan,jose,juan);


        estrellas.setValue(jordan);


        estrellas.show();


        estrellas.setOnAction(e->{
            openWindow();
        });

        BorderPane root = new BorderPane(null,estrellas,null,null, null);


        Scene miscene =  new Scene(root,400,400);
        root.setAlignment(estrellas, Pos.CENTER);
        primaryStage.setScene(miscene);
        primaryStage.show();


    }


    private void openWindow(){

        String mensaje = "Has escogido: ";
        mensaje+= estrellas.getValue();


         VentanaEmergente.mostrar(mensaje, "Tu jugador favorito");
    }

    private ChoiceBox<Jugadores> estrellas;
}



class Jugadores {

    public Jugadores(String nombre, String apellido) {
        this.nombre =  nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() { // this give us a format default
        return "Nombre: " + nombre  +   " Apellido: " + apellido ;
    }

    private String nombre;
    private String apellido;
}


// no caso siempre el show muestra elementos
// show aqui realiza otras tareas