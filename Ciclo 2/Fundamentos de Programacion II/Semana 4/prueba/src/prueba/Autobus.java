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
public class Autobus  extends vehiculo {
    //              ^ (Autobus hereda de Vehiculo)
    //Inserte acá los atributos
     private boolean puertaAbierta = false;
    
    
    //Inserte acá el método constructor
    public Autobus(String nombreConductor, int nMaximoPasajeros) {
        super(nombreConductor, nMaximoPasajeros);
      }
    
    
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    
    public void recogerPasajero(int estrato){
       // this.setCantidadDinero(this.getCantidadDinero() + this.calcularPasaje(estrato));
       
        if (this.getnPasajeros() < this.getnMaximoPasajeros() && this.puertaAbierta){
            this.setCantidadDinero(this.getCantidadDinero()+ calcularPasaje(estrato));
            this.setnPasajeros(this.getnPasajeros()+1);
        }
     }     
       
     
     public void gestionarPuerta(){
           this.puertaAbierta = !this.isEnMarcha() && !this.puertaAbierta;
           //this.setnPasajeros(this.getnPasajeros()-1);

         
     }
    @Override
    public void gestionarMarcha(){
    
       setEnMarcha(!this.isEnMarcha() && !this.isPuertaAbierta() );
    }
          
    
    public static double calcularPasaje(int estrato){
        if (estrato == 0 || estrato==1 || estrato ==2 ){
              return 1500;
        }else if (estrato == 3|| estrato ==4){
                 return 2600;
            }
            else
            {
              return 3000;
            }
    }
    
    //Inserte acá los SETTERS Y GETTERS
   // public void setEnMarcha(boolean enMarcha) {
    //    enMarcha = enMarcha;
    //}
    
    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }
     
    
}
