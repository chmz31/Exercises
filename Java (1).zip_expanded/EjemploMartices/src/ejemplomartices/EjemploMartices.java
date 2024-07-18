/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplomartices;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjemploMartices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] nums = new int[2][3];
        rellenarMatriz(nums);
        imprimirMatriz(nums);
    }
    
    public static void rellenarMatriz(int [][] nums){
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println("Introduce valor para fila " + i + ", columna " + j);
                nums[i][j] = scan.nextInt();
            }
        }
}

    public static void imprimirMatriz(int[][] nums) {
       for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                      System.out.print(nums[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
