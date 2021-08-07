/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Cliente {
    public static void main(String[] args) {
        Scanner ingresarDatos = new Scanner(System.in);
    
    int temp = 0;
    int dato = ingresarDatos.nextInt();
    
    for(int i = dato;i >= 0; i--){
        temp += i;
    }
    System.out.println(temp);
        /*
        // Declarar constructor para captura de datos
        Scanner ingresarDatos = new Scanner(System.in);
        
        String nombreClientes = "Kevin Baquero";
        String direccionClientes = "Granada";
        String ciudadClientes = "Fusagasuga";
        String tipoCuenta = "";
        int edades, telefono;
        double estatura;
        
        // Mostrar informacion
        System.out.println("Nombre de cliente: " + nombreClientes);
        System.out.println("Direccion de cliente: " + direccionClientes);
        System.out.println("Ciudad de cliente: " + ciudadClientes);
        
        // Pedir informacion
        System.out.println("Edad de cliente: ");
        edades = ingresarDatos.nextInt();
        System.out.println("Edad de cliente: " + edades);
        
        if(edades < 18){
            System.out.println("Nececita un acudiente");
        }
        
        System.out.println("Telefono de cliente: ");
        telefono = ingresarDatos.nextInt();
        System.out.println("Telefono de cliente: " + telefono);
        
        System.out.println("Estatura de cliente: ");
        estatura = ingresarDatos.nextDouble();
        System.out.println("Ciudad de cliente: " + estatura);
        
        System.out.println("Tipo de cuenta que quiere: 1. Ahorros, 2. Corriente");
        int temp = ingresarDatos.nextInt();*/
        
        //Estructura if
        /*if(1 == temp){
            tipoCuenta = "Ahorro";
        }else{
            tipoCuenta = "Corriente";
        }
        System.out.println("Tipo de cuenta: " + tipoCuenta);*/
        
        //Estructura switch
        /*switch(temp){
            case 1:
                tipoCuenta = "Ahorro";
                break;
            case 2:
                tipoCuenta = "Corriente";
                break;
            default:
                tipoCuenta = "CDT";
                break;
        }
        System.out.println("Tipo de cuenta: " + tipoCuenta);*/
        
        //Estructura 
    }
}
