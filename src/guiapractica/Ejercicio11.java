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
public class Ejercicio11 {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);
        float num1,num2, resultado;
        int opcion;
        String salir = "N";
        
        System.out.println("Ingrese un numero");
        num1 = leer.nextFloat();
        System.out.println("Ingrese un numero");
        num2 = leer.nextFloat();
        
        do {
            do {
            System.out.println("MENU \n 1. Sumar \n 2. Restar \n 3. Multiplicar \n 4. Dividir \n 5. Salir \n Elija opcion:");
            opcion = leer.nextInt();
        } while (opcion < 1 || opcion > 5);

        if (opcion == 5) {
            System.out.println("Esta seguro que desea salir del programa? (S/N)");
            salir = leer.nextLine();
            if (salir.equalsIgnoreCase("S")) {
               break;
            }
        }
       
        
        switch(opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("El resultado es " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("El resultado es " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("El resultado es " + resultado);
                break;
            case 4:
                resultado = num1 / num2;
                System.out.println("El resultado es " + resultado);
                break;
        }

        } while (opcion != 5 && !salir.equalsIgnoreCase("S"));
        
                
    }
}
