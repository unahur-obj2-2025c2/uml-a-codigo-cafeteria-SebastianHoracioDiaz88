package ar.edu.unahur.obj2.Combo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.Bebible.Cafe;
import ar.edu.unahur.obj2.Comestible.Medialuna;
import ar.edu.unahur.obj2.Comestible.TipoMedialuna;
import ar.edu.unahur.obj2.composite.consumibles.Consumible;

public class ComboTest {
    @Test
    void testCosto() {
        Consumible cafe = new Cafe("cafe", 150.00, 200, Boolean.FALSE);
        Consumible  mediaLuna = new Medialuna("manteca", 100.0, 200,TipoMedialuna.DE_MANTECA);
        Combo combo = new Combo("desayuno", 300.00);
        combo.agregarConsumible(cafe);
        combo.agregarConsumible(mediaLuna);
        assertEquals(100150.0, combo.costoConsumible());
        assertEquals(300.0, combo.costo());
    }
}

