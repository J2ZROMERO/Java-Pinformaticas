package com.poo.classes_objects.paquetes;

public class Sucursal {


    public Sucursal(int numSucursal,String direccion, String ciudad){
        this.numSucural = numSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }


    public int getNumSucural() {
        return numSucural;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public double calcularPrecio(paquete pack){
        double precioCalculado = pack.getPeso();


        if(pack.getPrioridadEnvio()==1) precioCalculado+=10;
        if(pack.getPrioridadEnvio()==2) precioCalculado+=20;

/*switch (pack.getPrioridadEnvio()){

    case 1:
precioCalculado+=10;
        break;
    case 2:
precioCalculado+=20;
        break;

    default:
        System.out.println("ingresa numero correcto");
}
*/
        return precioCalculado;
    }


    private int numSucural;
    private String direccion;
    private String ciudad;


}
