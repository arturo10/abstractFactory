package mx.iteso.factories;

import mx.iteso.BluRay;
import mx.iteso.DVD;
import mx.iteso.FabricaDiscos;
import mx.iteso.products.impl.BluRay_CapaSimple;
import mx.iteso.products.impl.DVD_CapaSimple;

/**
 * Created by Arturo Hernandez on 6/11/2016.
 */
public class FabricaDiscos_CapaSimple implements FabricaDiscos {

    public BluRay crearBluRay() {
        return new BluRay_CapaSimple();
    }

    public DVD crearDVD() {
        return new DVD_CapaSimple();
    }

}