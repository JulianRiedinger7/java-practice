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
public class Extra10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1, num2, resultado, ingresado;

        num1 = (int) (Math.random() * 10);
        num2 = (int) (Math.random() * 10);
        
        resultado = num1 * num2;
        
        System.out.println("Resultado" + resultado);
        
        do {
            System.out.println("Ingrese un numero");
            ingresado = leer.nextInt();
            
            if (resultado == ingresado) {
                System.out.println("Correcto");
                break;
            } else {
                System.out.println("Incorrecto");
            }
            
        } while (ingresado != resultado);
    }
}
