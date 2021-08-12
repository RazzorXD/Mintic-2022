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

    private double distanciaRecorrida = 0;
    private boolean segurosActivados = false;

    //Constructor
    public Taxi(String nombreConductor) {
        super(nombreConductor);
        setnMaximoPasajeros(1);
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
        setEnMarcha(false);
        segurosActivados = false;
        dejarPasajero();
        setCantidadDinero(getCantidadDinero() - this.calcularPasaje());
    }

    public void dejarPasajero() {
        if (getnPasajeros() > 0 && isEnMarcha() == false && segurosActivados == false) { //ultima comprobacion agregada
            setnPasajeros(getnPasajeros() - 1);
            setCantidadDinero(getCantidadDinero() + this.calcularPasaje());
            reiniciarTaximetro();
        }
    }

    public void recogerPasajero() {
        if (isEnMarcha() == false && segurosActivados == false && getnPasajeros() < getnMaximoPasajeros()) {
            setnPasajeros(getnPasajeros() + 1);
        }
    }

    @Override
    public void gestionarMarcha() {
        if (isEnMarcha() == false && segurosActivados == true) {
            setEnMarcha(true);
        } else {
            setEnMarcha(false);
        }
    }

    public void moverDerecha(double d) {
        if (isEnMarcha() == true && segurosActivados == true) {
            if (getnPasajeros() > 0) {
                distanciaRecorrida += d;
            }
            setLocalizacionX(getLocalizacionX() + d);
        }
    }

    public void moverIzquierda(double d) {
        if (isEnMarcha() == true && segurosActivados == true) {
            if (getnPasajeros() > 0) {
                distanciaRecorrida += d;
            }
            setLocalizacionX(getLocalizacionX() - d);
        }
    }

    public void moverArriba(double d) {
        if (isEnMarcha() == true && segurosActivados == true) {
            if (getnPasajeros() > 0) {
                distanciaRecorrida += d;
            }
            setLocalizacionY(getLocalizacionY() + d);
        }
    }

    public void moverAbajo(double d) {
        if (isEnMarcha() == true && segurosActivados == true) {
            if (getnPasajeros() > 0) {
                distanciaRecorrida += d;
            }
            setLocalizacionY(getLocalizacionY() - d);
        }
    }

    public void gestionarSeguros() {
        if (isEnMarcha() == false && segurosActivados == true) {
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
