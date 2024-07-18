/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejmatrices4;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjMatrices4 {

    //Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
    // 1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
    // programa mostrará la nota mínima, máxima y media de cada alumno
    public static void main(String[] args) {
        //inicializamos el scaner y las variables
        Scanner scan = new Scanner(System.in);
        String[][] matriz = new String[4][6];
        int[][] notas = new int[4][5];
        boolean salir = false;
        rellenarAlumno(matriz);
        rellenaMatriz(matriz);
        imprimirMatriz(matriz);
        notas = guardaNotas(matriz, notas);
        do {
            System.out.print("De que alumno quieres ver las notas? ");
            int alumno = scan.nextInt() - 1;
            System.out.println("MEDIA: " + calculaMedia(notas, alumno) + " MAXIMA: " + calcularMaxima(notas, alumno) + " MINIMA: " + calcularMinima(notas, alumno));
            salir = salir();
        } while (salir == false);

    }

    public static boolean salir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quieres continuar? \t1) Si   \t0) No\n");
        if (scan.nextInt() == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void imprimirMatriz(String[][] mat) {
        //Imprime una matriz de Strings bien formateada
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void rellenarAlumno(String[][] mat) {
        //rellena la primera fila de la matriz de Strings con el numero de alumno (empieza por 1)
        int num = 1;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < 1; j++) {
                mat[i][0] = "Alumne " + Integer.toString(num);
                num++;
            }

        }
    }

    public static void rellenaMatriz(String[][] mat) {
        //rellena la matriz con las notas en formato string
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 1; j < mat[i].length; j++) {
                System.out.print("Introduce valor para " + mat[i][0] + " nota " + j + " :");
                mat[i][j] = scan.nextLine();
            }
            System.out.println("");
        }
    }

    public static int[][] guardaNotas(String[][] mat, int[][] notas) {
        //guarda las notas de los alumnos como enteros en una matriz notas int 
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = Integer.valueOf(mat[i][j + 1]);
            }
        }
        return notas;
    }

    public static void imprimirMatriz(int[][] nums) {
        //imprime una matriz de enteros bien formateada
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static double calculaMedia(int[][] notas, int alumno) {
        //calcula la media de una fila (alumno)
        double media = 0.0;
        for (int j = 0; j < notas[alumno].length; j++) {
            media = media + notas[alumno][j];
        }
        media = media / notas[alumno].length;
        return media;
    }

    public static int calcularMaxima(int[][] notas, int alumno) {
        //calcula el valor maximo de una fila (alumno)
        int max = 0;
        for (int j = 0; j < notas[alumno].length; j++) {
            if (notas[alumno][j] > max) {
                max = notas[alumno][j];
            }
        }
        return max;
    }

    public static int calcularMinima(int[][] notas, int alumno) {
        //calcula el valor minimo de una fila (alumno)
        int min = notas[alumno][1];
        for (int j = 0; j < notas[alumno].length; j++) {
            if (notas[alumno][j] < min) {
                min = notas[alumno][j];
            }
        }
        return min;
    }
}
