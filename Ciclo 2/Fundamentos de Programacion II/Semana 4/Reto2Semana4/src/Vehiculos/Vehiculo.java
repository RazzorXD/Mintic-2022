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
public abstract class Vehiculo {

    private String nombreConductor;
    private int nPasajeros = 0;
    private int nMaximoPasajeros;
    private double cantidadDinero = 0;
    private double localizacionX = 0;
    private double localizacionY = 0;
    private boolean aireAcondicionadoActivado = false;
    private boolean motorEncendido = false;
    private boolean wifiEncendido = false;
    private boolean enMarcha = false;

    //Constructor
    public Vehiculo(String nombreConductor, int nMaximoPasajeros) {
        this.nombreConductor = nombreConductor;
        this.nMaximoPasajeros = nMaximoPasajeros;
    }

    public Vehiculo(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    //Metodos asociados
    public void dejarPasajero() {
        if(getnPasajeros() > 0)
            nPasajeros -= 1;
    }

    public double calcularDistanciaAcopio() {
        return Math.sqrt(Math.pow(localizacionX, 2) + Math.pow(localizacionY, 2));
    }

    public void gestionarAireAcondicionado() {
        if (motorEncendido == true && aireAcondicionadoActivado == false) {
            aireAcondicionadoActivado = true;
        } else {
            aireAcondicionadoActivado = false;
        }
    }

    public void gestionarMotor() {
        if (motorEncendido == false) {
            motorEncendido = true;
        } else {
            motorEncendido = false;
            aireAcondicionadoActivado = false;
            wifiEncendido = false;
            enMarcha = false;
        }
    }

    public void gestionarWifi() {
        if (motorEncendido == true && wifiEncendido == false) {
            wifiEncendido = true;
        } else {
            wifiEncendido = false;
        }
    }

    public abstract void gestionarMarcha();

    public void moverDerecha(double d) {
        if (enMarcha == true) {
            localizacionX += d;
        }
    }

    public void moverIzquierda(double d) {
        if (enMarcha == true) {
            localizacionX -= d;
        }
    }

    public void moverArriba(double d) {
        if (enMarcha == true) {
            localizacionY += d;
        }
    }

    public void moverAbajo(double d) {
        if (enMarcha == true) {
            localizacionY -= d;
        }
    }

    //Getters y Setters
    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public int getnMaximoPasajeros() {
        return nMaximoPasajeros;
    }

    public void setnMaximoPasajeros(int nMaximoPasajeros) {
        this.nMaximoPasajeros = nMaximoPasajeros;
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public double getLocalizacionX() {
        return localizacionX;
    }

    public void setLocalizacionX(double localizacionX) {
        this.localizacionX = localizacionX;
    }

    public double getLocalizacionY() {
        return localizacionY;
    }

    public void setLocalizacionY(double localizacionY) {
        this.localizacionY = localizacionY;
    }

    public boolean isAireAcondicionadoActivado() {
        return aireAcondicionadoActivado;
    }

    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
        this.aireAcondicionadoActivado = aireAcondicionadoActivado;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public boolean isWifiEncendido() {
        return wifiEncendido;
    }

    public void setWifiEncendido(boolean wifiEncendido) {
        this.wifiEncendido = wifiEncendido;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }
}//Fin programa
