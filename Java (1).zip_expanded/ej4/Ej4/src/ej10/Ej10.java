/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10;

import java.util.Scanner;

/**
 *
 * @author Alessandro
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Aqui se establecen las variables 
        Scanner miscanner = new Scanner(System.in);
        int  x;
        System.out.print("Introduce el primer numero: ");
        x = miscanner.nextInt();  
        
        Scanner elscanner = new Scanner(System.in);
        int  y;
        System.out.print("Introduce el segundo numero: ");
        y = elscanner.nextInt();
        
        // Aqui ocurren las operaciones
          int suma = x + y;
          int resta  = x - y;
          int multi = x *  y;
          
         //Aqui se imprimen los datos
        System.out.println("suma = " + suma);
        System.out.println("resta = " + resta);
        System.out.println("multiplicacion = " + multi);
        //Se comprueba si es posible hacer la division (divisor no igual a 0)
        if (y != 0) {
            double division = (double) x / y;
             System.out.println("division = " + division);          
    } else System.out.println("no se puede dividir con estos valores ");
    }
}
