/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles5;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucles5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se establece contador
        // A) Valor inicial B) Condicion que se debe cumplir C) Incremento despues de cada ciclo
        long factorial = 1;
        int num;
        Scanner numero = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = numero.nextInt();
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}
