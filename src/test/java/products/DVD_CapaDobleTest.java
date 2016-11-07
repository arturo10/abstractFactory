package products;

import mx.iteso.BluRay;
import mx.iteso.DVD;
import mx.iteso.products.impl.BluRay_CapaDoble;
import mx.iteso.products.impl.DVD_CapaDoble;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 6/11/2016.
 */
public class DVD_CapaDobleTest {

    DVD dvd;
    @Before
    public void setUp(){
        dvd= new DVD_CapaDoble();
    }

    @Test
    public void getCapacidadTest(){
        assertEquals("5.2GB",dvd.getCapacidad());
    }

    @Test
    public void getNombreTest(){
        assertEquals("DVD Capa Doble",dvd.getNombre());
    }

    @Test
    public void getPrecioTest(){
        assertEquals("9.00$",dvd.getPrecio());
    }

    @Test
    public void toStringTest(){
        assertEquals("DVD Capa Doble (5.2GB)",dvd.toString());
    }
}
