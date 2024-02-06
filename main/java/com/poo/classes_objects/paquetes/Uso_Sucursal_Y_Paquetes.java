package com.poo.classes_objects.paquetes;

import java.util.Scanner;

public class Uso_Sucursal_Y_Paquetes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe tu # Sucursal");
        int nSucursal = scanner.nextInt();

        System.out.println("Escribe tu Direccion");
        String dir = scanner.nextLine();


        System.out.println("Escribe tu Ciudad");
        String ciudad = scanner.nextLine();

        System.out.println("¿# de paquetes a enviar?");
        int cantidadPaquetes = scanner.nextInt();




        Sucursal sucursal =  new Sucursal(nSucursal,dir,ciudad);


        //////////////////////////////////////////////////////////




        paquete paquetes[] = new paquete[cantidadPaquetes];

        System.out.println("Sucursal\n "+
                sucursal.getNumSucural() + " Direccion \n"  + sucursal.getDireccion() + " Ciudad\n " + sucursal.getCiudad());

        System.out.println(" ");

        for (int i = 0; i < paquetes.length ; i++) {
            System.out.println("introduzca los datos de cada paquete");
            System.out.println("Referencia Envio");
            String referenciaEnvio = scanner.nextLine();

            System.out.println("DNI remitente");
            String dni = scanner.nextLine();

            System.out.println("Peso Paquete");
            double pesoPak = scanner.nextDouble();

            System.out.println("Prioridad Envio");
            int prioridad = scanner.nextInt();

            paquetes[i] = new paquete(referenciaEnvio,pesoPak,dni,prioridad);
        }

        for (int i = 0; i <  paquetes.length; i++) {
            System.out.println("Paquete\n " + (i+1) );
            System.out.println("Precio" + sucursal.calcularPrecio(paquetes[i]));
            System.out.println("Peso " + paquetes[i].getPeso());
            System.out.println("-------------------------");



        }











    }
}
