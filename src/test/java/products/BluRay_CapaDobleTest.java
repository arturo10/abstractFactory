package products;

import mx.iteso.BluRay;
import mx.iteso.products.impl.BluRay_CapaDoble;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by Arturo Hernandez on 6/11/2016.
 */
public class BluRay_CapaDobleTest {

    BluRay bluRay;
    @Before
    public void setUp(){
        bluRay= new BluRay_CapaDoble();
    }

    @Test
    public void getCapacidadTest(){
        assertEquals("4.9GB1",bluRay.getCapacidad());
    }

    @Test
    public void getNombreTest(){
        assertEquals("Blue Ray Capa Doble",bluRay.getNombre());
    }

    @Test
    public void getPrecioTest(){
        assertEquals("12.00$",bluRay.getPrecio());
    }

    @Test
    public void toStringTest(){
        assertEquals("Blue Ray Capa Doble (4.9GB)",bluRay.toString());
    }
}
