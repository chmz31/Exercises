/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //definimos variables
        int MAX = 20;
        int[] vector = new int[MAX];
        
        rellenarVector(vector);
        calculaSumaPosYNeg(vector);
    }
    
    
    public static void rellenarVector(int[] vector){
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Valor " + i + ": ");
            vector[i] = teclado.nextInt();
        }
    }

    public static void calculaSumaPosYNeg(int[] vector) {
        int sumaPos = 0;
        int sumaNeg = 0;
        
        for(int i=0;i<vector.length;i++){
            if(vector[i]>0){
                sumaPos = sumaPos + vector[i];
            }
            if(vector[i]<0){
                sumaNeg += vector[i];
            }
        }
        System.out.println("Suma Positivos = "+sumaPos);
        System.out.println("Suma Negativos = "+sumaNeg);

    }
}
