/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strings1;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Strings1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String entrada = scan.nextLine(); 
        System.out.println("He contado "+contadorVocalesString(entrada)+" vocales");
    }
    
    public static int contadorVocalesString(String entrada){
        int contador = 0;
        for (int i = 0; i < entrada.length(); i++) {
            if (entrada.charAt(i) == 'a' || entrada.charAt(i) == 'e' || entrada.charAt(i) == 'i' || entrada.charAt(i) == 'o' || entrada.charAt(i) == 'u' || entrada.charAt(i) == 'A' || entrada.charAt(i) == 'E' || entrada.charAt(i) == 'I' || entrada.charAt(i) == 'O' || entrada.charAt(i) == 'U')
                contador++;
        }
        return contador;
    }
}
