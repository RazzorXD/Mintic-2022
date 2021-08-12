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
public class Main {

    public static void main(String[] args) {
        Autobus c = new Autobus("Pepe", 3);
        c.gestionarMotor();
        c.gestionarAireAcondicionado();
        c.gestionarMarcha();
        c.gestionarWifi();
        c.gestionarMotor();

//*****Evaluació del taxi ****
        // el calificador enciende el motro, intenta poner en marcha el taxi, y recoge un pasajero
        Taxi b = new Taxi("Pepe");
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
