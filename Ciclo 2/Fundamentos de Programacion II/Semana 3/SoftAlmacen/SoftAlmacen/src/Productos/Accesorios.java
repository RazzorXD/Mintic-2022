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
public class Accesorios extends Productos {
    private String coloresAccesorios;

    public Accesorios(int referencia, String nombresProductos,
            String coloresAccesorios, int cantidadProductos, 
            double valor) {
        super(referencia, nombresProductos, cantidadProductos, valor);
        this.coloresAccesorios = coloresAccesorios;
    }
   
    
    @Override
    public String consultarProductos (){
    return "/////// Datos del Productos///////"
             + "\nReferencias del producto: " + referencia 
             + "\n Nombre del producto: " + nombresProductos
             + "\n Color del producto: " + coloresAccesorios          
             + "\n Cantidad del producto: " + cantidadProductos
             + "\n valor del producto: " + valor;
       
}}
