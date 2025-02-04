package com.events;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MultipleListeners{


    public static void main(String[] args){
        MarcoPrincipal marco = new MarcoPrincipal();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }


}

class MarcoPrincipal  extends JFrame {

    public MarcoPrincipal(){
        setTitle("marco principal");
        setBounds(1300,500,500,500);
        LaminaPrincipal lamina = new LaminaPrincipal();
        add(lamina);


    }
}


class LaminaPrincipal extends JPanel{
    public LaminaPrincipal(){
        JButton boton = new JButton("nuevo");
        add(boton);
        boton.addActionListener(new CreaMarco());
        boton_cerrar = new JButton("cerrar todo");
        add(boton_cerrar);
    }

    private class CreaMarco implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
      MarcoNuevo mimarco = new MarcoNuevo(boton_cerrar);
mimarco.setVisible(true);
        }
    }



    JButton boton_cerrar;
}

class MarcoNuevo extends JFrame{
    public MarcoNuevo(JButton cierra){
contador++;
setTitle("Ventana " + contador);
setBounds(50*contador,50*contador,350,200);
cierra.addActionListener( new CerraTodos());
    }

    private class CerraTodos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    }

    private static int contador = 0;
}