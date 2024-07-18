/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejif10;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejif10 {

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

        if ((x * y) == z) {
            System.out.println("La multiplicacion de los dos primeros es igual al tercero");
        } else {
            System.out.println("la multiplicacion de los dos primeros no es igual al tercero");
        }

    }
}
