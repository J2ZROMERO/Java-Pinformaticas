package main.java.com.poo.classes_objects.abstraction_exercise;

import java.util.Date;

public class Uso_personas {

    public static void main(String[] args) {
        Personas juan;

        Empleados jose =  new Empleados("Jose", new Date(5465454),2500);

        juan = jose;


        System.out.println(juan);

    }
}
