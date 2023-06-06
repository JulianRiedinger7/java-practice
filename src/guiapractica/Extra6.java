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
public class Extra6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float estatura,promedioDebajo, promedioGeneral;
        
        System.out.println("Cuantas personas van a ingresar su altura?");
        int cantPersonas = leer.nextInt();
        
        
        int cantDebajo = 0;
        promedioDebajo = 0;
        promedioGeneral = 0;
        for (int i = 0; i < cantPersonas; i++) {
            System.out.println("Persona " + (i+1) + " ingrese su estatura");
            estatura = leer.nextFloat();
            promedioGeneral += estatura;
            
            if(estatura < 1.60) {
                cantDebajo += 1;
                promedioDebajo += estatura;
            }
        }
        promedioGeneral /= cantPersonas;
        promedioDebajo /= cantDebajo;
        
        System.out.println("El promedio general fue de " + promedioGeneral);
        System.out.println("El promedio debajo de 1.60 fue de " + promedioDebajo);        
    }
}
