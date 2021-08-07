/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import productos.Calzados;
/**
 *
 * @author kevin
 */
public class Principal {
    public static void main(String[] args) {
        Calzados calzados = new Calzados();
        calzados.registrarProductos(001, "Air Nike", 100, 1600000);
        calzados.consultarProdutos();
    } 
}
