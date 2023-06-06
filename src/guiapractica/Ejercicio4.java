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
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double celsius,fahrenheit;
        
        System.out.println("Ingrese una temperatura en grados celsius: ");
        celsius = leer.nextDouble();
        
        fahrenheit = 32 + (9 * celsius / 5);
        
        System.out.println(celsius + " grados celsius, son " + fahrenheit + " grados fahrenheit");
    }
}
