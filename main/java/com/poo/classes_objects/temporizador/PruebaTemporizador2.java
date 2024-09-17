package com.poo.classes_objects.temporizador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PruebaTemporizador2 {
    public static void main(String[] args) {
        Reloj rolex = new Reloj();
        rolex.ejecutarIntervalo(5,true);
        JOptionPane.showMessageDialog(null,"estamos impriendo");
    }

}

class Reloj {


    public void ejecutarIntervalo(int intervalo,boolean sonido){

       /*  class DameLaHora implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                Date ahora  = new Date();
                System.out.println("la hora es cada 23 segundos" + ahora);
                if(sonido) Toolkit.getDefaultToolkit().beep();
            }
        }
*/
       // ActionListener oyente = new DameLaHora();
        Timer miTemporizador = new Timer(intervalo, e -> {
            Date ahora  = new Date();
            System.out.println("la hora es cada 23 segundos" + ahora);
            if(sonido) Toolkit.getDefaultToolkit().beep();
        }
        );
        miTemporizador.start();
    }


}