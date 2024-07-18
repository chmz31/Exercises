/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej15;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lee los numeros que introducimos
        Scanner miscanner = new Scanner(System.in);
        int x;
        System.out.print("Introduce el primer numero: ");
        x = miscanner.nextInt();

        Scanner segundoscanner = new Scanner(System.in);
        int y;
        System.out.print("Introduce el segundo numero: ");
        y = segundoscanner.nextInt();

        Scanner tercerscanner = new Scanner(System.in);
        int z;
        System.out.print("Introduce el tercer numero: ");
        z = tercerscanner.nextInt();
        //caso X mayor que todo
        if (x >= y && x >= z) {
            System.out.println(x + " es mayor");
        } else {
            //caso y mayor que todo
            if (y >= x && y >= z) {
                System.out.println(y + " es mayor");
            }
            //caso z mayor que todo
            if (z >= x && z >= y) {
                System.out.println(z + " es mayor");
            }
        } 
    }
}
