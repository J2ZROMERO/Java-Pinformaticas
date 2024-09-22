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

class LaminaBotonesColores extends JPanel implements ActionListener {
    JButton negro = new JButton("Negro");
    JButton amarillo = new JButton("Amarillo");
    JButton  blanco =  new JButton("Blanco");
    public LaminaBotonesColores(){

    negro.addActionListener(this);
    amarillo.addActionListener(this);
    blanco.addActionListener(this);
    add(negro);
    add(amarillo);
    add(blanco);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object miboton = e.getSource();
        if (miboton == negro)  setBackground(Color.black);
        else if(miboton == amarillo) setBackground(Color.yellow);
        else setBackground(Color.white);

    }
}