/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistarClientes;

import java.util.Scanner;

public class SoftClientes {

   public static void main(String[] args) {

        // Declarar constructor para captura de datos
        Scanner entrarDatos= new Scanner(System.in);

        String  nombreClientes="Jhon Smit";
        String direccionClientes="Cra 23 # 12 -45";
        String ciudadClientes="Washington";

        System.out.println("Nombre clientes = " + nombreClientes);
        System.out.println("Direccion clientes = " + direccionClientes);
        System.out.println("Ciudad clientes = " + ciudadClientes + ",Departamento Antioquia");
        System.out.println("Edad del clientes = ");
        
        int edades=entrarDatos.nextInt();
        System.out.println("Edad del cliente = " + edades);
        
        System.out.println("Estatura del clientes = ");
        double estatura = entrarDatos.nextDouble();
        System.out.println("Estatura del cliente = " + estatura);
    }
}