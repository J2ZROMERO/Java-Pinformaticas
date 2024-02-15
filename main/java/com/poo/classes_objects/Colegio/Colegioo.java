package com.poo.classes_objects.Colegio;

import java.util.Arrays;

public class Colegioo {

    public Colegioo(String name, int capacity){
        this.name = name;
        this.alumns = new Alumno[capacity];
    }




    public String getName(){
        return this.name;
    }

    public Alumno getAlumno(int nAlumno){
        return alumns[nAlumno];

    };
public void createAlumn(String  name, double average){
        Alumno nuevoalumno = new Alumno(this,name,average);
        alumns[idArray] = nuevoalumno;
        idArray++;
}



public void removeStudent(String alumno){

    for (int i = 0; i < alumns.length; i++) {
        if(this.getAlumno(i)!=null){
            if(alumns[i].getName().equalsIgnoreCase(alumno)){
                alumns[i]=null;
            }


        }
    }
}


    public void setNotaMedia(String alumno, double nota){

        for (int i = 0; i < alumns.length; i++) {
            if(this.getAlumno(i)!=null){
                if(alumns[i].getName().equalsIgnoreCase(alumno)){
                    alumns[i].setNota(nota);
                }
            }
        }
    }


    public void  getAllAlumns(){

        for(int i =0; i < alumns.length;i++){
            if(alumns[i]!=null){
                System.out.println(this.getAlumno(i));
                System.out.println();
            }

        }    }


public void getDatosAlumno(String nAlumn){

    for (int i = 0; i < alumns.length; i++) {
if(this.getAlumno(i)!=null){

    if(alumns[i].getName().equalsIgnoreCase(nAlumn)){
        System.out.println( alumns[i]);
    }
}
    }


    }



    private String name;
    private Alumno alumns[];
    private int idArray = 0;


}


