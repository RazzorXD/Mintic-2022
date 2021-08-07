/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Personaje;
import java.util.*;

/**
 *
 * @author kevin
 */
public class Personaje {
    private String nombre;
    private char sexo;
    private double posicionX = 0;
    private double posicionY = 0;
    private double distanciaTotal = 0;
    private int numeroBotiquines = 0;
    private double vida = 100;

    public Personaje(String nombre, char sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }
    public void recogerBotiquin(){
        numeroBotiquines += 1;
    }
    
    public void usarBotiquin(){
        if(numeroBotiquines > 0 && vida <= 95){
            numeroBotiquines -= 1;
            vida += 5;
        }
    }
    
    public void moverDerecha(double d){
        posicionX += d;
        distanciaTotal += d;
    }
    
    public void moverIzquierda(double d){
        posicionX -= d;
        distanciaTotal += d;
    }
    
    public void moverArriba(double d){
        posicionY += d;
        distanciaTotal += d;
    }
    
    public void moverAbajo(double d){
        posicionY -= d;
        distanciaTotal += d;
    }
    
    public double calcularDistanciaRespectoOrigen(){
        double recorrido = Math.sqrt(Math.pow(posicionX,2) + Math.pow(posicionY,2));
        return recorrido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public double getDistanciaTotal() {
        return distanciaTotal;
    }

    public void setDistanciaTotal(double distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
    
    
}
