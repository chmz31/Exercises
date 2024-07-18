/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exempleordenacio;

import java.util.Arrays;

/**
 *
 * @author mati
 */
public class ExempleOrdenacio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = {1, 7, 3, 12, 21, 18, 20, 31, 19};
        String[] diccionario = {"Ana", "Teresa", "Juan", "Luis", "Maria", "Pep", "Isabel", "Alex", "Ona"};
        imprimirVector(vector);
        imprimirVectorPalabras(diccionario);
        //ordenarBurbuja(vector);
        //imprimirVector(vector);
        //imprimirParejas(diccionario, vector);
        //ordenarPalabrasBurbuja(diccionario);
        //imprimirVectorPalabras(diccionario);
        ordenarAmbosPorNum(vector, diccionario);
        imprimirParejas(diccionario, vector);
        

    }
    
    public static void ordenarAmbosPorNum(int[] array, String[] nombres){
    int n = array.length;
        int aux;
        String aux2;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    // Intercambiamos valores
                    aux = array[j - 1];
                    aux2 = nombres[j - 1];
                    array[j - 1] = array[j];
                    nombres[j - 1]=nombres[j];
                    array[j] = aux;
                    nombres[j] = aux2;
                }
            }
        }
    }

    public static void ordenarBurbuja(int[] array) {
        int n = array.length;
        int aux;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    // Intercambiamos valores
                    aux = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = aux;
                }
            }
        }
    }

    public static void ordenarPalabrasBurbuja(String[] array) {
        int n = array.length;
        String aux;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1].compareToIgnoreCase(array[j]) > 0) {
                    // Intercambiamos valores
                    aux = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = aux;
                }
            }
        }
    }

    private static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");

    }

    private static void imprimirVectorPalabras(String[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");

    }

    public static void imprimirParejas(String[] nombres, int[] edades) {
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + ":" + edades[i]);
        }
    }
}
