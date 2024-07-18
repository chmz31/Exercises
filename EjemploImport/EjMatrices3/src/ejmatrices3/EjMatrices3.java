/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejmatrices3;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjMatrices3 {

//Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
//introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
//matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
//menores que cero y cuántos son igual a cero.
    public static void main(String[] args) {
        int FILAS, COLUMNAS;
        int[] valores;
        Scanner scan = new Scanner(System.in);
        System.out.print("Cuantas filas quieres? : ");
        FILAS = scan.nextInt();
        System.out.println("Cuantas columnas quieres? : ");
        COLUMNAS = scan.nextInt();
        
        
        int[][] nums = new int[FILAS][COLUMNAS]; //creamos la matriz con el numero de filas y columnas que quiere el usuario.
        rellenaMatriz(nums); //hacemos que el usuario la rellena por teclado
        
        valores = recorreMatriz(nums); //guardamos los datos en un vector para que sea mas facil de almacenar
        System.out.println("He encontrado "+valores[0]+" numeros menores que 0, "+valores[1]+" numeros iguales a 0 y "+valores[2]+" numeros mayores que 0");
    }

    public static void rellenaMatriz(int[][] nums) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println("Introduce valor para fila " + i + ", columna " + j);
                nums[i][j] = scan.nextInt();
            }
        }
    }
    
    public static int[] recorreMatriz(int[][] nums) {
        int[] valores = new int[3];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
               if (nums[i][j] < 0){
               valores[0]++;
               }else if (nums[i][j] == 0){
               valores[1]++;
               }else {
               valores[2]++;
               }
            }
        }
        return valores;
    }
}
