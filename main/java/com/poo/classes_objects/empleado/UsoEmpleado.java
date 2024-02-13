package com.poo.classes_objects.empleado;


// en un fichero java se puede construir varias clases
// only one class is allowed to contain the main method
// final word sets the variable as constant
// no olvidar que una instancia es una copia de tod-o lo contenido en la clase 2 copias = dos copias unicas
// static son valores usados por la misma clase no importan cuantas instancias sean creadas estas van a compartir el mismo valor.
// a las variables static se les denomina variables de clase
// stattic values nunca perteneceran a las variables o instancias
// cuando hablamos de static nos referimos que estas no son partes del objecto o un objecto sino de clase
public class UsoEmpleado {
    public static void main(String[] args) {

        Empleados empleado1 = new Empleados("Jose");
        System.out.println(empleado1.getDatosEmpleado());
        Empleados empleado2 = new Empleados("Juan");
        System.out.println(empleado2.getDatosEmpleado());
        Empleados empleado3 = new Empleados("zepeda");
        System.out.println(empleado3.getDatosEmpleado());

        System.out.println(Empleados.getIdSiguiente());



    }
}


class Empleados {


    public Empleados(String name){
        this.name = name;
        section ="Administration";
        id = idSiguiente;
        idSiguiente++;
    }

    public void setSeccion(String seccion){
        this.section =  seccion;
    }

    public String getDatosEmpleado(){
        return "El empleado " + name + " pertenece a la seccion "+ section + " Y tiene el numero "+ id ;
    }

    public static String getIdSiguiente(){
        return "El id del siguiente empleado sera " + idSiguiente;
    }
    private final String name; // now this is constant
    private  String section;
    private int id;
    private static int idSiguiente=1;

}