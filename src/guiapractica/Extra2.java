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
public class Extra2 {
    public static void main(String[] args) {
        int A,B,C,D,aux;
        
        A = 5;
        B = 10;
        C = 15;
        D = 20;
        
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        
        System.out.println("A" + A);
        System.out.println("B" + B);
        System.out.println("C" + C);
        System.out.println("D" + D);

        
    }
}
