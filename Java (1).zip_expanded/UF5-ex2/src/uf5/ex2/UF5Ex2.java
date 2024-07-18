/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf5.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class UF5Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Dime nombre: ");
            String nombre = scan.nextLine();
            System.out.println("Dime edad: ");
            int edad = scan.nextInt();
            Gato g = new Gato(nombre, edad);
            System.out.println(g);
        } catch (InputMismatchException ex) {
            System.out.println("Error en la introducion de datos");
        }
    }

}
