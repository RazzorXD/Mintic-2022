/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Inmobiliaria.Inmueble;
import Inmobiliaria.Condominio;

/**
 *
 * @author kevin
 */
public class Principal {

    public static void main(String[] args) {
        Condominio obj = new Condominio();
        //                          numero casa, idarrendador, costomensual, cantidadmesesarrendado
        Inmueble casa1 = new Inmueble("001", "1010047690", 500000, 12);

        obj.agregarInmueble(casa1);
        
        Inmueble casa2 = new Inmueble("002", "51877261", 450000, 12);

        obj.agregarInmueble(casa2);
        
        //Inmueble casa3 = new Inmueble("002", "51877261", 450000, 12);

        //obj.agregarInmueble(casa3);
        obj.mostrar();
        
        System.out.println(obj.calcularArriendoMensualCondominio());
        System.out.println(obj.promedioCostoInmueble());
        System.out.println(obj.desviacionEstandarCostoInmueble());
        
        obj.eliminarInmueble("002");
        System.out.println("------------------------------");
        obj.mostrar();
    }
}
