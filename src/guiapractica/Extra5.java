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
public class Extra5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una clase de socio");
        char letra = leer.nextLine().charAt(0);
        
        System.out.println("Ingrese el costo del tratamiento");
        float costo = leer.nextFloat();
        
        costo = totalAPagar(letra, costo);
        
        System.out.println("El costo a pagar para la clase " + letra + " es " + costo);
    }
    
    public static float totalAPagar(char clase, float costo) {
        switch(clase) {
            case 'A':
            return costo -= costo * 0.5;
            case 'B':
            return costo -= costo * 0.35;
            default:
                return costo;
        }
    }
}
