package mx.iteso.products.impl;

import mx.iteso.BluRay;

/**
 * Created by Arturo Hernandez on 6/11/2016.
 */
public class BluRay_CapaDoble  extends BluRay {

    @Override
    public String getCapacidad() {
        return "4.9GB";
    }

    @Override
    public String getNombre() {
        return "Blue Ray Capa Doble";
    }

    @Override
    public String getPrecio() {
        return "12.00$";
    }
}
