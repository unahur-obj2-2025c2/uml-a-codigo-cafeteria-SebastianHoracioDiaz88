package ar.edu.unahur.obj2.Combo;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.composite.consumibles.Consumible;

public class Combo implements Consumible{
    private String nombre;
    private Double precio;
    private List<Consumible> consumibles;

    public Combo(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.consumibles = new ArrayList<>();
    }

    public Combo(String nombre, Double precio, List<Consumible> consumibles) {
        this.nombre = nombre;
        this.precio = precio;
        this.consumibles = consumibles;
    }

    @Override
    public Double costo() {
        return Double.min(precio,costoConsumible());
    }

    public void agregarConsumible(Consumible consumible){
        consumibles.add(consumible);
    }

    public void eliminarConsumible(Consumible consumible){
        consumibles.remove(consumible);
    }

    public Double costoConsumible(){
        return consumibles.stream().mapToDouble(c -> c.costo()).sum();
    }

    public String getNombre() {
        return nombre;
    }
    
    
    

}
