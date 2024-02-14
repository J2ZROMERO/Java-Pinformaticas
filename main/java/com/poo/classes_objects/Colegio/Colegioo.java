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

int index = Arrays.binarySearch(alumns,alumno);

if (index >= 0){
    for (int i = 0; i < alumns.length - 1 ; i++) {
        if(!alumno.equalsIgnoreCase(alumns[i].getName())){
                   alumns[i] = null;
        }
    }

}else{
    System.out.println("User not found");
}
}


    public void setNotaMedia(String alumno, double nota){

        int index = Arrays.binarySearch(alumns,alumno);

        if (index >= 0){
            alumns[index].setNota(nota);
        }else{
            System.out.println("User not found");
        }
    }


    public void  getAttAlmns(){

        for(int i =0; i < alumns.length;i++){
            if(alumns[i]!=null){
                System.out.println(this.getAlumno(i));
                System.out.println();
            }

        }    }


public void getDatosAlumno(String nAlumn){


    int index = Arrays.binarySearch(alumns,nAlumn);

    if (index >= 0){
        this.getAlumno(index);
    }else{
        System.out.println("User not found");
    }
    }



    private String name;
    private Alumno alumns[];
    private int idArray = 0;


}


