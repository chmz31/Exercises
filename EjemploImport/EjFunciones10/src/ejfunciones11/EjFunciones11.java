/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejfunciones11;

import java.util.Scanner;

/**
 *Realiza un programa que escriba la tabla de multiplicar de un número introducido por teclado.
Para ello implementa una función que reciba como parámetro un número entero y muestre por
pantalla la tabla de multiplicar de dicho número.
 * @author alumne
 */
public class EjFunciones11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Pedimos un numero entero
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int num = scan.nextInt();
        //llamamos a la funcion tablaMulti y le pasamos el numero de la tabla deseada
        System.out.println("******TABLA DEL "+num+"******");
        tablaMulti(num);
        System.out.println("*************************");
    }
    public static void tablaMulti(int numero){
        //imprime el resultado cada iteracion
        int tabla = 1;
        for (int i = 1; i <= 10; i++) {
            tabla = numero * i;
            System.out.println(tabla);
        }
    }
}
