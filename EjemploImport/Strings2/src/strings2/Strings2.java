/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strings2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Strings2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicializamos las variables
        String entrada = "Hola, soy estudiante de DAW-BIO de segundo curso";
        System.out.println("Este string tiene: "+calculoLongitudString(entrada)+" caracteres");
        System.out.println("El caracter en la posicion 14 es: "+stringToChar_pos(entrada));
        System.out.println("Cadena 5-9: "+entrada.substring(5, 9));
        System.out.println("La primera coma se encuentra en la posicion "+buscadorString(entrada));
        System.out.println("La ultima s se encuentra en la posicion "+buscadorUltimoString(entrada));
        System.out.println("Este String contiene <DAW-BIO>? "+comprobadorString(entrada));
        System.out.println(entrada.toUpperCase()); //convierte todo a mayuscula
        System.out.println(entrada.toLowerCase()); // convierte todo a minuscula
        System.out.println(entrada.replace('o', 'a')); // remplaza un caracter
        //inicializamos un array con la misma longitud que el String para rellenarlo
        char[] charArray = new char[entrada.length()];
        //llamamos a la funcion que nos rellena el array
        rellenadorVectorChar(charArray, entrada);
        System.out.print("Impresion de array: ");
        imprimeArray(charArray);
        
        
    }
    
    public static int calculoLongitudString(String entrada){
    //devuelve la longitud de un string
    return entrada.length();
    }
    
    public static char stringToChar_pos(String entrada){
    //develve el caracter en una posicion en este caso 14
    return entrada.charAt(14);
    }
    
    public static int buscadorString(String entrada){
    //busca la primera aparicion de un caracter
    return entrada.indexOf(',');
    }
    
    public static int buscadorUltimoString(String entrada){
    //busca la ultima aparicion de un caracter
    return entrada.lastIndexOf('s');
    }
    
    public static boolean comprobadorString(String entrada){
    //compruena si contiene una secuencia de caracteres
    boolean comprueba = false;
    if (entrada.contains("DAW-BIO")){
    comprueba = true;
    }
    return comprueba;
    }
    
    public static void rellenadorVectorChar(char[] vector, String entrada){
        for (int i = 0; i < vector.length; i++) {
            vector[i] = entrada.charAt(i);
        }
    }
    
    public static void imprimeArray(char[] vector){
     for (int i = 0; i < vector.length; i++) {
         System.out.print(vector[i]);
        }
        System.out.println("");
    }
    
}
