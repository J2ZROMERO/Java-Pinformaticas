package com.events;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleEvent {
    public static void main(String[] args) {
        MarcoBotonesColores mimarco = new MarcoBotonesColores();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}


class MarcoBotonesColores extends  JFrame{
    public MarcoBotonesColores(){
        setTitle("mi marquito");
        setBounds(700,300,500,300);
        LaminaBotonesColores milamina = new LaminaBotonesColores();
        add(milamina);
    }
}

class LaminaBotonesColores extends JPanel {
    JButton negro = new JButton("Negro");
    JButton amarillo = new JButton("Amarillo");
    JButton  blanco =  new JButton("Blanco");
    public LaminaBotonesColores(){

        ColorDefondo Azul =  new ColorDefondo(Color.BLUE);
        ColorDefondo Rojo =  new ColorDefondo(Color.RED);
        ColorDefondo Verde =  new ColorDefondo(Color.GREEN);




    negro.addActionListener(Azul);
    amarillo.addActionListener(Rojo);
    blanco.addActionListener(Verde);

    add(negro);
    add(amarillo);
    add(blanco);
    }

    private class ColorDefondo implements ActionListener {

        public ColorDefondo(Color c){
            coloDeFondo = c;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            setBackground(coloDeFondo);
        }

        private Color coloDeFondo;

    }
}

