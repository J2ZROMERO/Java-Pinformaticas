package com.events;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SimpleEvent {
    public static void main(String[] args) {
        MarcoBotonesColores mimarco = new MarcoBotonesColores();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mimarco.addWindowListener(new EventosDeVentana());
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

    public LaminaBotonesColores(){

        ColorDefondo Azul =  new ColorDefondo("Azul",Color.BLUE);

        ColorDefondo Amarillo =  new ColorDefondo("Amarillo",Color.YELLOW);

        ColorDefondo Verde =  new ColorDefondo("Verde",Color.GREEN);





    add(new JButton(Azul));
        add(new JButton(Amarillo));
        add(new JButton(Verde));


        InputMap mapaDeEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl A");
        mapaDeEntrada.put(teclaAzul,"fondo de color azul");
    ActionMap mapaAccion =  getActionMap();
 mapaAccion.put("fondo de color azul", Azul);
    }

    private class ColorDefondo extends AbstractAction {

        public ColorDefondo(String name,Color c){

    putValue(Action.NAME, name);
        putValue("color_de_fondo", c)
        ;}

        @Override
        public void actionPerformed(ActionEvent e) {
        Color localColor = (Color) getValue("color_de_fondo");
            setBackground(localColor);

        }


    }


}

class EventosDeVentana implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("ventana abierta");
    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("ventana Minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}

