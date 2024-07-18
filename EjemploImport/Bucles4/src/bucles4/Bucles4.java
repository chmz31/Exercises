/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles4;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucles4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miscanner = new Scanner(System.in);
        System.out.print("Hasta que numero quieres que cuente? ");
        int n = miscanner.nextInt();

        //se establece contador
        int contador;
        // A) Valor inicial B) Condicion que se debe cumplir C) Incremento despues de cada ciclo
        for (contador = 1; contador <= n; contador++) {
            System.out.println(+contador);
        }
    }

}