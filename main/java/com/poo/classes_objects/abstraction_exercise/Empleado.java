package com.poo.classes_objects.abstraction_exercise;

import java.util.Calendar;

abstract  class Empleado {

    public  Empleado(String dni, String nombre, String apellido, Calendar alta){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido  = apellido;
        this.alta = alta;

    }


    public void imprimir(){

    };
    abstract  public void getSalario();

    private String dni;
    private String nombre;
    private String apellido;
    private Calendar alta;
}
78