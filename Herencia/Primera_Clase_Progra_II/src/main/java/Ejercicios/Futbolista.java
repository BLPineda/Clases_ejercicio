/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author lenin
 */
public class Futbolista extends Herencia_Seleccionfutbol {
   private int dorsal;
   private String posicion;
   
   public Futbolista (){
     super ();  
   }
   public void jugar_partido (){
       
   }
   public void entrenar (){
       
   }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
   
}
