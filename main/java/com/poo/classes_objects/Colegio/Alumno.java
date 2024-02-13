package com.poo.classes_objects.Colegio;

public class Alumno {

    public Alumno(String name, double averageGrade, int id ){
        this.id = id;
        this.name = name;
        this.average = averageGrade;

    }

public void setNota(double nota){
    this.average = nota;

}


public String getName(){
        return this.name;
}

public int getId(){
        return id;
}

public double getAverage(){
        return average;
    }



    public int id;
    public String name;
    public double average;
}
