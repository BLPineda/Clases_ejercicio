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
public class Futbolista extends Sele {
   private int dorsal;
   private String posicion;
   
   public Futbolista (int id, String Nombre, String Apellido, int edad, String posicion, int dorsal){
     super (Nombre, Apellido, id, edad);  
     this.dorsal = dorsal;
     this.posicion = posicion;
   }
   public void jugar_partido (){
       System.out.println("Jugando el partido");
   }
   public void entrenar (){
       System.out.println("Entrenando");
   }
   
   public void recibir_masaje(){
       System.out.println("Recibe el masaje");
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
