/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoftAlmacenPrincipal;

import Productos.Accesorios;
import Productos.Productos;
import java.util.ArrayList;

/**
 *
 * @author RamiroJose
 */
public class SoftAlmancenMain {
    public static void main(String[] args) {
       
     
       Productos productos = new Productos(1000,"Sombrillas",
            10, 45000);
        System.out.println(productos.consultarProductos());
       
        Accesorios accesorios = new Accesorios(2000,"Sombrillas Amarillas",
                "Amarillo",10, 45000);
        System.out.println(accesorios.consultarProductos());
        
        Productos productos2 = new Productos(3000,"Sombrillas Azules");
        System.out.println(productos2.consultarProductos());
        
       
     ArrayList<Productos> listasProductos = new ArrayList<>();
         
     listasProductos.add(new Productos(1000,"Sombrillas",10, 45000));
     listasProductos.add(new Productos(2000,"Sombrillas Amarillas",10, 45000));
     listasProductos.add(new Productos(3000,"Sombrillas Azules",10, 45000));
     {
         for(Productos Iteradorproductos:listasProductos) {      
         System.out.println(productos.consultarProductos());
     }
     System.out.println(listasProductos.size());
     listasProductos.remove(1);
     
     for(Productos Iteradorproductos:listasProductos ){
       System.out.println(productos.consultarProductos());
     }
     
      
     
        
    }
    
 }
 }