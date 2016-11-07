package mx.iteso.products.impl;

import mx.iteso.DVD;

/**
 * Created by Arturo Hernandez on 6/11/2016.
 */
public class DVD_CapaDoble  extends DVD {

    @Override
    public String getCapacidad() {
        return "5.2GB";
    }

    @Override
    public String getNombre() {
        return "DVD Capa Doble";
    }

    @Override
    public String getPrecio() {
        return "9.00$";
    }
}
