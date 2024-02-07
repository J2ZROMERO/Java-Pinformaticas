package com.poo.classes_objects.vehiculos;

public class UsoVehiculos {

    public static void main(String[] args) {

        Vehiculos miCoche = new Vehiculos(4);

        miCoche.setColor("Azul marino");
        miCoche.setExtra(true,true,true);



       Vehiculos miMoto = new Vehiculos(2,2,0.3,20);
       miMoto.setColor("RED");




        System.out.println(miCoche.getDatosVehivulo());
        System.out.println(miCoche.getExtra());

        System.out.println(miMoto.getDatosVehivulo());

    }
}
