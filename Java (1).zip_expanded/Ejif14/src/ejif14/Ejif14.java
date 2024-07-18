/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejif14;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejif14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miscanner = new Scanner(System.in);
        int x;
        System.out.print("Introduce un numero del 1 al 5: ");
        x = miscanner.nextInt();
        // Comprueba que el numero dado entre en el rango
        if (x >= 1 && x <= 5) {
            //Codigo logico para comprobar si el nombre es primero
            if (x  == 1 || x == 2 || x == 3 || x == 5) {
                System.out.println("El numero es primo");
            } else {
                System.out.println("El numero no es primo");
            }
        } else {
            System.out.println("Lo siento, aprende a contar");
        }
    }
}
