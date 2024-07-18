/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioboleraburbuja;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjercicioBoleraBurbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //inicializamos las variables
      int MAXJUG= 5; // constante de jugadores
      String[] nombres = new String[MAXJUG];
      int[] puntos = new int[MAXJUG];
      //por nombre
      pedirNombreYPuntos(nombres, puntos);
      ordenarPorNombre(nombres, puntos);
      System.out.println("Ordenados por nombre: ");
      mostrarNombreYPuntos(nombres, puntos);
      //por puntos
      System.out.println("Ordenados por puntos: ");
      ordenarPorPuntos(nombres, puntos);
      mostrarNombreYPuntos(nombres, puntos);
      
    }
    
    public static void pedirNombreYPuntos(String[] nombres, int[] puntos){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Introduce nombre para jugador "+i+": ");
            nombres[i] = scan.nextLine();

            System.out.println("Introduce puntos para jugador "+i+": ");
            puntos[i] = scan.nextInt();
            scan.nextLine(); //limpiar el enter sobrante

        }
    }
    
    public static void ordenarPorNombre(String[] array, int[] puntos){
    int n = array.length;
        String aux;
        int aux2;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1].compareToIgnoreCase(array[j]) > 0) {
                    // Intercambiamos valores de nombres y puntos
                    aux = array[j - 1];
                    aux2 =puntos[j -1];
                    array[j - 1] = array[j];
                    puntos[j - 1] = puntos[j];
                    array[j] = aux;
                    puntos[j] = aux2;
                }
            }
        }
    }
    
    public static void mostrarNombreYPuntos(String[] array, int[] puntos){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+" : "+puntos[i]);
        }
    }
    
    public static void ordenarPorPuntos(String[] nombre, int[] array){
      int n = array.length;
        int aux;
        String aux2;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] < array[j]) {
                    // Intercambiamos valores
                    aux = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = aux;
                    //hacemos lo mismo con los nombres
                    aux2 = nombre[j - 1];
                    nombre[j - 1] = nombre[j];
                    nombre[j] = aux2;
                }
            }
        }
    }
}
