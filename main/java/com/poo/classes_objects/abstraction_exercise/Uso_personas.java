package com.poo.classes_objects.abstraction_exercise;

import java.util.Arrays;
import java.util.Date;

public class Uso_personas {

    public static void main(String[] args) {
        /*Empleados juan = new Empleados("jose",new Date(5465454),2500);
        Jefes ana = new Jefes("ana",new Date(5465454),3000);
        Alumnos maria = new Alumnos("pepito", "dibujo","aula 5 ");
         Jefes david = new Jefes("Miguel Angel", new Date(6545655),4800);

        System.out.println(juan.getNombre());
        System.out.println(ana.getDescripcion());
        david.setCargo("Director de RRHH");
        System.out.println(david.getNombre());
        System.out.println(david.getDescripcion());
        System.out.println(david.getCargo());
*/

        Empleados los_empleados[] = new Empleados[5];

        los_empleados[0] = new Empleados("Juan", new Date(6465546),2000);
        los_empleados[1] = new Empleados("Maria", new Date(6465546),7000);
        los_empleados[2] = new Empleados("Sandra", new Date(6465546),2200);
        los_empleados[3] = new Empleados("Antonio", new Date(6465546),4000);
        los_empleados[4] = new Empleados("Miguel", new Date(6465546),2400);

        Arrays.sort(los_empleados);

        for( Empleados e : los_empleados){


            System.out.println(e.getDescripcion());
        }



    }
}
