package ar.edu.unahur.obj2.Bebible;

import ar.edu.unahur.obj2.Producto.Producto;

public abstract class Bebible extends Producto {

    protected Integer capacidad;

    public Bebible(String nombre, Double precioBase, Integer capacidad) {
        super(nombre, precioBase);
        this.capacidad = capacidad;
    }

   
    

}
