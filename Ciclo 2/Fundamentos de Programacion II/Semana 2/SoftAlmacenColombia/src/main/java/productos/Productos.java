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
public abstract class Productos {
    public abstract void registrarProductos(int referenciaProductos, String nombreProductos, int cantidadProductos, double valor);
    
    public abstract void consultarProdutos();
}
