/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejif11;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EJif11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lee los numeros que introducimos
        Scanner miscanner = new Scanner(System.in);
        int mes;
        System.out.print("Introduce el mes: ");
        mes = miscanner.nextInt();
        if (mes <= 12 && mes > 0) {
            Scanner segundoscanner = new Scanner(System.in);
            int año;
            System.out.print("Introduce el año: ");
            año = segundoscanner.nextInt();

            int nuevomes = mes + 1;
            int mesAnterior = mes - 1;
            
            if (nuevomes == 13) {
                nuevomes = 1;
                int nuevoaño = año + 1;
                System.out.println("El siguiente mes es: " + nuevomes + " del año " + nuevoaño);
            } else {
                System.out.println("El siguiente mes es el " + nuevomes + " del año " + año);
            }
            
            if (mesAnterior == 0) {
                mesAnterior = 12;
                int añoAnterior = año - 1;
                System.out.println("El anterior  mes es: " + mesAnterior + " del año " + añoAnterior);
            } else {
                System.out.println("El anterior mes es el " + mesAnterior + " del año " + año);
            }
            
        } else {
            System.out.println("Se ha introducido un mes incorrecto");
        }
    }
}
