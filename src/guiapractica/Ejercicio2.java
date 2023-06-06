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
public class Ejercicio2 {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        
        System.out.println("Ingrese su nombre: ");
        nombre = leer.nextLine();
        
        System.out.println("Hola " + nombre + " como estas?");
        
    }
}
