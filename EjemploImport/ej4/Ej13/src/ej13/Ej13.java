/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej13;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej13 {

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
        //comprueba si  X es mas grande que y
        if (x > y) {
            System.out.println("Los numeros en orden ascendente son: " + y + " , " + x);
        } else {
            System.out.println("Los numeros en orden ascendente son: " + x + " , " + y);
        }
    }

}
