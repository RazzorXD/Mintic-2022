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
public class Calzados extends Productos{
    int referenciaCalzados;
    String nombreCalzados;
    int cantidadCalzados;
    double valor;
    
    @Override
    public void registrarProductos(int referenciaCalzados, String nombreCalzados, int cantidadCalzados, double valor) {
        this.referenciaCalzados = referenciaCalzados;
        this.nombreCalzados = nombreCalzados;
        this.cantidadCalzados = cantidadCalzados;
        this.valor = valor;
    }

    @Override
    public void consultarProdutos() {
        System.out.println("Referencias Calzados: " + this.referenciaCalzados);
        System.out.println("Nombres Calzados: " + this.nombreCalzados);
        System.out.println("Cantidad Calzados: " + this.cantidadCalzados);
        System.out.println("Valor Calzados: " + this.valor);  
    }
    
}
