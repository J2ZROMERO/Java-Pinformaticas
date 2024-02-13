
package com.poo.classes_objects.Colegio;

public class UsoColegio {

    public static void main(String[] args) {

        Colegioo SanJavier =  new Colegioo("San Javier",200);
        Colegioo cervantes =  new Colegioo("Cervantes",300);

        SanJavier.createAlumn("jose", 9.5);
        SanJavier.createAlumn("Sara",10);

        SanJavier.getAttAlmns();
    }


}
