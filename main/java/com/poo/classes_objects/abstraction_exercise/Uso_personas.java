package com.poo.classes_objects.abstraction_exercise;

import java.util.Date;

public class Uso_personas {

    public static void main(String[] args) {

        Empleados juan = new Empleados("jose",new Date(5465454),2500);
        Jefes ana = new Jefes("ana",new Date(5465454),3000);
        Alumnos maria = new Alumnos("pepito", "dibujo","aula 5 ");


        System.out.println(juan.getNombre());
        System.out.println(ana.getDescripcion());





    }
}
