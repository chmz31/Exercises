/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejfunciones3;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjFunciones3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce dos numeros:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("El menor es: "+minimo(num1,num2));
    }

    public static int minimo(int a, int b) {
       int menor;
       if (a < b) {
           menor = a;
       } else menor = b;
       return menor;
    }
    
}
