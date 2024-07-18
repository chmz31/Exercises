/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf5.exemple;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumne
 */
public class UF5Exemple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime a: ");
        int a = scan.nextInt();
        System.out.println("Dime b: ");
        int b = scan.nextInt();
        System.out.println("Dime c: ");
        int c = scan.nextInt();
        eq2nGrau eq = new eq2nGrau(a, b, c);
        try {
            eq.solucionar();
            System.out.println("Sol 1: " + eq.getSolucio(1));
            System.out.println("Sol 2: " + eq.getSolucio(2));
        } catch (PrimerGrauException ex) {
            System.out.println(ex.getMessage());
        } catch (CapSolucioRealException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void eq2() {

    }

    class eq2n {

    }

}
