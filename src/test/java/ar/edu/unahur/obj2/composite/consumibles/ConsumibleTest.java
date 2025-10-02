package ar.edu.unahur.obj2.composite.consumibles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.Comestible.Comestible;
import ar.edu.unahur.obj2.Comestible.Medialuna;
import ar.edu.unahur.obj2.Comestible.TipoMedialuna;

public class ConsumibleTest {
    @Test
    void testCosto(){
      Comestible medialuna = new Medialuna("mediaManteca", 150.0, 200,TipoMedialuna.DE_MANTECA);
      Double valor = (double) (200 * 500);  
      assertEquals(valor, medialuna.costo());
    }

    }
