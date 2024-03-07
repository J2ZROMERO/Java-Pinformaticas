package com.poo.classes_objects.generador_contrasenas;

import java.util.Random;

public class Password {

    public Password(int tamanoPass){
        this.tamanoPass = tamanoPass;
        passwordGenerated = GenetarePassword();
    }


    public String GenetarePassword(){
        String  pass =  "";
        for (int i = 0; i < this.tamanoPass ; i++) {
            int mayusMinus = ((int)(Math.random()*3+1));
            if(mayusMinus==1){
              pass += (char)((int)(Math.random()*(123-97)+97)); // minusculas
            }else if(mayusMinus == 2){
                pass += (char)((int)(Math.random()*(91-65)+65)); // mayusculas
            }else{
                pass += (char)((int)(Math.random()*(58-48)+48)); // numbers
            }



        }

        return pass;
    }


    public String esSegura()   {
        int numeros = 0;
        int minusculas = 0;
        int mayusculas = 0;
        for (int i = 0; i < passwordGenerated.length(); i++) {
            if (Character.isLowerCase(passwordGenerated.charAt(i))) {
                minusculas += 1;
            } else if (Character.isUpperCase(passwordGenerated.charAt(i))) {
                mayusculas += 1;
            } else {

                numeros += 1;
            }
        }

                if (numeros >= 5 && minusculas >= 1 && mayusculas >= 2) {
                    return "Contraseña segura";
                }
                            else {
                            return "Contraseña débil";
            }

        }


    public int  getLongitudPassword(){
        return this.tamanoPass;
    }

    public String getPassword() {
    return passwordGenerated;
    };


    private String passwordGenerated;
    private int tamanoPass;
}
