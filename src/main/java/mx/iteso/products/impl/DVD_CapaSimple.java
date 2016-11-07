package mx.iteso.products.impl;

import mx.iteso.DVD;

/**
 * Created by Arturo Hernandez on 6/11/2016.
 */
public class DVD_CapaSimple extends DVD {

    @Override
    public String getCapacidad() {
        return "4.2GB";
    }

    @Override
    public String getNombre() {
        return "DVD Capa Simple";
    }

    @Override
    public String getPrecio() {
        return "5.00$";
    }

}