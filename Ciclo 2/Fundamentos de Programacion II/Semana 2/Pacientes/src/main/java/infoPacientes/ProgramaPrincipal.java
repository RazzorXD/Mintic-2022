/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infoPacientes;

import hClinicas.Pacientes;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class ProgramaPrincipal {
    
    public static void main(String[] args) {
        
        Scanner entradaOpciones = new Scanner(System.in);

        boolean salir = true; //Bandera entrada ciclo while

        int opcion; //Guardaremos la opcion del usuario
       
        //Declaramos el vector de objetos pacientes
       
        Pacientes [] pacientes = new Pacientes [2];
       
        while(salir){

           System.out.println("1. Opcion Menu 1");

           System.out.println("2. Opcion Menu 2");

           System.out.println("3. Salir");

            

           System.out.println("Cual es su opción");

           opcion = entradaOpciones.nextInt();

            
           switch(opcion){

               case 1:

                   System.out.println("Opcion Menu 1");

                   break;

               case 2:

                   System.out.println("Opcion Menu 2");

                   break;

                case 3:

                   salir=false;

                   break;

                default:

                   System.out.println("Solo números entre 1 y 3");
           }
       }
    }
}

     
