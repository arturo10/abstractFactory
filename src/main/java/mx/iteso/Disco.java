package mx.iteso;

/**
 * Created by Arturo Hernandez on 6/11/2016.
 */
public abstract class Disco  {
    public abstract String getCapacidad();

    public abstract String getNombre();

    public abstract String getPrecio();

    @Override
    public String toString() {
        return getNombre() + " (" + getCapacidad() + ")";
    }
}