/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicivectors.pkg3.vectores;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class EjerciciVectors3Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] vector1 = new int[10];
       rellenarVector(vector1);
       int[] vector2 = new int[10];
       rellenarVector(vector2);
       int[] vector3 = new int[10];
       rellenarVector(vector3);
       
       int[][] matriz = new int[3][11];
       rellenarMatriz(matriz, vector1, vector2, vector3);
       sumaMatriz(matriz);
       imprimirMatriz(matriz);
    }
    
    public static void rellenarVector(int[] vector){
        Random rand = new Random();
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(10)+1;
        }
    }
    
    public static void rellenarMatriz(int[][] matriz, int[] vector1, int[] vector2, int[]  vector3){
         //recorre cada fila de la Matriz y lo guarda en una fila de la matiz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 10; j++) {
                if (i==0){
                matriz[i][j] = vector1[j];
                }else if (i==1){
                matriz[i][j] = vector2[j];
                }else if (i==2){
                matriz[i][j] = vector3[j];
                }
            }
        }
    }
    
     public static void imprimirMatriz(int[][] mat) {
        //Imprime una matriz de Int bien formateada
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }
     
     public static void sumaMatriz(int[][] mat){
         //recorre cada fila de la Matriz y hace un sumatorio que guardara en la posicion 10 de esa fila (la utlima)
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 10; j++) {
                 mat[i][10] = mat[i][10] + mat[i][j];
             }
         }
     }
    
}
