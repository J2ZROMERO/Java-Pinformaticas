package com.poo.classes_objects.generador_contrasenas;

import java.util.Random;

public class Password {
    public static void main(String[] args) {

        Password p = new Password();
        p.setTamanoArray(5);
        p.setTamanoPass(4);

        for (int i = 0; i < p.tamanoArray(); i++) {
            System.out.println(p.generarPassword()[i]);
        }

    }


    public String []generarPassword(){
        String generatedPass = "";
        Random rnd = new Random();

        for (int j = 0; j < tamanoArray(); j++) {
            generatedPass += (""+(Math.abs(rnd.nextInt()))).substring(0,1)
            +""+
                    (char)(Math.abs(rnd.nextInt((122-97)+1)+97))+
                    (char)(Math.abs(rnd.nextInt((90-65)+1)+65));
            arrayPasswords[j] = generatedPass.substring(0);
            generatedPass = "";
        }

    return arrayPasswords;
    }


    public void setTamanoPass(int tamano){
        this.longitudPass = tamano;
    }

    public void setTamanoArray(int tamano){

        arrayPasswords = new String[tamano];
    }

public int tamanoArray(){
        return arrayPasswords.length;
}

/*public int longitudPasswrord(){
        return totalPass.length;
    }*/
    private String[] arrayPasswords;
    private int longitudPass;
}
