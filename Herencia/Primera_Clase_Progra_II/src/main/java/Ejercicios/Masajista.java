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
public class Masajista extends Sele {
    private String titulacion;
    private int añosexperiencia;
    
    public Masajista (int id, String Nombre, String Apellido, int edad, String titulacion, int añosexperiencia){
        super(Nombre, Apellido, id, edad);
        this.añosexperiencia = añosexperiencia;
        this.titulacion = titulacion;
    }

    public void dar_masaje (){
        System.out.println("Da masaje");
   }
    
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosexperiencia() {
        return añosexperiencia;
    }

    public void setAñosexperiencia(int añosexperiencia) {
        this.añosexperiencia = añosexperiencia;
    }
    
    
}
