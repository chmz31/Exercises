/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejfunciones8;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjFunciones8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pedimos que introduzcan un valor entero, que guardaremos en la variable N
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int n = scan.nextInt();
        System.out.println("la suma de enteros de 1 a N es: " +suma1aN(n));
        System.out.println("el producto de los enteros de 1 a N es: " +producto1aN(n));
        System.out.println("el numero intermedio entre 1 y "+n+" es "+intermedio1aN(n));
    }

    public static int suma1aN(int n) {
        int contador, suma = 0;
        for (contador = 1; contador < n; contador++) {
            suma = contador + suma;
        }
        return suma;
    }
    public static int producto1aN(int n){
    int contador, producto = 1;
        for (contador = 1; contador < n; contador++) {
            producto = contador * producto;
        }
        return producto;
    }
    public static double intermedio1aN(int n){
    double intermedio = (1 + n)/2;
    return intermedio;
    }
}
