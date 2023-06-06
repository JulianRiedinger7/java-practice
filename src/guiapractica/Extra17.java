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
public class Extra17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para determinar si es primo");
        int num = leer.nextInt();
        
        System.out.println("El numero es primo? " + esPrimo(num));
    }
    
    public static boolean esPrimo(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0 ) {
                return false;
            }
        }
        
        return true;
        
        
    }
}
