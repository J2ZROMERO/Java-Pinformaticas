package com.poo.classes_objects.interfaces.vehiculo;

public class Moto implements usoVehiculo {
    private double velocidad;

    public Moto(int velocidad) {
        this.velocidad = velocidad;
    }

    @java.lang.Override
    public String frenar(int cantidad) {


        double operacion = this.velocidad -= cantidad;
        return "el coche a frenado y la velocidad es de  : " + operacion + "";
    }

    @java.lang.Override
    public String acelerar(int cantidad) {
        String aviso = "";
        if (velocidad > VELOCIDAD_MAXIMA) aviso = "Exeso de velocidad";
        aviso += "Coche acelerando. Vechiculo" + velocidad + "km/h";
        return aviso;
    }

    @java.lang.Override
    public int plazas() {
        return 2;
    }
}