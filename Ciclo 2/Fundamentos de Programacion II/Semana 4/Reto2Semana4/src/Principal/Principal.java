/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Vehiculos.*;

/**
 *
 * @author kevin
 */
public class Principal {

    public static void main(String[] args) {
        Taxi b = new Taxi("pepe");
        b.gestionarMotor();
        b.recogerPasajero();
        b.gestionarSeguros();
        b.gestionarMarcha();
        b.moverAbajo(5);
        b.moverDerecha(6);
        b.moverIzquierda(2);
        b.gestionarSeguros();
        b.gestionarMarcha();
        b.dejarPasajero();
        b.dejarPasajero();
        b.gestionarSeguros();
        b.dejarPasajero();
        b.recogerPasajero();
        b.gestionarSeguros();
        b.moverArriba(1);
        b.gestionarMarcha();
        b.gestionarSeguros();
        b.dejarPasajero();
    }
}
