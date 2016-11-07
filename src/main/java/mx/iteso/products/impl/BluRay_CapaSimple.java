package mx.iteso.products.impl;

import mx.iteso.BluRay;

/**
 * Created by Arturo Hernandez on 6/11/2016.
 */
public class BluRay_CapaSimple extends BluRay {

    @Override
    public String getCapacidad() {
        return "4.5GB";
    }

    @Override
    public String getNombre() {
        return "BlueRay Capa Simple";
    }

    @Override
    public String getPrecio() {
        return "6.00$";
    }
}
