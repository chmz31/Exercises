/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej12;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lee los numeros que introducimos
        Scanner miscanner = new Scanner(System.in);
        int x;
        System.out.print("Introduce el primer numero: ");
        x = miscanner.nextInt();

        if (x >= 0) {
            System.out.print(x + " es un numero positivo");
        } else {
            System.out.print(x + " es un numero negativo");
        }
    }

}
