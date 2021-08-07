/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdministracionClientes;

/**
 *
 * @author kevin
 */
public class ClientesBanco {
    
    int numeroCuentas;
    String nombreClientes;
    double saldoCuentas;

    public ClientesBanco(int numeroCuentas, String nombreClientes, double saldoCuentas) {
        this.numeroCuentas = numeroCuentas;
        this.nombreClientes = nombreClientes;
        this.saldoCuentas = saldoCuentas;
    }

    @Override
    public String toString() {
        return "ClientesBanco{" + "numeroCuentas=" + numeroCuentas 
                + ", nombreClientes=" + nombreClientes 
                + ", saldoCuentas=" + saldoCuentas + '}';
    }
    
    public void consignarDinero(double consignacion){
        this.saldoCuentas += consignacion;
    }

    public int getNumeroCuentas() {
        return numeroCuentas;
    }
}
