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
public class Extra12 {

    public static void main(String[] args) {
        String[] digitos = new String[3];
        
        mostrarDigitos(digitos);

    }

    public static void mostrarDigitos(String[] digitos) {
        for (int i = 0; i < 10; i++) {
            digitos[0] = String.valueOf(i);
            if (digitos[0].equals("3")) {
                digitos[0] = "E";
            }
            for (int j = 0; j < 10; j++) {
                digitos[1] = String.valueOf(j);
                if (digitos[1].equals("3")) {
                    digitos[1] = "E";
                }
                for (int k = 0; k < 10; k++) {
                    digitos[2] = String.valueOf(k);
                    if (digitos[2].equals("3")) {
                        digitos[2] = "E";
                    }
                    
                    System.out.println(digitos[0] + "-" + digitos[1] + "-" + digitos[2]);
                }

            }
        }
    }
}