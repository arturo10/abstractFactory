package mx.iteso.factories;

import mx.iteso.BluRay;
import mx.iteso.DVD;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 6/11/2016.
 */
public class FabricaDiscos_CapaDobleTest {

    private FabricaDiscos_CapaDoble fabricaDiscos;
    @Before
    public void setUp(){
        fabricaDiscos=new FabricaDiscos_CapaDoble();
    }
    @Test
    public void createDVDTest(){
        DVD dvd=fabricaDiscos.crearDVD();
        assertEquals("DVD Capa Doble (5.2GB)",dvd.toString());
    }
    @Test
    public void createBluRayTest(){
        BluRay bluRay=fabricaDiscos.crearBluRay();
        assertEquals("Blue Ray Capa Doble (4.9GB)",bluRay.toString());
    }

}
