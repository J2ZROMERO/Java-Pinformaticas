package com.poo.classes_objects.Colegio;

public class Alumno {

    public Alumno(Colegioo escuela, String name, double averageGrade){
        this.nombreColegio  = escuela;
        this.name = name;
        this.average = averageGrade;
        id = nAlumno;
        nAlumno++;

    }

public void setNota(double nota){
    this.average = nota;

}


public String getName(){
        return this.name;
}


public String toString(){
        return "Nombre Alumno: " + name + " \ncolegio: "+ this.nombreColegio.getName() +
                "\n °Alumno:  " + id + " \n Nota media: " + average;
}

    public String getNombreColegioAlumno(){
        return this.nombreColegio.getName();
    }

    private Colegioo nombreColegio;
    private String name;
    private double average;
    private int id;
    private int nAlumno = 1;
}
