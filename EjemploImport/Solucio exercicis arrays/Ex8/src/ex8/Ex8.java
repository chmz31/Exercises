/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int TAM = 100;
        double[] vector = new double[TAM];
        rellenarVector(vector);
        
        
        System.out.println("Dame un valor R (entre 0 y 1): ");
        double r = scan.nextDouble();
        mostrarMayores(vector, r);
        
    }
    
    public static void mostrarMayores(double[]vector, double r){
        for(int i=0;i<vector.length;i++){
            if(vector[i]>=r){
                System.out.println("Numero:"+vector[i]);
            }
        }
    }
    
    public static double aleatorio(){
        Random r = new Random();
        return r.nextDouble();
    }
    
    public static void rellenarVector(double[] vector){
        for(int i=0;i<vector.length;i++){
            vector[i] = aleatorio();
        }
    }
    
    public static void imprimirVector(double[] vector){
        for(int i=0;i<vector.length;i++){
            System.out.println(vector[i]+",");
        }
    }
    
    
}
