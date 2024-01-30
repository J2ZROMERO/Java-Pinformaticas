package com.poo.classes_objects.cuentaCorriente;

public class usoCuenta {

    public static void main(String[] args) {
        cuentaCorriente jose =  new cuentaCorriente("Jose",50);
        cuentaCorriente juan =  new cuentaCorriente("Juan",100);

        System.out.println(jose.getDatosGenerales());
        System.out.println(juan.getDatosGenerales());

        juan.transferir(juan,jose,90);

        System.out.println("El saldo de jose es de " + jose.getDatosGenerales());
        System.out.println("El saldo de juan es de " + juan.getDatosGenerales());

    }



}
