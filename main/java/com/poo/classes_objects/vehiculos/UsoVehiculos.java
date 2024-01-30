package com.poo.classes_objects.vehiculos;

public class UsoVehiculos {

    public static void main(String[] args) {

        Vehiculos miCoche = new Vehiculos(4);
    miCoche.setColor("Azul marino");

        System.out.println(miCoche.getDatosVehivulo());
    }
}
