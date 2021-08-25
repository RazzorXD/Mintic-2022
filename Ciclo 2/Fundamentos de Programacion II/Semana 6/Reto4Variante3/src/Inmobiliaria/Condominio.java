/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inmobiliaria;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class Condominio {

    //Variables
    ArrayList<Inmueble> inmuebles = new ArrayList<>();
    double arriendosMensuales = 0;
    double promedioCostoinmueble = 0;

    //Constructor
    public Condominio() {
    }

    //Metodos Asociados
    public void agregarInmueble(Inmueble i) {
        if (!inmuebles.contains(i)) {
            inmuebles.add(i);
        }
    }

    public void eliminarInmueble(String ID) {
        for (int i = 0; i < inmuebles.size(); i++) {
            if (ID.equals(String.valueOf(inmuebles.get(i).getnCasa()))) { //se corrigio de ID == String... a Id.equals(String...)
                inmuebles.remove(i);
            }
            
        }
    }

    public double calcularArriendoMensualCondominio() {
        for (int i = 0; i < inmuebles.size(); i++) {
            arriendosMensuales += inmuebles.get(i).getCostoMensual();
        }
        return arriendosMensuales;

    }

    public double promedioCostoInmueble() {
        promedioCostoinmueble = arriendosMensuales / inmuebles.size();
        return promedioCostoinmueble;

    }

    public double desviacionEstandarCostoInmueble() {
        double suma;
        double varianza = 0;
        for (int i = 0; i < inmuebles.size(); i++) {
            suma = Math.pow(inmuebles.get(i).getCostoMensual() - promedioCostoInmueble(), 2);
            varianza += suma;
        }
        varianza = varianza / inmuebles.size();
        return Math.sqrt(varianza);
    }

    public void mostrar() { //Metodo no necesario en la presentacion
        for (int i = 0; i < inmuebles.size(); i++) {
            System.out.println(inmuebles.get(i).getnCasa());
            System.out.println(inmuebles.get(i).getIDArrendador());
            System.out.println(inmuebles.get(i).getCostoMensual());
            System.out.println(inmuebles.get(i).getCantidadMesesArrendado());
        }
    }

    //Getters y Setters
    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(ArrayList<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }

    public double getArriendosMensuales() {
        return arriendosMensuales;
    }

    public void setArriendosMensuales(double arriendosMensuales) {
        this.arriendosMensuales = arriendosMensuales;
    }

    public double getPromedioCostoinmueble() {
        return promedioCostoinmueble;
    }

    public void setPromedioCostoinmueble(double promedioCostoinmueble) {
        this.promedioCostoinmueble = promedioCostoinmueble;
    }

}
