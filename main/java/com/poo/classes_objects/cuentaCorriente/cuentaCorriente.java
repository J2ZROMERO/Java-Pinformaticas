package com.poo.classes_objects.cuentaCorriente;

import java.util.Random;

public class cuentaCorriente {
        public cuentaCorriente(String nombreTitular, double saldo){
        this.nombreTitular =nombreTitular;
        this.saldo = saldo;
        numeroDeCuenta = Math.abs(new Random().nextLong());
    }
public void setSaldo(double saldo){
        this.saldo += saldo;
}
public String getSaldoCuenta(){

        return "tu saldo es " + this.saldo;
}

public void retirar(double cantidad){
     this.saldo -= cantidad;
}

public void transferir(cuentaCorriente ct1, cuentaCorriente ct2, double cantidad){
            ct1.saldo -= cantidad;
            ct2.saldo += cantidad;
}


/*
public double setTransferir(double reintegro){
        this.saldo-=reintegro;
        return reintegro;
    }

* */
public String getDatosGenerales(){
 return "Tus datos son: " + nombreTitular + " "  + "#cliente"  +  numeroDeCuenta + " saldo total " + saldo;
}
private long numeroDeCuenta;
private  String nombreTitular;
private double saldo;
}
