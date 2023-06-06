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
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tamanio, numABuscar;
        System.out.println("Ingrese el tamanio del vector");
        tamanio = leer.nextInt();
        int[] vector = new int[tamanio];
        llenarVector(vector);
        
        System.out.println("Ingrese un numero a buscar en el vector");
        numABuscar = leer.nextInt();
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
             
        buscarNumero(vector, numABuscar);
        
    }
    
    public static void llenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 20);
        }
    }
    
    public static void buscarNumero(int[] vector, int num) {
        boolean encontrado = false;
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                System.out.println("El numero " + num + " se encontro en la posicion " + i);
                encontrado = true;
            }
        }
        
        if (!encontrado) System.out.println("El numero " + num + " no se encontro");
    }
}
