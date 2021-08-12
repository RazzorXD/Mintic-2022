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

    private boolean puertaAbierta = false;

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
        if (isEnMarcha() == false && isPuertaAbierta() == true) {
            if (getnPasajeros() < getnMaximoPasajeros()) {
                setnPasajeros(getnPasajeros() + 1);
                setCantidadDinero(getCantidadDinero() + this.calcularPasaje(estrato));
            }
        }
    }

    public void gestionarPuerta() {
        if (puertaAbierta == false && isEnMarcha() == false) {
            puertaAbierta = true;
        } else {
            puertaAbierta = false;
        }
    }

    @Override
    public void gestionarMarcha() {
        if (isEnMarcha() == false && puertaAbierta == false) {
            setEnMarcha(true);
        } else {
            setEnMarcha(false);
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
