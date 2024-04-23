package com.poo.classes_objects.abstraction_exercise;

import java.util.Calendar;
import java.util.GregorianCalendar;

abstract  class Empleado {

    public Empleado(){

    }

    public  Empleado(String dni, String nombre, String apellido, GregorianCalendar alta){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido  = apellido;
        this.alta = alta;

    }


    public String imprimir(){
        return "Nombre: "+this.nombre+" Apellido: "+this.dni +" Alta: " +this.alta.get(Calendar.YEAR) + " sueldo: ";

    };

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public GregorianCalendar getAlta() {
        return alta;
    }

    public void setAlta(GregorianCalendar alta) {
        this.alta = alta;
    }

    abstract  public double getSalario();

     String dni;
     String nombre;
     String apellido;
     GregorianCalendar alta;
}
