/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejfunciones9;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjFunciones9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pedimos que introduzcan 3 valores
        int valor1, valor2, valor3, max;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce 3 valores enteros: ");
        valor1 = scan.nextInt();
        valor2 = scan.nextInt();
        valor3 = scan.nextInt();
        //comrpueba que valor es menor entre 2, para eliminar 1 y poder pasarle  solo 2 al programa
        if (valor3 < valor2) {
            max = valorElevado(valor1, valor2);
        } else {
            max = valorElevado(valor1, valor3);
        }
        System.out.println("El maximo valor es: "+max);
    }

    public static int valorElevado(int valor1, int valor2) {
        //el valor calcula el maximo entre los dos que le llegan (previamente eliminamos el menor)
        int max = Math.max(valor1, valor2);
        return max;
    }
}
