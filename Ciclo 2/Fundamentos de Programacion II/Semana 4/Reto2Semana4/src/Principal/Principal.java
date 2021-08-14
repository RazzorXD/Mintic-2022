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
        Autobus camion1 = new Autobus("Anderson", 2);
        camion1.gestionarPuerta();
        camion1.recogerPasajero(1);
        camion1.recogerPasajero(3);
        camion1.recogerPasajero(6);
        camion1.gestionarMarcha();
        camion1.gestionarPuerta();
        camion1.gestionarMarcha();
        camion1.gestionarMotor();
        camion1.gestionarMarcha();
        camion1.moverArriba(1);
        camion1.moverIzquierda(2);
        camion1.moverAbajo(3);
        camion1.recogerPasajero(6);
        camion1.gestionarMarcha();
        camion1.gestionarPuerta();
        camion1.recogerPasajero(4);
    }
}
