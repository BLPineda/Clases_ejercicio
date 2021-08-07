/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra_ii.primera_clase_progra_ii;

import java.util.Scanner;

/**
 *
 * @author lenin
 */
public class Primerproyecto {
    public static double a;
    public static double b;
    public static double c;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       
        
            System.out.println("Elije entre Suma (1), resta(2) o división(3)");
            int d = sc.nextInt();
        switch (d) {
            case 1:
                suma ();
                break;
            default:
                break;
        }
            
    }
    
    public static void suma (){
       System.out.println("Ingresa dos números");
            a = sc.nextInt();
            b = sc.nextInt();
        c=a+b;
        System.out.println("La suma de los valores es: "+c);
    }
}
