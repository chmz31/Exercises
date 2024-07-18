/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringarrays5;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class StringArrays5 {

    /**
     * @param args the command line arguments
     */
    //Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo o
    //no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas). Supondremos que
    //el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni acentos, etc.). Un
    //palíndromo es un texto que se lee igual de izquierda a derecha que de derecha a izquierda.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce una frase (sin comas ni acentos solo letras y espacios) :");
        String entrada = scan.nextLine();
        System.out.println(comprueba_palindromo(entrada));

    }

    public static boolean comprueba_palindromo(String entrada) {
        //elimina los espacios del string, crea uno inverso y los compara ignorando mayus
        boolean comprobar = false;
        entrada = entrada.replaceAll(" ", "");
        StringBuilder reversor = new StringBuilder(entrada);
        String reverso = reversor.reverse().toString();
        if (entrada.equalsIgnoreCase(reverso)) {
            comprobar = true;
        }
        return comprobar;
    }

}
