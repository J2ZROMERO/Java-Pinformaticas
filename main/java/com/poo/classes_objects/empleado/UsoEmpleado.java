package com.poo.classes_objects.empleado;


import java.util.GregorianCalendar;

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


        Jefes juan = new Jefes("juan",200000,2004,01,01);

        Empleados [] losEmpleados =  new Empleados[5];
        losEmpleados[0] =  new Empleados("jhosep ",1500,2024,02,10);
        losEmpleados[1] =  new Empleados("juan ",2000,2024,03,11);
        losEmpleados[2] =  new Empleados("carlos ",2500,2024,04,12);
        losEmpleados[3] =  new Empleados("ruby ",3000,2024,05,13);
        losEmpleados[4] = juan;

        Jefes maria = new Jefes("maria",5000,2024,02,02); // == downcasting
        Empleados patricia = maria;  // == downcasting




/*
        for(Empleados e: losEmpleados){
            System.out.println(e.getDatosEmpleado()+ "con un salario de  " + e.getSueldo());
        }*/



        /*
        Empleados antonio = new Empleados("Antonio", 3000,2024,01,19);
        Jefes jose =  new Jefes("Jose",5000,1998,03,19);
    jose.setIncentivo(500);
        System.out.println(antonio.getDatosEmpleado());
        System.out.println(jose.getDatosEmpleado());
        System.out.println(jose.getSueldo());
        */
    }
}


class Empleados {
    public Empleados(String name, double sueldo, int ano, int mes, int dia){
        this.name = name;
        this.sueldo = sueldo;
        this.calendario = new GregorianCalendar(ano,mes,dia);

        id = idSiguiente;
        idSiguiente++;
    }
    public String getDatosEmpleado(){
        return "El empleado " + name + " Y tiene el numero "+ id ;
    }

    public double getSueldo(){        return this.sueldo;};
    public GregorianCalendar getFechaAlta(){ return this.calendario;};

    public void setSubeSalario(double porcentaje){
        double aumento= (this.sueldo*porcentaje)/100;
        sueldo+=aumento;

    }

    public static String getIdSiguiente(){
        return "El id del siguiente empleado sera " + idSiguiente;
    }
    private final String name; // now this is constant
    private int id;
    private static int idSiguiente=1;
    private double sueldo;
    private GregorianCalendar calendario;

}
class Jefes extends Empleados{
    public Jefes(String name, double sueldo, int ano, int mes, int dia) {

        super(name, sueldo, ano, mes, dia);

    }
    public void setIncentivo(double incentivo){
      this.incentivo = incentivo;
    };

    public double getSueldo(){

        double sueldoJefe = super.getSueldo();
        return sueldoJefe+incentivo;

    };
    private double incentivo;


}