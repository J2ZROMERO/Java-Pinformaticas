package com.poo.classes_objects.abstraction_exercise;

import java.util.GregorianCalendar;

public class Comision extends Empleado {

    public Comision(){

    }

    public  Comision(String dni, String nombre, String apellido, GregorianCalendar alta){
        super(dni, nombre, apellido, alta);
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(double num_cliente) {
        this.num_cliente = num_cliente;
    }

    @Override
    public double getSalario() {
        double total_captado = (getNum_cliente()*getComision()) + salario_fijo;
        return total_captado;
    }

    public String imprimir(){
        return super.imprimir() + " " + getSalario();
    }
    private double salario_fijo = 950;
    private double comision;
    private double num_cliente;
}
