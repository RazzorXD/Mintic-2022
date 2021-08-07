/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

/**
 *
 * @author kevin
 */
public class Cliente {
    String nombreClientes;
    String direccionClientes;
    String ciudadClientes;
    String tipoCuenta;

    public Cliente(String nombreClientes, String direccionClientes, String ciudadClientes, String tipoCuenta) {
        this.nombreClientes = nombreClientes;
        this.direccionClientes = direccionClientes;
        this.ciudadClientes = ciudadClientes;
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombreClientes=" + nombreClientes + ", direccionClientes=" + direccionClientes + ", ciudadClientes=" + ciudadClientes + ", tipoCuenta=" + tipoCuenta + '}';
    }
    
    
}
