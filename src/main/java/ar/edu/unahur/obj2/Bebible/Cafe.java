package ar.edu.unahur.obj2.Bebible;

public class Cafe extends Bebible{

    private Boolean conLeche;

    public Cafe(String nombre, Double precioBase, Integer capacidad, Boolean conLeche) {
        super(nombre, precioBase, capacidad);
        this.conLeche = conLeche;
    }

    @Override
    public Double costo() {
        if (conLeche){
            return super.costo() + 5.0;
        }
        else {
            return super.costo();
        } 
    }

    

}
