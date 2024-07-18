/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejfunciones2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjFunciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int edad = scan.nextInt();
        if (esMayorEdad(edad) == true) {
            System.out.println("Es mayor de edad");}
        else System.out.println("Es menor de edad");
    }

    public static boolean esMayorEdad(int a) {
        boolean mayorEdad = false;
        if (a >= 18) {
            mayorEdad = true;
        }
        return mayorEdad;
    }
}
