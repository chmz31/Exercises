/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejfunciones1;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjFunciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dime dos numeros: \nPrimer numero: ");
        double num1 = scan.nextInt();
        System.out.print("Segundo numero: ");
        double num2 = scan.nextInt();
        System.out.println("La multiplicacion es: "+multiplica(num1, num2));;
    }

    public static double multiplica(double a, double b) {
        double multi;
        multi = a * b;
        return multi;
    }
}
