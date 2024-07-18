/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex20;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int MAX = 1000;
        int[] vector = new int[MAX];
        rellenarVector(vector);
        imprimirVector(vector);
        System.out.print("\nDime un numero a buscar: ");
        int n = scan.nextInt();
        
        buscarSiExiste(vector, n);
        
    }
    
    public static int aleatorio(){
        Random r = new Random();
        return r.nextInt(100);
    }
    public static void rellenarVector(int[] vector){
        for(int i=0;i<vector.length;i++){
            vector[i]=aleatorio();
        }
    }
    public static void imprimirVector(int[] vector){
        for(int i=0;i<vector.length;i++){
            System.out.print(vector[i]+", ");
        }
    }
    
    public static void buscarSiExiste(int[]vector, int n){
        int contador=0;
        for(int i=0;i<vector.length;i++){
            if(vector[i]==n){
                contador++;
            }
        }
        
        System.out.println("hay "+contador+" numeros "+n);
    }
    
    
}
