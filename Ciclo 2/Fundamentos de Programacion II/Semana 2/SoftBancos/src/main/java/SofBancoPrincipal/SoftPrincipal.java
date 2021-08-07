/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SofBancoPrincipal;

import java.util.Scanner;
import InformacionClientes.FormClientesBancos;
/**
 *
 * @author kevin
 */
public class SoftPrincipal {
    
    public static void main(String[] args) {
        
        Scanner entradaOpciones = new Scanner(System.in);
        FormClientesBancos formClientesBancos = new FormClientesBancos();
        boolean salir = true; //Bandera entrada ciclo while
        int opcion; //Guardaremos la opcion del usuario
        
        while(salir){
            System.out.println("1. Registrar Clientes");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Consignar");
            System.out.println("4. Salir");
            
            System.out.println("¿Cual es su opción?");
            opcion = entradaOpciones.nextInt();
            
            switch(opcion){
                case 1:
                    formClientesBancos.registrarClientes();
                    break;
                case 2:
                    formClientesBancos.listarClientes();
                    break;
                case 3:
                    formClientesBancos.consignarClientes();
                    break;
                case 4:
                    salir=false;
                    break;
                default:System.out.println("Solo números entre 1 y 4");
            }
        }
    }
}
//Fin del programa
