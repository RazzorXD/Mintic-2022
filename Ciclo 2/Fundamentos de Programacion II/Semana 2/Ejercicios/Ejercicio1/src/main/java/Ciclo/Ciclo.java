/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclo;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Ciclo {

    public static void main(String[] args) {
        
        //NO se debia mostrar texto, solo los valores
        Scanner ingresarDatos = new Scanner(System.in);

        long temp = 1;
        System.out.println("Numero: ");
        long dato = ingresarDatos.nextInt();
        System.out.println("Numero: "+ dato);

        while (dato != 0) {
            temp = temp * dato;
            dato--;
        }
        System.out.println("Factorial: "+ temp);
    }
}
