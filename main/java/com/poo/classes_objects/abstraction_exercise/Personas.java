package main.java.com.poo.classes_objects.abstraction_exercise;
import java.util.Date;

public abstract class Personas {



public Personas(String nom){
    this.nombre = nom;
}

public String getNombre(){
    return nombre
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