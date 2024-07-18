/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compararstrings;

import java.util.Scanner;

/**
 *
 * @author alumne
 * 
 */
public class CompararStrings {
//Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales,
//además de si son iguales sin diferenciar entre mayúsculas y minúsculas.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Este programa pedira 2 strings y luego los compara para saber si son iguales");
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce la primera cadena: ");
        String cadena1 = scan.nextLine();
        System.out.println("Introduce la segunda cadena: ");
        String cadena2 = scan.nextLine();
        System.out.println("Son las cadenas iguales? "+comparador_Strings(cadena1,cadena2));
        System.out.println("Son las cadenas iguales si ignoramos las mayusculas? "+comparador_Strings_NoMayus(cadena1,cadena2));
    }
    
    public static boolean comparador_Strings(String string1, String string2){
        boolean comprueba = false;
        if (string1.equals(string2)){
        comprueba = true;
        }
        return comprueba;
    }
    
    public static boolean comparador_Strings_NoMayus(String string1, String string2){
        boolean comprueba = false;
        if (string1.equalsIgnoreCase(string2)){
        comprueba = true;
        }
        return comprueba;
    }
    
}
