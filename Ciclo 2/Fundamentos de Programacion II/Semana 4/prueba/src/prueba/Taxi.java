/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author kevin
 */
public class Taxi extends vehiculo {
    //           ^ (Taxi hereda de Vehiculo)
    //Inserte acá los atributos

    private double distanciaRecorrida = 0;
    private boolean segurosActivados = false;

    //Inserte acá el método constructor
    public Taxi(String nombreConductor) {
        super(nombreConductor, 1);
    }

    public Taxi(boolean segurosActivados, String nombreConductor, int nMaximoPasajeros) {
        super(nombreConductor, nMaximoPasajeros);
        this.segurosActivados = segurosActivados;
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void reiniciarTaximetro() {
        this.setDistanciaRecorrida(0);

    }

    public void presionarBotonPanico() {
        reiniciarTaximetro();
        this.setEnMarcha(false);
        this.setSegurosActivados(false);
        this.setnPasajeros(0);

    }

    @Override
    public void dejarPasajero() {
        if (this.getnPasajeros() > 0 && isEnMarcha() == false) {
            this.setnPasajeros(this.getnPasajeros() - 1);
            this.setCantidadDinero(this.getCantidadDinero() + this.calcularPasaje());
            this.reiniciarTaximetro();
        }
    }

    public void recogerPasajero() {
        if (!this.isSegurosActivados() && this.getnPasajeros() == 0) {
            this.setnPasajeros(this.getnPasajeros() + 1);

        }
    }

    @Override
    public void gestionarMarcha() {
        this.setEnMarcha(!this.isEnMarcha() && this.segurosActivados);

    }

    @Override
    public void moverDerecha(double d) {
        if (this.isEnMarcha() && isSegurosActivados()) {
            if (this.getnPasajeros() > 0) {
                this.setDistanciaRecorrida(this.getDistanciaRecorrida() + d);
            }
            this.setLocalizacionX(this.getLocalizacionX() + d);
        }
    }

    @Override
    public void moverIzquierda(double d) {
        if (this.isEnMarcha() && isSegurosActivados()) {
            if (this.getnPasajeros() > 0) {
                this.setDistanciaRecorrida(this.getDistanciaRecorrida() + d);
            }
            this.setLocalizacionX(this.getLocalizacionX() - d);
        }
    }

    @Override
    public void moverArriba(double d) {
        if (this.isEnMarcha() && isSegurosActivados()) {
            if (this.getnPasajeros() > 0) {
                this.setDistanciaRecorrida(this.getDistanciaRecorrida() + d);
            }
            this.setLocalizacionY(this.getLocalizacionY() + d);
        }
    }

    @Override
    public void moverAbajo(double d) {
        if (this.isEnMarcha() && isSegurosActivados()) {
            if (this.getnPasajeros() > 0) {
                this.setDistanciaRecorrida(this.getDistanciaRecorrida() + d);
            }
            this.setLocalizacionY(this.getLocalizacionY() - d);
        }
    }

    public double calcularPasaje() {
        return 3000 + 2300 * (this.getDistanciaRecorrida());

    }

    public void gestionarSeguros() {
        if (!this.isEnMarcha() && this.isSegurosActivados()) {
            this.setSegurosActivados(false);
        } else {
            this.setSegurosActivados(true);
        }
    }

    //Inserte acá los SETTERS Y GETTERS
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

}
