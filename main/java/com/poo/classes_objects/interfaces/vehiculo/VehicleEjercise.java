package com.poo.classes_objects.interfaces.vehiculo;

public class VehicleEjercise {

    public static void main(String[] args) {
        usoVehiculo[] vehiculos = new usoVehiculo[6];
        vehiculos[0] = new Coche(40);
        vehiculos[1] = new Moto(500);
        vehiculos[2] = new Coche(300);
        vehiculos[3] = new Moto(600);
System.out.print(vehiculos[0].acelerar(200));

    }
}