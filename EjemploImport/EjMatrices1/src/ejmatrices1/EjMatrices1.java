/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejmatrices1;

// Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25

// luego muestre la matriz por pantalla.
public class EjMatrices1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicializamos las variables
        int[][] nums = new int[5][5];
        rellenarMatriz(nums);
        imprimirMatriz(nums);

    }

    public static void rellenarMatriz(int[][] nums) {
        int num = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = num;
                num++;
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
