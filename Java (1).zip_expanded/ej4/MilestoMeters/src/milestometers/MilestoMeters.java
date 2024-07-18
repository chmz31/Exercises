/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package milestometers;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class MilestoMeters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miscanner = new Scanner(System.in);
        double millas;

        System.out.print("Introduce el numero de millas: ");
        millas = miscanner.nextDouble();

        double metros = millas * 1.852;

        System.out.println(millas + " millas en metros es: " + metros + " metros");
    }

}
