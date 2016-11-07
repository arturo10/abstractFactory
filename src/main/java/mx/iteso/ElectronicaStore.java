package mx.iteso;

import mx.iteso.factories.FabricaDiscos_CapaDoble;
import mx.iteso.factories.FabricaDiscos_CapaSimple;

/**
 * Created by Arturo Hernandez on 6/11/2016.
 */
public class ElectronicaStore {
    public static void main(String[] args){
        FabricaDiscos fabrica;
        DVD dvd;
        BluRay bluray;

        fabrica = new FabricaDiscos_CapaSimple();
        dvd = fabrica.crearDVD();
        bluray = fabrica.crearBluRay();

        System.out.println(dvd);
        System.out.println(bluray);

        fabrica = new FabricaDiscos_CapaDoble();
        dvd = fabrica.crearDVD();
        bluray = fabrica.crearBluRay();

        System.out.println(dvd);
        System.out.println(bluray);
    }
}
