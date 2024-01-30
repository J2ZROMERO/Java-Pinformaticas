package com.poo.classes_objects;

public class Vehiculos {


    public Vehiculos(int ruedas){ // Constructor de la clase es el mismo nombre que la clase
    this.ruedas=ruedas;
    largo=2;
    ancho=1;
    peso=2;
    color="sin color";

    }

    public void setColor(String color){ // establece color
        this.color=color;
        }

        public String getColor(){ // obtener color
        return color;
        }

        public String getDatosVehivulo(){
        return "Tu vehiculo tiene " + ruedas + " Ademas tiene  "+largo + " Metros de largo.";
        }

    private int ruedas;
    private String color;
    private int largo;
    private int ancho;
    private int peso;



}

