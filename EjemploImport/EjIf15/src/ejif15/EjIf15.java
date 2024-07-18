/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejif15;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjIf15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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

        //comprueba los mayores y ordena
        if (x > y && x > z) {
            if (y > z) {
                System.out.println("Los numeros en orden ascendente son:  ");
                System.out.println(+z);
                System.out.println(+y);
                System.out.println(+x);
            } else {
                System.out.println("Los numeros en orden ascendente son:  ");
                System.out.println(+y);
                System.out.println(+z);
                System.out.println(+x);
            }
        }
        if (y > x && y > z) {
            if (x > z) {
                System.out.println("Los numeros en orden ascendente son:  ");
                System.out.println(+z);
                System.out.println(+x);
                System.out.println(+y);
            } else {
                System.out.println("Los numeros en orden ascendente son:  ");
                System.out.println(+x);
                System.out.println(+z);
                System.out.println(+y);
            }
        }
        if (z > y && z > x) {
            if (y > x) {
                System.out.println("Los numeros en orden ascendente son:  ");
                System.out.println(+y);
                System.out.println(+x);
                System.out.println(+z);
            } else {
                System.out.println("Los numeros en orden ascendente son:  ");
                System.out.println(+x);
                System.out.println(+y);
                System.out.println(+z);
            }
        }

    }
}
