package com.javafx.sceneBuilder;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {
    @FXML

    public void up(ActionEvent e){
        System.out.println("arriba");
    }
    public void down(ActionEvent e){
        System.out.println("abajo");
    }
    public void rigth(ActionEvent e){
        System.out.println("derecha");
    }
    public void left(ActionEvent e){
        System.out.println("izquierda");
    }
}
