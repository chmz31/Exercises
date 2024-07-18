/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejmatrices2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjMatrices2 {

//Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
//multiplicar del 1 al 10 (cada tabla en una fila). Luego mostrará la matriz por pantalla.
    public static void main(String[] args) {
        //inicializamos las variables
        int[][] nums = new int[10][10];
        rellenarMatriz(nums);
        System.out.println("Tablas de multiplicar:");
        imprimirMatriz(nums);
    }

    public static void rellenarMatriz(int[][] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                num = (i+1) * (j+1);
                nums[i][j] = num;
            }
        }
    }

    public static void imprimirMatriz(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println("");
        }
    }
}