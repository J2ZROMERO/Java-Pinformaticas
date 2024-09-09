package com.poo.classes_objects.interfaces.vehiculo;

public interface usoVehiculo {

    final int VELOCIDAD_MAXIMA=120;
    String frenar(int cantidad);
    String acelerar(int cantidad);
    int plazas();
}
