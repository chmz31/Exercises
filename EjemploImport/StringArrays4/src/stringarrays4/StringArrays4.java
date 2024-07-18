/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringarrays4;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class StringArrays4 {

    /**
     * @param args the command line arguments
     */
//Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas ‘a’,
//cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
//mayúsculas y minúsculas.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String entrada = scan.nextLine();
        System.out.println("He encontrado " + contador_letra(entrada, 'a') + " a");
        System.out.println("He encontrado " + contador_letra(entrada, 'e') + " e");
        System.out.println("He encontrado " + contador_letra(entrada, 'i') + " i");
        System.out.println("He encontrado " + contador_letra(entrada, 'o') + " o");
        System.out.println("He encontrado " + contador_letra(entrada, 'u') + " u");
    }

    public static int contador_letra(String entrada, char buscado) {
        //convierte el string a minusculas para buscar el caracter sin diferenciar
        //recorre el string y comprueba si encuentra el caracter buscado
        int contador = 0;
        String entradaminus = entrada.toLowerCase();
        for (int i = 0; i < entradaminus.length(); i++) {
            if (entradaminus.charAt(i) == buscado) {
                contador++;
            }
        }
        return contador;
    }

}
