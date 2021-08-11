/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Producto.Productos;
import Views.ProductosView;

/**
 *
 * @author kevin
 */
public class PrincipalSoft {

    //Declarar variables de tipo produtos.java y productosview.java
    private static Productos productos[];
    private static ProductosView productosView;
    private static int contadorProductos = 0;

    public static void main(String[] args) {
        //inicializar las variables con el constructor
        productosView = new ProductosView();
        productos = new Productos[3];

        //hacer visible la ventana
        productosView.setVisible(true);
        productosView.setTitle("Datos del Producto");

        //inicializar vector productos
        for (int i = 0; i < productos.length; i++) {
            productos[i] = new Productos();
        }

    }

    public static void registrarProductos(int referenciasProductos, String nombresProductos, int cantidadProductos) {
        productos[contadorProductos].setReferenciasProductos(referenciasProductos);
        productos[contadorProductos].setNombresProductos(nombresProductos);
        productos[contadorProductos].setCantidadProductos(cantidadProductos);
        contadorProductos ++;
    }
    public static void consultarProductos(int referenciasProductos) {
        //Este metodo busca la referencia con el atributo que le llega y cuando lo encueentra llama al metodo imprimir en ProductosView
        for (int j = 0; j < productos.length; j++) {
            if(productos[j].getReferenciasProductos()==referenciasProductos){
                productosView.imprimirProductos(productos[j]);
            }
        }
    }
}//fin del programa
