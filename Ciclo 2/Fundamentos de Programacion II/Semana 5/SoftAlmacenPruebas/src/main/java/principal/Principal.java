/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import productos.OperacionesProductos;
import productos.Productos;

/**
 *
 * @author kevin
 */
public class Principal {
    public static void main(String[] args) {
        //Declarar una variable de OperacionesProductos y productos para registrar y listar
        OperacionesProductos opProductos = new OperacionesProductos();
        Productos productos = new Productos(001, "Air", 50, 5000000);
        opProductos.registrarProductos(productos);
        opProductos.listarProductos();
        
        Productos productos1 = new Productos(002, "Jordan", 50, 5000000);
        opProductos.registrarProductos(productos1);
        opProductos.listarProductos();
    } 
}
