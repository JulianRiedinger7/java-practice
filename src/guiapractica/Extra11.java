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
public class Extra11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero");
        int numIngresado = leer.nextInt();
        
        int cantDigitos = 0;
        
        while (numIngresado > 0) {
            numIngresado /= 10;
            System.out.println("El numero ahora es " + numIngresado);
            cantDigitos++;
        }
        
        System.out.println("La cantidad de digitos es " + cantDigitos);
        
    }
}
