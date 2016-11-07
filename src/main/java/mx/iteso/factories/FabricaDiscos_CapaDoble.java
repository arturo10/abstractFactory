package mx.iteso.factories;

import mx.iteso.BluRay;
import mx.iteso.DVD;
import mx.iteso.FabricaDiscos;
import mx.iteso.products.impl.BluRay_CapaDoble;
import mx.iteso.products.impl.DVD_CapaDoble;

/**
 * Created by Arturo Hernandez on 6/11/2016.
 */
public class FabricaDiscos_CapaDoble implements FabricaDiscos {

    public BluRay crearBluRay() {
        return new BluRay_CapaDoble();
    }

    public DVD crearDVD() {
        return new DVD_CapaDoble();
    }
}
