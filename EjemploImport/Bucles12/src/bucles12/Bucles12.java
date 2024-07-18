/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles12;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucles12 {
//12. Realiza un programa que calcule el valor A elevado a B (A^B) sin hacer uso del operador de
//potencia (^), siendo A y B valores introducidos por teclado, y luego muestre el resultado por
//pantalla. 
/*A multiplicado por A B veces.**/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicializamos las variables
        int a, b, potencia = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime el valor de A");
        a = scan.nextInt();
        System.out.println("DIme el valor de B");
        b = scan.nextInt();
        //hacemos las operaciones
        int contador;
        for (contador = 1; contador <= b; contador++) {
            potencia = a * potencia;
        }
        System.out.println("La potencia de A^B es: " + potencia);
    }

}
