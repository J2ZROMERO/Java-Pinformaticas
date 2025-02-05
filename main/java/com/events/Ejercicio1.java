package com.events;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ejercicio1{
    public static void main(String[] args) {
        Marco marcoPadre = new Marco();
        marcoPadre.setVisible(true);
        marcoPadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}


class Marco  extends JFrame {
    public Marco() {
        PanelCustom test = new PanelCustom();
        setBounds(100,100,100,100);
        add(test);
    }
}

class PanelCustom extends JPanel {
  public PanelCustom(){
setBounds(100,100,100,100);
setVisible(true);
addMouseListener(new Eventoclick());
  }
}

class Eventoclick implements MouseListener {


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("#imprimiendo");

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}