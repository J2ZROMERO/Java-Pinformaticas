package com.programacionGenerica;

public class MiArrayList {

public MiArrayList(int z){

    datosElemento= new Object[z];

}


public Object getObjeto(int i){

    return datosElemento[i];
}

public void agregaElemento(Object o){
    datosElemento[i] = o;
    i++;
}

    private int i = 0;
    private Object[] datosElemento;  // nos permite almacenar obejctos de cualquier tipo
}
