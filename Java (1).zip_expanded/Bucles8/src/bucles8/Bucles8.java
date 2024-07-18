/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles8;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucles8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduce los valores, introduce 0 para salir");
        //se establece contador
        int negativos = 0;
        int positivos = 0;
        int n = 1;
        // A) Valor inicial B) Condicion que se debe cumplir C) Incremento despues de cada ciclo
        while (n != 0) {
            Scanner miscanner = new Scanner(System.in);
            n = miscanner.nextInt();
            if (n != 0) {
                if (n < 0) {
                    negativos++;

                }
                if (n > 0) {
                    positivos++;
                }
            } else {
                System.out.println("Has escogido salir");
            }
        }

        System.out.println("He contado " + negativos + " negativos\nHe contado " + positivos + " positivos");
    }

}
