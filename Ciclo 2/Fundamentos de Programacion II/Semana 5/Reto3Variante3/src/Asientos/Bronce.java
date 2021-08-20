/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asientos;

/**
 *
 * @author kevin
 */
public class Bronce extends Asiento{

    public Bronce(String ID, char tipo) {
        super(ID, tipo);
    }
    
    @Override
    public String imprimirMenuPantalla() {
        return "BRONCE";
    }
    
}
