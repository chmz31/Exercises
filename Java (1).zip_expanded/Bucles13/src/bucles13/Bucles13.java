/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles13;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucles13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicializamos las variables
        int numero, numeroPC, max = 100, min = 1,acierto=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el numero en el que piensas entre el 1 y el 100, yo intentare adivinarlo");
        numero = scan.nextInt();
        numeroPC = (int) (Math.random() * (max - min) + min);
        while (numeroPC != numero) {
            numeroPC = (int) (Math.random() * (max - min) + min);
            System.out.println("Creo que tu numero es: " + numeroPC + " he acertado?");
            System.out.println("(1)Mas grande\t(2)Mas pequeño\t(0)Acierto");
            int opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    min = numeroPC;
                    break;
                case 2:
                    max = numeroPC;
                    break;
                case 0:
                    if (numeroPC == numero){
                    System.out.println("Lo sabia!");
                    break;
                    }
            }
        }
        System.out.println("Gracias por jugar");
    }
}