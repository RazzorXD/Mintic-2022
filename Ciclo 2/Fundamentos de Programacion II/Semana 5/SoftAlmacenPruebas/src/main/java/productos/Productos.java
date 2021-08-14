/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author kevin
 */
public class Productos {
    protected int referenciaProductos;
    protected String nombreProductos;
    protected int cantidadProductos;
    protected double valorInventariosProductos;

    //Constructor
    public Productos(int referenciaProductos, String nombreProductos, int cantidadProductos, double valorInventariosProductos) {
        this.referenciaProductos = referenciaProductos;
        this.nombreProductos = nombreProductos;
        this.cantidadProductos = cantidadProductos;
        this.valorInventariosProductos = valorInventariosProductos;
    }

    public Productos() {
    }
    

    //Getters and Setters
    public int getReferenciaProductos() {
        return referenciaProductos;
    }

    public void setReferenciaProductos(int referenciaProductos) {
        this.referenciaProductos = referenciaProductos;
    }

    public String getNombreProductos() {
        return nombreProductos;
    }

    public void setNombreProductos(String nombreProductos) {
        this.nombreProductos = nombreProductos;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public double getValorInventariosProductos() {
        return valorInventariosProductos;
    }

    public void setValorInventariosProductos(double valorInventariosProductos) {
        this.valorInventariosProductos = valorInventariosProductos;
    }
    
    
    
    
}
