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
public class Taxi extends Vehiculo {

    double distanciaRecorrida = 0;
    boolean segurosActivados = false;

    //Constructor
    public Taxi(String nombreConductor) {
        super(nombreConductor);
        nMaximoPasajeros = 1;
    }

    //Metodos asociados
    public void reiniciarTaximetro() {
        distanciaRecorrida = 0;
    }

    public double calcularPasaje() {
        return 3000 + (2300 * distanciaRecorrida);
    }

    public void presionarBotonPanico() {
        reiniciarTaximetro();
        enMarcha = false;
        segurosActivados = false;
        dejarPasajero();
        cantidadDinero -= this.calcularPasaje();
    }

    public void dejarPasajero() {
        if (nPasajeros > 0 && enMarcha == false) {
            nPasajeros -= 1;
            cantidadDinero += this.calcularPasaje();
            reiniciarTaximetro();
        }
    }

    public void recogerPasajero() {
        if (enMarcha == false && segurosActivados == false && nPasajeros < nMaximoPasajeros) {
            nPasajeros += 1;
        }
    }

    @Override
    public void gestionarMarcha() {
        if (enMarcha == false && segurosActivados == true) {
            enMarcha = true;
        } else {
            enMarcha = false;
        }
    }

    public void moverDerecha(double d) {
        if (enMarcha == true && segurosActivados == true) {
            if (nPasajeros > 0) {
                distanciaRecorrida += d;
            }
            localizacionX += d;
        }
    }

    public void moverIzquierda(double d) {
        if (enMarcha == true && segurosActivados == true) {
            if (nPasajeros > 0) {
                distanciaRecorrida += d;
            }
            localizacionX -= d;
        }
    }

    public void moverArriba(double d) {
        if (enMarcha == true && segurosActivados == true) {
            if (nPasajeros > 0) {
                distanciaRecorrida += d;
            }
            localizacionY += d;
        }
    }

    public void moverAbajo(double d) {
        if (enMarcha == true && segurosActivados == true) {
            if (nPasajeros > 0) {
                distanciaRecorrida += d;
            }
            localizacionY -= d;
        }
    }

    public void gestionarSeguros() {
        if (enMarcha == false && segurosActivados == true) {
            segurosActivados = false;
        } else {
            segurosActivados = true;
        }
    }

    //Getters and Setters
    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public boolean isSegurosActivados() {
        return segurosActivados;
    }

    public void setSegurosActivados(boolean segurosActivados) {
        this.segurosActivados = segurosActivados;
    }
}//Fin programa
