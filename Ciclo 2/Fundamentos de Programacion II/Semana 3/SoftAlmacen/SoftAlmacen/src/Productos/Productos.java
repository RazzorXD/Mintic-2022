/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

/**
 *
 * @author RamiroJose
 */
public class Productos {
    protected int referencia;
    protected String nombresProductos;
    protected int cantidadProductos;
    protected double valor;

    public Productos(int referencia, String nombresProductos, 
            int cantidadProductos, double valor) {
        this.referencia = referencia;
        this.nombresProductos = nombresProductos;
        this.cantidadProductos = cantidadProductos;
        this.valor = valor;
    }

    public Productos(int referencia, String nombresProductos) {
        this.referencia = referencia;
        this.nombresProductos = nombresProductos;
    }

    public Productos(int referencia, double valor) {
        this.referencia = referencia;
        this.valor = valor;
    }

    public Productos() {
    }
    
    
    
    
    public String consultarProductos (){
      return "/////// Datos del Productos///////"
             + "\nReferencias del producto: " + this.referencia 
             + "\n Nombre del producto: " + this.nombresProductos
             + "\n Cantidad del producto: " + this.cantidadProductos
             + "\n valor del producto: " + this.valor;
     
    }
    
    
}
