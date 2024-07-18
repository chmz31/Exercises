/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospaisciudad.matriz;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjerciciosPaisCiudadMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //aqui inicializamos variables y tenemos todo el codigo del main
        String[] paises = new String[4];
        String[][] ciudades = new String[3][3];
        rellenadorPaises(paises);
        rellenadorCiudades(ciudades, paises);
        imprimirMatriz(ciudades, paises);
    }

    public static void rellenadorPaises(String[] paises) {
        //esta funcion rellenara el vector de Paises con datos introducidos por el usuario
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < paises.length; i++) {
            System.out.print("Dime un pais " + (i + 1) + ": ");
            paises[i] = scan.nextLine();
        }
    }

    public static void rellenadorCiudades(String[][] ciudades, String[] paises) {

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < ciudades.length; i++) {
            for (int j = 0; j < ciudades[i].length; j++) {
                System.out.print("Dime una ciudad " + (j + 1) + " para el pais: " + paises[i] + ": ");
                ciudades[i][j] = scan.nextLine();
            }

        }

    }

    public static void imprimirMatriz(String[][] ciudades, String[] paises){
        for (int i = 0; i < ciudades.length; i++) {
            System.out.print(paises[i]+": ");
            for (int j = 0; j < ciudades[i].length; j++) {
                System.out.print(ciudades[i][j]+". ");
            }
            System.out.println("");
        }
    }
    
}
