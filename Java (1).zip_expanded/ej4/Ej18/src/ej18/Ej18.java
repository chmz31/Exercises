/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej18;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double horasTrabajadas;

        //Lee los numeros que introducimos
        //el input son las horas  trabajadas
        Scanner miscanner = new Scanner(System.in);
        System.out.print("Introduce las horas trabajadas este mes:  ");
        horasTrabajadas = miscanner.nextDouble();

        Scanner hourscanner = new Scanner(System.in);
        System.out.print("Introduce tu salario por hora:  ");
        double salario = hourscanner.nextDouble();

        //calculos si hemos trabajado horas extra
        if (horasTrabajadas > 35.0) {
            double impuestos;
            double total = 35 * salario + ((horasTrabajadas - 35) * (salario * 1.5));
            System.out.println("Salario bruto= " + total + "€");
            if (total > 500) {
                if (total < 900) {
                    impuestos = (total - 500) * 0.25;
                    System.out.println("Tasas: " + impuestos + "€");
                    double neto = total - impuestos;
                    System.out.println("Salario Neto= " + neto + "€");
                } else {
                    double impuestos1 = (400 * 0.25);
                    double impuestos2 = (total - 900) * 0.45;
                    impuestos = impuestos1 + impuestos2;
                    System.out.println("Tasas: " + impuestos + "€");
                    double neto = total - impuestos;
                    System.out.println("Salario Neto= " + neto + "€");
                }
            } else {
                impuestos = 0;
                System.out.println("Tasas= " + impuestos + "€");

                double neto = total - impuestos;
                System.out.println("Salario Neto= " + neto + "€");
            }

        } else {
            double total = salario * horasTrabajadas;
            System.out.println("Salario Neto= " + total + "€");
        }
    }
}
