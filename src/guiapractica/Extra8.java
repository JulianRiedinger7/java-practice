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
public class Extra8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int[] cantidades = new int[3];
        int numero;
        
        cantidades[0] = 0;
        cantidades[1] = 0;
        cantidades[2] = 0;
        
        do {
            
            System.out.println("Ingrese un numero");
            numero = leer.nextInt();
            
            
            cantidades[0] += 1;
            if (numero % 2 == 0) {
                cantidades[1] += 1;
            } else {
                cantidades[2] += 1; 
            }
            
            if(numero % 5 == 0 ) break;
            
        } while(numero % 5 != 0);
        
        System.out.println("La cantidad de numero leidos fueron " + cantidades[0]);
        System.out.println("La cantidad de numero pares leidos fueron " + cantidades[1]);
        System.out.println("La cantidad de numero impares leidos fueron " + cantidades[2]);
        
        
    }   
}
