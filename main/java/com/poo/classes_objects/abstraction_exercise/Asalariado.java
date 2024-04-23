package com.poo.classes_objects.abstraction_exercise;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Asalariado extends  Empleado {
    public Asalariado(String dni, String nombre, String apellido, GregorianCalendar alta) {
        super(dni, nombre, apellido, alta);
    }

    public static void main(String[] args) {
        GregorianCalendar data = new GregorianCalendar(2024, 10, 10);

        System.out.println( 2024-2022  );
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double Asalariado(){
return  this.salario;
    }

    @Override
    public double getSalario() {

        int userYear = Integer.parseInt(String.valueOf(alta.get(Calendar.YEAR)));
        int currentYear = Integer.parseInt(String.valueOf(new GregorianCalendar().get(Calendar.YEAR)));
        int totalYears = (currentYear - userYear);


if( totalYears < 2 ){
return   this.salario;
}else if(totalYears >= 2 && totalYears <= 3){
    return  (this.salario*7) / 100;
}else if(totalYears >= 4 && totalYears <= 8){
    return  (this.salario*11) / 100;
}else if(totalYears >= 9 && totalYears <= 15){

    return  this.salario + ((this.salario*17) / 100);
}


 return 0;

    }


    public String imprimir(){
    return super.imprimir() + " " + getSalario();
    }

    private double salario;
}