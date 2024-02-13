package com.poo.classes_objects.Colegio;

import java.util.Arrays;

public class Colegioo {

    public Colegioo(String name, int capacity){
        this.name = name;
        this.alumns = new Alumno[capacity];
        this.alumnsCopy = new Alumno[capacity];
    }

public void createAlumn(String  name, double average){

        this.alumns[idAlumn] = new Alumno(name,average,this.idAlumn);

        idAlumn++;

}



public void removeStudent(String alumno){

int index = Arrays.binarySearch(alumns,alumno);

if (index >= 0){
    for (int i = 0; i < alumns.length - 1 ; i++) {
        if(!alumno.equalsIgnoreCase(alumnsCopy[i].name)){
                   alumnsCopy[i] = alumns[i];
        }
    }
    alumns = alumnsCopy;
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

        for(Alumno alumn : alumns){
            System.out.println("Nombre alumno : " +alumn.getName());
            System.out.println("Colegio : "+ this.name);
            System.out.println("Id Alumno : "+ alumn.getId());
            System.out.println("Nota media : " + alumn.getAverage());
        }


    }

    private static int idAlumn = 1;
    private String name;

    private Alumno alumns[];
    private Alumno alumnsCopy[];

}


