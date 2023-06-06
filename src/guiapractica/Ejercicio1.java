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
public class Ejercicio1 {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2,suma;
        
        System.out.println("Ingrese dos numeros enteros");
        num1 = leer.nextInt();
        num2= leer.nextInt();
        
        suma = num1 + num2;
        
        System.out.println("La suma entre " + num1 + " y " + num2 + " es " + suma );

    }
}
