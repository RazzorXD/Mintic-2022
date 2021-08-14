/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class OperacionesProductos {
    //Declaracion e inicializacion de una lista de productos
    protected List<Productos> inventarioProductos = new ArrayList();
    
    ///Declaracion e inicializacion de una lista de productos
    protected Productos productos = new Productos();
    
    public void registrarProductos(Productos productos){
        inventarioProductos.add(productos);
    }
    
    public void listarProductos(){
        for(int iteradorProductos = 0; iteradorProductos < inventarioProductos.size(); iteradorProductos ++){
            System.out.println("DATOS DEL PRODUCTO");
            System.out.println("Posicion en el Array: " + iteradorProductos);
            System.out.println("Referencia producto: " + inventarioProductos.get(iteradorProductos).getReferenciaProductos());
            System.out.println("Nombre producto: " + inventarioProductos.get(iteradorProductos).getNombreProductos());
            System.out.println("Cantidad producto: " + inventarioProductos.get(iteradorProductos).getCantidadProductos());
            System.out.println("Valor producto: " + inventarioProductos.get(iteradorProductos).getValorInventariosProductos());
            System.out.println("");
        }
    }
}//Fin programa

