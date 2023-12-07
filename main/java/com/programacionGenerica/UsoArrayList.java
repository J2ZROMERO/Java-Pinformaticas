package com.programacionGenerica;

import java.io.File;

public class UsoArrayList {

    public static  void main(String [] args){

        MiArrayList archivos = new MiArrayList(6);
        archivos.agregaElemento("Maria");
        archivos.agregaElemento("Antotnio");
        archivos.agregaElemento("Ana");
        archivos.agregaElemento("Juan");
        archivos.agregaElemento("Pedro");

        //String nombrePersona = (String)archivos.getObjeto(2);

        archivos.agregaElemento(new File("ejemplo.xls.x"));

        File nombrePersona =  (File) archivos.getObjeto(0);


        System.out.println(nombrePersona);
    }
}
