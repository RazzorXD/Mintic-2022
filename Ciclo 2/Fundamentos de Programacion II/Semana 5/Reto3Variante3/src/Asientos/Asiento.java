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
public abstract class Asiento {

    //Variables
    private String ID;
    private char tipo;
    private boolean pantallaEncendida = false;
    private double inclinacionSilla = 90;
    private boolean luzLecturaEncendida = false;
    private boolean luzAsistenciaEncendida = false;
    private boolean aireAcondicionadoEncendido = false;

    //Constructor
    public Asiento(String ID, char tipo) {
        this.ID = ID;
        this.tipo = tipo;
    }

    //Metodos asociados
    public void gestionarAireAcondicionado() {
        if (!isAireAcondicionadoEncendido()) {
            setAireAcondicionadoEncendido(true);
        } else {
            setAireAcondicionadoEncendido(false);
        }
    }

    public void gestionarPantalla() {
        if (!isPantallaEncendida()) {
            setPantallaEncendida(true);
        } else {
            setPantallaEncendida(false);
        }
    }

    public void gestionarLuzLectura() {
        if (!isLuzLecturaEncendida()) {
            setLuzLecturaEncendida(true);
        } else {
            setLuzLecturaEncendida(false);
        }
    }

    public void gestionarLuzAsistencia() {
        if (!isLuzAsistenciaEncendida()) {
            setLuzAsistenciaEncendida(true);
        } else {
            setLuzAsistenciaEncendida(false);
        }
    }

    public void aumentarInclinacion(double d) {
        if (inclinacionSilla + d > 135) {
            inclinacionSilla = 135;
        } else {
            inclinacionSilla += d;
        }
    }

    public void disminuirInclinacion(double d) {
        if (inclinacionSilla - d < 0) {
            inclinacionSilla = 0;
        } else {
            inclinacionSilla -= d;
        }
    }

    public abstract String imprimirMenuPantalla();

    //Getters y Setters
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public boolean isPantallaEncendida() {
        return pantallaEncendida;
    }

    public void setPantallaEncendida(boolean pantallaEncendida) {
        this.pantallaEncendida = pantallaEncendida;
    }

    public double getInclinacionSilla() {
        return inclinacionSilla;
    }

    public void setInclinacionSilla(double inclinacionSilla) {
        this.inclinacionSilla = inclinacionSilla;
    }

    public boolean isLuzLecturaEncendida() {
        return luzLecturaEncendida;
    }

    public void setLuzLecturaEncendida(boolean luzLecturaEncendida) {
        this.luzLecturaEncendida = luzLecturaEncendida;
    }

    public boolean isLuzAsistenciaEncendida() {
        return luzAsistenciaEncendida;
    }

    public void setLuzAsistenciaEncendida(boolean luzAsistenciaEncendida) {
        this.luzAsistenciaEncendida = luzAsistenciaEncendida;
    }

    public boolean isAireAcondicionadoEncendido() {
        return aireAcondicionadoEncendido;
    }

    public void setAireAcondicionadoEncendido(boolean aireAcondicionadoEncendido) {
        this.aireAcondicionadoEncendido = aireAcondicionadoEncendido;
    }

}
