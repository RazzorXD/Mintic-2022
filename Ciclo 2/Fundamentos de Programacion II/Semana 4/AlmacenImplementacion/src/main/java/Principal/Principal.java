/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Productos.Calzados;

/**
 *
 * @author kevin
 */
public class Principal {
    public static void main(String[] args) {
        Calzados calzado = new Calzados();
        calzado.registrarProductos(001, "Air Nike", 100);
        calzado.consultarProductos();
        calzado.registrarProductos(002, "Air Jordan", 50);
        calzado.consultarProductos();
    }
}
