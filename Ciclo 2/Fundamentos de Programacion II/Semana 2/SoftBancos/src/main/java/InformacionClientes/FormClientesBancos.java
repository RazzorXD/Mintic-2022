/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InformacionClientes;

import java.util.Scanner;
import AdministracionClientes.ClientesBanco;

/**
 *
 * @author kevin
 */
public class FormClientesBancos {

    Scanner entrarInformacion = new Scanner(System.in);
    ClientesBanco[] clienteBanco = new ClientesBanco[2];
    private int numeroCuenta;
    private String nombreCliente;
    private double saldoCuenta;
    private int respuestaSaldoInicial;
    private int i = 0, j = 0, k = 0;
    private double consignacionClientes;

    public void registrarClientes() {
        System.out.println("Numero de cuenta: ");
        numeroCuenta = entrarInformacion.nextInt();
        System.out.println("Nombres del cliente: ");
        entrarInformacion.nextLine();
        nombreCliente = entrarInformacion.nextLine();
        System.out.println("Saldo inicial 1.[SI] 2[NO] ");
        respuestaSaldoInicial = entrarInformacion.nextInt();

        if (1 == respuestaSaldoInicial) {
            System.out.println("Valor de consignacion: ");
            saldoCuenta = entrarInformacion.nextDouble();
        } else {
            saldoCuenta = 0;
        }

        //Ya tenemos: numeroCuenta, nombreCliente, saldoCuenta
        clienteBanco[i] = new ClientesBanco(numeroCuenta, nombreCliente, saldoCuenta);
        i++;
    }

    public void listarClientes() {
        j = 0;
        if (clienteBanco[j] != null) {
            for (j = 0; j < clienteBanco.length; j++) {
                if (clienteBanco[j] != null) {
                    System.out.println(clienteBanco[j].toString());
                }
            }
        } else {
            System.out.println("No existen clientes");
        }
    }
    
    public void consignarClientes(){
        numeroCuenta = 0;
        if(clienteBanco[k] != null){
            System.out.println("Numero de cuenta: ");
            numeroCuenta = entrarInformacion.nextInt();
            for (k = 0; k < clienteBanco.length; k++) {
                if (numeroCuenta == clienteBanco[k].getNumeroCuentas()) {
                    System.out.println("Valor de consignacion: ");
                    consignacionClientes = entrarInformacion.nextDouble();
                    clienteBanco[k].consignarDinero(consignacionClientes);
                    break;
                }else{
                    System.out.println("Cuenta no existe");
                }
            }
            
        } else{
            System.out.println("No existen clientes");
        }
    }
}//fin del Programa
