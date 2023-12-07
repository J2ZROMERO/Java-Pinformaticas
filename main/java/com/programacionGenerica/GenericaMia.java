package com.programacionGenerica;

// normalmente se usa la letra T,U K por convencion
// <lo que lo hace generica es agregar <>
// primero les asigna un valor null

public class GenericaMia<T> {
public GenericaMia(){
    objeto = null;                  // cada vez que instanciemos la clase este tendra un valor nulo
}


public T getObjeto(){
    return objeto;
}
public void setObjeto(T nuevoValor){
    objeto = nuevoValor;
}
    private T objeto;
}
