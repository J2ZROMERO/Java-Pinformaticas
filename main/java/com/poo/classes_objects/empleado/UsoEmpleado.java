package com.poo.classes_objects.empleado;


// en un fichero java se puede construir varias clases
// only one class is allowed to contain the main method
// final word sets the variable as constant

public class UsoEmpleado {
    public static void main(String[] args) {

        Empleados empleado1 = new Empleados("Jose");
        System.out.println(empleado1.getDatosEmpleado());

        empleado1.setSeccion("RRHH");
        System.out.println(empleado1.getDatosEmpleado());

    }
}


class Empleados {


    public Empleados(String name){
        this.name = name;
        section ="Administration";
    }

    public void setSeccion(String seccion){
        this.section =  seccion;
    }

    public String getDatosEmpleado(){
        return "El empleado " + name + " pertenece a la seccion "+ section;
    }
    private final String name; // now this is constant
    private  String section;

}