/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softprincipal;

import clientes.Cliente;

/**
 *
 * @author kevin
 */
public class SoftPrincipal {
    
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Kevin","La palma","Granada","Ahorros");
        System.out.println(cliente1.toString());
    }
}
