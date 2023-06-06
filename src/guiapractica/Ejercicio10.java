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
public class Ejercicio10 {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite, numIngresado;
        
        do {
            System.out.println("Ingrese un valor limite positivo");
            limite = leer.nextInt();
        } while (limite <= 0);
        
        int suma = 0;
        
        while (suma < limite) {
            System.out.println("Ingrese un numero");
            numIngresado = leer.nextInt();
            
            suma += numIngresado;
        }
        
        System.out.println("Suma es " + suma);
        System.out.println("El limite era " + limite);
        
        
    }
}
