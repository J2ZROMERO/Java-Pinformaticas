package com.poo.classes_objects.generador_contrasenas;

import java.util.Random;

public class Password {
    public static void main(String[] args) {


        String totalPass = "";
        Random rnd = new Random();

        for (int j = 0; j < 4; j++) {

            totalPass +=  (""+(Math.abs(rnd.nextInt((122-97)+1)+97))).substring(0,2);

            for (int i = 0; i < 2 ; i++) {

                totalPass +=  (char)(Math.abs(rnd.nextInt((122-97)+1)+97));
            }

            totalPass +=  (char)(Math.abs(rnd.nextInt((90-65)+1)+65));
            totalPass +=  "-";
        }






        System.out.println(totalPass.substring(0,totalPass.length()-1));
    }
}
