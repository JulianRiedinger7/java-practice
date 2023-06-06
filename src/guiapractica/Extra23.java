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
public class Extra23 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] matrizSopa = new String[20][20];

        for (int i = 0; i < 5; i++) {
            String palabra;
            do {
                System.out.println("Ingrese una palabra entre 3 y 5 caracteres");
                palabra = leer.nextLine();
            } while (palabra.length() < 3 || palabra.length() > 5);

            int filaAColocar;
            do {
                filaAColocar = (int) (Math.random() * 20);
            } while (matrizSopa[filaAColocar][0] != null);

            for (int j = 0; j < palabra.length(); j++) {
                matrizSopa[filaAColocar][j] = palabra.substring(j, j + 1);
            }

        }

        mostrarMatriz(matrizSopa);
        reemplazarVacios(matrizSopa);
        mostrarMatriz(matrizSopa);
    }

    public static void mostrarMatriz(String[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void reemplazarVacios(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == null) {
                    int random  = (int) (Math.random() * 9);
                    matriz[i][j] = String.valueOf(random);
                }
            }
        }
    }
}
