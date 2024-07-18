/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejfunciones5;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjFunciones5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se pide que se introduzcan las millas
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce las millas: ");
        //leemos las millas y las guardamos en la int millas
        int millas = scan.nextInt();
        System.out.println(+millas + " millas en kilometros es: " + millas_a_kilometros(millas) + " kilometros");
    }

    public static double millas_a_kilometros(int millas) {
        double kilo = (double) millas * 1.60934;
        return kilo;
    }
}
