/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

/**
 *
 * @author kevin
 */
public class Autobus extends Vehiculo {

    boolean puertaAbierta = false;

    //Constructor
    public Autobus(String nombreConductor, int nMaximoPasajeros) {
        super(nombreConductor, nMaximoPasajeros);
    }

    //Metodos asociados
    public static double calcularPasaje(int estrato) {
        int valor = 0;
        if (0 == estrato || 1 == estrato || 2 == estrato) {
            valor = 1500;
        }
        if (3 == estrato || 4 == estrato) {
            valor = 2600;
        } else if (5 == estrato || 6 == estrato) {
            valor = 3000;
        }
        return valor;
    }

    public void recogerPasajero(int estrato) {
        if (enMarcha == false && puertaAbierta == true) {
            if (nPasajeros < nMaximoPasajeros) {
                nPasajeros += 1;
                cantidadDinero += this.calcularPasaje(estrato);
            }
        }
    }

    public void gestionarPuerta() {
        if (puertaAbierta == false && enMarcha == false) {
            puertaAbierta = true;
        } else {
            puertaAbierta = false;
        }
    }

    @Override
    public void gestionarMarcha() {
        if (enMarcha == false && puertaAbierta == false) {
            enMarcha = true;
        } else {
            enMarcha = false;
        }
    }

    //Getters y Setters
    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }
}//Fin programa
