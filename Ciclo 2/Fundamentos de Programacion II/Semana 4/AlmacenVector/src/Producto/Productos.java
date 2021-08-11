package Producto;

/**
 *
 * @author kevin
 */
public class Productos {
    int referenciasProductos;
    String nombresProductos;
    int cantidadProductos;

    public Productos() {
        this.referenciasProductos = 0;
        this.nombresProductos = "";
        this.cantidadProductos = 0;
    }

    public int getReferenciasProductos() {
        return referenciasProductos;
    }

    public void setReferenciasProductos(int referenciasProductos) {
        this.referenciasProductos = referenciasProductos;
    }

    public String getNombresProductos() {
        return nombresProductos;
    }

    public void setNombresProductos(String nombresProductos) {
        this.nombresProductos = nombresProductos;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }
    
    
    
} // fin del programa
