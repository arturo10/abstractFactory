package products;

import mx.iteso.BluRay;
import mx.iteso.DVD;
import mx.iteso.products.impl.BluRay_CapaDoble;
import mx.iteso.products.impl.DVD_CapaDoble;
import mx.iteso.products.impl.DVD_CapaSimple;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 6/11/2016.
 */
public class DVDCapaSimpleTest {

    DVD dvd;
    @Before
    public void setUp(){
        dvd= new DVD_CapaSimple();
    }

    @Test
    public void getCapacidadTest(){
        assertEquals("4.2GB",dvd.getCapacidad());
    }

    @Test
    public void getNombreTest(){
        assertEquals("DVD Capa Simple",dvd.getNombre());
    }

    @Test
    public void getPrecioTest(){
        assertEquals("5.00$",dvd.getPrecio());
    }

    @Test
    public void toStringTest(){
        assertEquals("DVD Capa Simple (4.2GB)",dvd.toString());
    }
}
