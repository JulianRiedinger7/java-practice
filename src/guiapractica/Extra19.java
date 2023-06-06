/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapractica;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Extra19 {
   public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       System.out.println("Ingrese la longitud de los vectores");
       int longitud = leer.nextInt();
       
       int[] vect1 = new int[longitud];
       int[] vect2 = new int[longitud];   
       
       llenarVector(vect1);
       mostrarVector(vect1);
       llenarVector(vect2);
       mostrarVector(vect2);
       
       System.out.println("Son iguales los vectores? " + sonIguales(vect1, vect2));
   }
   
   public static void llenarVector(int[] vect) {
       for (int i = 0; i < vect.length; i++) {
           vect[i] = (int) (Math.random() * 10);
       }
   }
   
   public static void mostrarVector(int[] vect) {
       for (int i = 0; i < vect.length; i++) {
           System.out.print(vect[i] + " ");
       }
       System.out.println("");
   }
   
   public static boolean sonIguales(int[] vect1, int[] vect2 ) {
       for (int i = 0; i < vect1.length; i++) {
           if (vect1[i] != vect2[i]) {
               return false;
           }
       }
       
       return true;
   }
   
}
