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
public class Partido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sele sele [] = new Sele [3];
        Entrenador fergie = new Entrenador (1, "Alex", "Ferguson", 79, 001);
        Masajista masajista = new Masajista (1, "Carlos", "Del Cid", 30, "Masajista", 5);
        Futbolista futbolista = new Futbolista (1, "Wayne", "Rooney", 35, "Media punta", 10);
        
        sele [0] = fergie;
        sele [1] = masajista;
        sele [2] = futbolista;
        
        for (int i = 0; i < sele.length; i++){
            System.out.print(sele[i].getNombre() + " " + sele[i].getApellido() + " -> ");
            sele[i].Concentrarse();
        }
        System.out.println("\n Empieza el entrenamiento \n");
        System.out.print(fergie.getNombre() + " " + fergie.getApellido() + " -> ");
        fergie.Dirigir_entrenamiento();
        System.out.println(futbolista.getNombre() + " " + futbolista.getApellido() + " -> ");
        futbolista.entrenar();
        
            System.out.println("\n Empieza el partido \n");
            System.out.print(fergie.getNombre() + " " + fergie.getApellido() + " -> " );
            fergie.Dirigir_partido();
            System.out.print(futbolista.getNombre() + " " + futbolista.getApellido() + " -> ");
            futbolista.jugar_partido();
            
        System.out.println("\n Empieza el descanso postpartido \n");
        System.out.print(futbolista.getNombre() + " " + futbolista.getApellido() + " -> ");
        futbolista.recibir_masaje();
        System.out.print(masajista.getNombre() + " " + masajista.getApellido() + " -> ");
        masajista.dar_masaje();
    }
    
}
