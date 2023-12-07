package com.programacionGenerica;

public class UsoGenericaMia {
    public static  void main(String [] args){


        GenericaMia<String> miObjeto1 = new GenericaMia<String>(); // al agregarle el tipo de dato este se adapta
        GenericaMia<Persona> miPersona = new GenericaMia<Persona>();

        Persona ella = new Persona("Carla");
        miPersona.setObjeto(ella);

        miObjeto1.setObjeto("Juan");

        System.out.println(miObjeto1.getObjeto());
        System.out.println(miPersona.getObjeto());



    }

}


class Persona{


    private String Nombre;

    public Persona(String nombre) {
        Nombre = nombre;
    }

    public String toString(){
        return Nombre;
    }
}