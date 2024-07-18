/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringtowords;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class StringToWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String cadena = scan.nextLine();
        String[] partes = cadena.split(" ");
        for (int i = 0; i < partes.length; i++) {
            System.out.println(partes[i]);
        }
        
    }
    
}
