package com.poo.classes_objects.vehiculos;

public class Vehiculos {


    public Vehiculos(int ruedas){ // Constructor de la clase es el mismo nombre que la clase
    this.ruedas=ruedas;
    largo=2;
    ancho=1;
    peso=2;
    color="sin color";

    }

    public Vehiculos(int ruedas,int largo, double ancho, int peso){
        this.ruedas=ruedas;
        this.largo=largo;
        this.ancho=ancho;
        this.peso=peso;
        this.color="sin color";

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

        public void setExtra (boolean climatizador){
        this.climatizador = climatizador;

        }

        public String getExtra(){
            if(climatizador && gps==false && tapiceria_cuero==false) return "tu vehiculo lleva el pack de 1 extras";
            else if(climatizador && gps && tapiceria_cuero) return "Tu vehiculo lleva el pack de 2 extras";
            return "la combinacion de extras no se admite";
        }

        public void setExtra(boolean gps, boolean climatizador, boolean tapiceria_cuero){ //  it is allow to exist two setExtra methods.
        this.climatizador =climatizador;
        this.gps = gps;
        this.tapiceria_cuero=tapiceria_cuero;
        }


    private int ruedas;
    private String color;
    private int largo;
    private double ancho;
    private int peso;
    private boolean climatizador;
    private boolean tapiceria_cuero;
    private boolean gps;




}

