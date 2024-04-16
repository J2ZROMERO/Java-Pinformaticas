package com.poo.classes_objects.abstraction_exercise;

import java.util.Date;

public abstract class Personas {



public Personas(String nom){
    this.nombre = nom;
}

public String getNombre(){
    return nombre;
}

public abstract String getDescripcion();
    private String nombre;

}




class Empleados extends Personas {

public Empleados(String nom, Date fechaAlta, double sueldo){
    super(nom);
    this.fechaAlta  = fechaAlta;
    this.sueldo = sueldo;

}

public String getDescripcion(){
return "El empleado " + this.getNombre() + " tiene un sueldo " +
        " de " + sueldo + " $ " + " y entro a labores en " + fechaAlta;
}

private double sueldo;
private Date fechaAlta;

}

class Jefes extends  Empleados {

    public Jefes(String name, Date fechaAlta, double sueldo){
        super(name,fechaAlta,sueldo);
    }

    public void setIncentivo(double  incentivo){
        this.incentivo = incentivo;
    }
private double incentivo;
}


class Alumnos extends Personas{

public Alumnos(String name, String optativas, String aula){
    super(name);
    a_optativas = optativas;
    this.aula = aula;

}

    @Override
    public String getDescripcion() {
        return "El alumno " + this.getNombre()+  " esta en el aula  " + aula  + "" +
                " ha escogido la asignatura " + a_optativas;
    }


    private String a_optativas;
    private String aula;

}