package com.poo.classes_objects.abstraction_exercise;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaTemporizador {

    public static void main(String[] args) {

        Temporizador oyente = new Temporizador();

        Timer miTemporizador = new Timer(3000,oyente);
        miTemporizador.start();

        JOptionPane.showMessageDialog(null,"pulsa aceptar para detener");

    }

}

class Temporizador implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("hola alumnos" +e.getSource());
    }
}