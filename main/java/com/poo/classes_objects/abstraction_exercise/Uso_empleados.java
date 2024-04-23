    package com.poo.classes_objects.abstraction_exercise;

import java.util.GregorianCalendar;

public class Uso_empleados {

    public static void main(String[] args) {
        Asalariado antonio = new Asalariado("6546546Z", "Antonio", "Lopez",new GregorianCalendar(2012,10,10));
        antonio.setSalario(1125);
        Asalariado maria = new Asalariado("77879878F", "Maria", "Ramos",new GregorianCalendar(2011,10,10));
        maria.setSalario(1055);
        Comision manuel = new Comision();
        manuel.setDni("4654654D");
        manuel.setNombre("Manuel");
        manuel.setApellido("Ruiz");
        manuel.setAlta(new GregorianCalendar(2010,10,10));
        manuel.setNum_cliente(35);
        manuel.setComision(6.90);

        Comision sandra =  new Comision();
        sandra.setDni("7879879S");
        sandra.setNombre("Sandra");
        sandra.setApellido("Nieto");
        sandra.setAlta(new GregorianCalendar(2011,10,10));
        sandra.setNum_cliente(169);
        sandra.setComision(7.10);

        
        Empleado todos[] = new Empleado[4];
        todos[0] = (Asalariado)antonio;
        todos[1] = (Asalariado)maria;
        todos[2] = (Comision)sandra;
        todos[3] = (Comision)manuel;


        Uso_empleados p = new Uso_empleados();
        System.out.println(p.sueldoMayor(todos));
        p.mostrarTodos(todos);


    }




public String sueldoMayor(Empleado empleados[]){

        double bigSalary = empleados[0].getSalario();
        int index_user = 0;
    for (int i = 1; i <  empleados.length ; i++) {
        if(empleados[i].getSalario() > bigSalary){
            bigSalary = empleados[i].getSalario();
            index_user = i;
        }
    }

    return "tiene el alto salario"+ empleados[index_user].getNombre() + " " + empleados[index_user].getApellido() ;
}
public void mostrarTodos(Empleado e[]){

        for(Empleado empleado : e){
            System.out.println(empleado.imprimir());
        }
        
}



}
