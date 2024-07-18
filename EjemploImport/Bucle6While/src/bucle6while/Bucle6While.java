/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle6while;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucle6While {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce 10 valores");
        //se establece contador
        int contador = 10;
        int negativos = 0;
        // A) Valor inicial B) Condicion que se debe cumplir C) Incremento despues de cada ciclo
        while (contador >= 1) {
            Scanner miscanner = new Scanner(System.in);
            int n = miscanner.nextInt();
            if (n != 0) {
                if (n < 0) {
                    negativos++;
                }
                contador--;
            } else {
                System.out.println("Has introducido un valor invalido");
            }
        }
        System.out.println("He contado " + negativos + " negativos");
    }
}