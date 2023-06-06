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
public class Ejercicio12 {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        String FDE = "&&&&&";
        int incorrectas = 0;
        int correctas = 0;
        
        do {
            System.out.println("Ingrese una cadena");
            cadena = leer.nextLine();
            
            if (cadena.startsWith("X") && cadena.endsWith("O")) {
                correctas += 1;
            } else {
                incorrectas += 1;
            }
            
        } while (!cadena.equals(FDE));
        
        System.out.println("La cantidad de lecturas correctas es " + correctas);
        System.out.println("La cantidad de lecturas incorrectas es " + incorrectas);
    }
}
