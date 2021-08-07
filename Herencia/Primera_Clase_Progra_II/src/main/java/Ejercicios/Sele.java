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
public class Sele {

    private String Nombre;
    private String Apellido;
    private int id;
    private int edad;
    
    public Sele(String Nombre, String Apellido, int id, int edad){
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.edad = edad;
        this.id = id;
    }
    public void Concentrarse (){
        System.out.println("Concentrandose");
    }
     public void Viajar(){
         System.out.println("Viajando");
     }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
     
}
