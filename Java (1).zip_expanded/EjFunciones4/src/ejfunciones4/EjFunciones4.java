/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejfunciones4;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjFunciones4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int num = scan.nextInt();
        System.out.println(dimeSigno(num));
    }

    public static int dimeSigno(int num) {
        int salida = 0;
        if (num < 0) {
            salida = -1;
        }
        if (num == 0) {
           salida = 0;
        }
        if (num > 0) {
            salida = 1;
        }
        return salida;
    }
}
