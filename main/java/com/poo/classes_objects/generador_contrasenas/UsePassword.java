package com.poo.classes_objects.generador_contrasenas;

import static java.lang.Integer.parseInt;

public class UsePassword {

    public static void main(String[] args) {


        int total = 2;
        Password arrayPass[] = new Password[total];

        for (int i = 0; i < arrayPass.length ; i++) {

            arrayPass[i] =  new Password(20);
            System.out.println("password :"  + arrayPass[i].getPassword());
            System.out.println("Longitud :"  + arrayPass[i].getLongitudPassword());
            System.out.println("caracteres :"  + arrayPass[i].esSegura());
        }

    }


}