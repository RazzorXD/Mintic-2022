/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

/**
 *
 * @author kevin
 */
public class Calzados implements Productos{
    int referenciaCalzados;
    String nombreCalzados;
    int cantidadCalzados;
            
    @Override
    public void registrarProductos(int referenciaProductos, String nombreProductos, int cantidadProductos) {
        this.referenciaCalzados = referenciaProductos;
        this.nombreCalzados = nombreProductos;
        this.cantidadCalzados = cantidadProductos;
    }

    @Override
    public void consultarProductos() {
        System.out.println("Referencia Calzados: "+ this.referenciaCalzados);
        System.out.println("Nombre Calzados: "+ this.nombreCalzados);
        System.out.println("Cantidad Calzados: "+ this.cantidadCalzados);
    }
    
}
