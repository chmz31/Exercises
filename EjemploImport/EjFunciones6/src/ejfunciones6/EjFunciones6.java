/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejfunciones6;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjFunciones6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precio;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce 5 valores sin IVA");
        //iniciamos un contador para contar los valores que se introducen y hacer los calculos en cada iteracion
        int contador;
        for (contador = 1; contador <= 5; contador++) {
            precio = scan.nextDouble();
            System.out.println(precio + " € con IVA: " + precioConIva(precio) + " €");
        }
    }

    public static double precioConIva(double precio) {
        double precioIva = precio + (precio * 0.21);
        return precioIva;

    }

}
