/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strings3;

/**
 *
 * @author alumne
 */
public class Strings3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicializamos los Strings
        String s1 = "Hola";
        String s2 = "como estas?";
        String s3 = "adios";
        String s4 = "ADIOS";
        String s5 = "527";
        
        System.out.println(s1+" "+s2); //Concatena las cadenas s1 y s2 para obtener el resultado: «Hola como estas?»
        System.out.println("S3 y S4 son iguales?: "+s3.equals(s4)); //Comprueba si s3 y s4 son iguales.
        System.out.println("S3 y S4 son iguales? (ignora mayus): "+s3.equalsIgnoreCase(s4)); //Vuelve a comparar s3 y s4 ignorando las letras mayúsculas.
        int numero = Integer.valueOf(s5); //Convierte s5 a un entero.
        System.out.println("Valor de s5: "+numero);
        String numString = String.valueOf(321); //Convierte el numero 321 a un string
        System.out.println("String de numero: "+numString);
    }
    
}
