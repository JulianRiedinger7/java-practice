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
public class Extra3 {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una letra para determinar si es una vocal");
        String letra = leer.nextLine();
        
        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") ||letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U") ) {
            System.out.println("La letra es una vocal");
        } else {
            System.out.println("La letra NO es una vocal");
        }
        
        
    }
}
