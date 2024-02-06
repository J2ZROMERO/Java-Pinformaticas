package com.poo.classes_objects.paquetes;

public class paquete {


    public paquete(String referenciaenvio,double peso,String dniRemitente, int prioridadEnvio){
    this.referenciaenvio = referenciaenvio;
    this.peso = peso;
    this.dniRemitente = dniRemitente;
    this.prioridadEnvio = prioridadEnvio;
    }


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPrioridadEnvio() {
        return prioridadEnvio;
    }

    public void setPrioridadEnvio(int prioridadEnvio) {
        this.prioridadEnvio = prioridadEnvio;
    }

    private String referenciaenvio;
    private double peso;
    private String dniRemitente;
    private int prioridadEnvio;

}
