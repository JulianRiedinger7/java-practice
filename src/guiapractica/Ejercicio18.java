/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapractica;

/**
 *
 * @author User
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        int[][] matriz, traspuesta;
        
        matriz = new int[4][4];
        traspuesta = new int[4][4];
        
        rellenarMatriz(matriz);
        mostrarMatriz(matriz);
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                traspuesta[i][j] = matriz[j][i];
            }
        }
        System.out.println("");
        mostrarMatriz(traspuesta);
    }
    
    public static void rellenarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
