package com.poo.classes_objects;

public class Vehiculos {


    public Vehiculos(){ // Constructor de la clase es el mismo nombre que la clase
    ruedas=4;
    largo=2;
    ancho=1;
    peso=2;
    color="sin color";

    }

        public void setColor(){ // establece color
        color="azul";
        }

        public String getColor(){ // obtener color
        return color;
        }


    private int ruedas;
    private String color;
    private int largo;
    private int ancho;
    private int peso;



}

