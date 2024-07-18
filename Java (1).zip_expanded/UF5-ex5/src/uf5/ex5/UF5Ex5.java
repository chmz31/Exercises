/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf5.ex5;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumne
 */
public class UF5Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        do {
            try {
                System.out.println("1. Imprimir positivo");
                System.out.println("2. Imprimir negativo");
                System.out.println("0. Salir");
                opcion = scan.nextInt();
                scan.nextLine();
                System.out.println("Dime valor a imprmir: ");
                int valor = scan.nextInt();
                switch (opcion) {
                    case 1:
                        imprimePositivo(valor);
                        break;
                    case 2:
                        imprimeNegativo(valor);
                        break;
                    case 0:
                        System.out.println("Saliendo");
                        break;
                }
            } catch (InvalidValueException ex) {
                System.out.println(ex.getMessage());
            }
        } while (opcion != 0);
    }

    public static void imprimePositivo(int x) throws InvalidValueException {
        if (x < 0) {
            throw new InvalidValueException("El valor no puede ser negativo");
        }
        System.out.println("Valor positivo: " + x);
    }

    public static void imprimeNegativo(int x) throws InvalidValueException {
        if (x > 0) {
            throw new InvalidValueException("El valor no puede ser positivo");
        }
        System.out.println("Valor negativo: " + x);
    }

}
