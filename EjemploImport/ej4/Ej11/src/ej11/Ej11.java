/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lee los numeros que introducimos
        Scanner miscanner = new Scanner(System.in);
        int x;
        System.out.print("Introduce el primer numero: ");
        x = miscanner.nextInt();

        Scanner elscanner = new Scanner(System.in);
        int y;
        System.out.print("Introduce el segundo numero: ");
        y = elscanner.nextInt();

        if (x > y) {
            System.out.print(x + " es mas grande");
        } else if (x == y) {
            System.out.print(x + " y " + y + " son iguales");
        } else {

            System.out.print(y + " es mas grande");
        }

    }
}
