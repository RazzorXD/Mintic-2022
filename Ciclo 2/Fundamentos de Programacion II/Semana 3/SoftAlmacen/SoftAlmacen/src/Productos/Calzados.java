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
public class Calzados extends Productos {
    private String coloresCalzados;
    private double tallasCalzados;

    public Calzados(int referencia, String nombresProductos,
           String coloresCalzados, double tallasCalzados, 
           int cantidadProductos, double valor) {
        super(referencia, nombresProductos, cantidadProductos, valor);
        this.coloresCalzados = coloresCalzados;
        this.tallasCalzados = tallasCalzados;
    }
    
    
    
    
    
}
