package mx.iteso.factories;

import mx.iteso.BluRay;
import mx.iteso.DVD;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Arturo Hernandez on 6/11/2016.
 */
public class FabricaDiscos_CapaSimpleTest {

    private FabricaDiscos_CapaSimple fabricaDiscos;
    @Before
    public void setUp(){
        fabricaDiscos=new FabricaDiscos_CapaSimple();
    }

    @Test
    public void createDVDTest(){
        DVD dvd=fabricaDiscos.crearDVD();
        assertEquals("DVD Capa Simple (4.2GB)",dvd.toString());
    }
    @Test
    public void createBluRayTest(){
        BluRay bluRay=fabricaDiscos.crearBluRay();
        assertEquals("BlueRay Capa Simple (4.5GB)",bluRay.toString());
    }
}
