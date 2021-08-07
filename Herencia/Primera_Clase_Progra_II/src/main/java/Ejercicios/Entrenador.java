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
public class Entrenador extends Sele {
   private int idfederacion;
   
   public Entrenador (int id, String Nombre, String Apellido, int edad, int idfederacion){
       super (Nombre, Apellido, id, edad);
       this.idfederacion = idfederacion;
   }
 public void Dirigir_partido(){
     System.out.println("Dirige el partido");
 }
 public void Dirigir_entrenamiento(){
     System.out.println("Dirige el entrenamiento");
 }
    public int getIdfederacion() {
        return idfederacion;
    }

    public void setIdfederacion(int idfederacion) {
        this.idfederacion = idfederacion;
    }
   
}
