package products;

import mx.iteso.BluRay;
import mx.iteso.products.impl.BluRay_CapaDoble;
import mx.iteso.products.impl.BluRay_CapaSimple;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 6/11/2016.
 */
public class BluRay_CapaSimpleTest {

    BluRay bluRay;
    @Before
    public void setUp(){
        bluRay= new BluRay_CapaSimple();
    }

    @Test
    public void getCapacidadTest(){
        assertEquals("4.5GB",bluRay.getCapacidad());
    }

    @Test
    public void getNombreTest(){
        assertEquals("BlueRay Capa Simple",bluRay.getNombre());
    }

    @Test
    public void getPrecioTest(){
        assertEquals("6.00$",bluRay.getPrecio());
    }

    @Test
    public void toStringTest(){
        assertEquals("BlueRay Capa Simple (4.5GB)",bluRay.toString());
    }
}
