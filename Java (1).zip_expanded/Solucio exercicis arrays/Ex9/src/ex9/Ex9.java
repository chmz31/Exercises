/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int TAM = 100;
        int[] vector = new int[TAM];
        rellenarVector(vector);
        imprimirVector(vector);
        
        System.out.print("\nNumero que quieres buscar: ");
        int num = scan.nextInt();
        mostrarPosicion(vector, num);
    }
    
    public static void mostrarPosicion(int[]vector, int num){
        for(int i=0;i<vector.length;i++){
            //busco numero
            if(num==vector[i]){
                System.out.println("Casilla: "+i);
            }
        }
    }
    
    public static int aleatorio(){
        Random r = new Random();
        return r.nextInt(10)+1;
    }
    
    public static void rellenarVector(int[] vector){
        for(int i=0;i<vector.length;i++){
            vector[i] = aleatorio();
        }
    }
    
     public static void imprimirVector(int[] vector){
        for(int i=0;i<vector.length;i++){
            System.out.print(vector[i]+", ");
        }
    }
}
