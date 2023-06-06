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
public class Extra13 {
    public static void main (String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la altura de la escalera");
        int altura = leer.nextInt();
        String[] escalera = new String[altura];
        
        for (int i = 0; i < altura; i++) {
            if (i > 0) {
                escalera[i] = escalera[i-1].concat(String.valueOf(i+1));
            } else {
                escalera[i] = String.valueOf(i+1);
            }
            System.out.println(escalera[i]);
        }
    }
}
