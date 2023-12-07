package com.programacionGenerica;

import java.io.File;

public class EjemploMetodosGenericos {

    public static void main(String[] args) {

        String nombresPersonas[] = {"sara","antonio","maria"};

        System.out.println(ExaminaArrays.getElementos(nombresPersonas));

    }
}




class ExaminaArrays{

    public static <T extends Comparable> String getElementos(T[]elArray){ // le decmios todos los tipos que manejaa este metodo llevan a comparable, aqui decimos extends heredara de la I compraable
            T objectoMenor = elArray[0];

        for (int i = 1; i < elArray.length; i++) {

            if(objectoMenor.compareTo(elArray[i]) > 0){
                objectoMenor = elArray[i];
            }

        }
                return (String) objectoMenor;
//        return "el array tiene" + elArray.length;
                };

                }