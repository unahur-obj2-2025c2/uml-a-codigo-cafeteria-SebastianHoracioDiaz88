package ar.edu.unahur.obj2.Bebible;

public class JugoNaranja extends Bebible {

    public JugoNaranja(String nombre, Double precioBase, Integer capacidad) {
        super(nombre, precioBase, capacidad);
        
    }

    @Override
    public Double costo() {
        
        return super.costo() * capacidad;
    }



}
