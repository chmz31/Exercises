/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej16;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Iniciamos el escaner
        Scanner miscanner = new Scanner(System.in);
        int nota;

        //pedimos que introduzca la nota
        System.out.print("Introduce tu nota: ");
        nota = miscanner.nextInt();

        //El sistema comprueba en que rango esta la nota y imprime el resultado adecuado
        if (nota > 0 && nota <= 3) {
            System.out.println("Tu nota es: Muy deficiente ");
        } else {
            if (nota > 3 && nota <= 5) {
                System.out.println("Tu nota es: Insuficiente ");
            } else {
                if (nota > 5 && nota <= 6) {
                    System.out.println("Tu nota es: Bien ");
                } else {
                    if (nota > 6 && nota <= 9) {
                        System.out.println("Tu nota es: Notable ");
                    } else {
                        if (nota > 9 && nota <= 10) {
                            System.out.println("Tu nota es: Excelente ");
                        }
                    }
                }
            }
        }
    }
}
