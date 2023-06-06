/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapractica;


/**
 *
 * @author User
 */
public class Ejercicio15 {
    public static void main (String[] args) {        
        int[] vector = new int[100];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i;
        }
        
        mostrarVector(vector);
        
    }
    
   public static void mostrarVector(int[] vector) {
       for (int i = vector.length - 1; i > 0; i--) {
           System.out.println(vector[i]);
       }
   }
}
