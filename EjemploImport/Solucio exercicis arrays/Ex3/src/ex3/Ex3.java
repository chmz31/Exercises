/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 * Array de 10, max, min y mostrar
*/
package ex3;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //definimos variables
        int MAX = 10;
        int[] vector = new int[MAX];
        
        //rellenamos vector
        rellenarVector(vector);
        
        //imprimir el vector
        imprimirVector(vector);
        
        //calcular maximo, minimo. 
        mostrarMaxYMin(vector);
        
    }
    
    public static void rellenarVector(int[] vector){
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Valor " + i + ": ");
            vector[i] = teclado.nextInt();
        }
    }
    
    public static void imprimirVector(int[] vector){
        for(int i=0;i<vector.length;i++){
            System.out.print(vector[i]+ " - ");
        }
    }
    
    public static void mostrarMaxYMin(int[] vector){
        int minimo = vector[0];
        int maximo = vector[0];
        for(int i=0; i<vector.length;i++){
            //miro si es maximo
            if(vector[i]>maximo){
                maximo = vector[i];
            }
            //miro si es minimo
            if(vector[i]<minimo){
                minimo = vector[i];
            }
        }
        System.out.println("El maximo es:"+maximo);
        System.out.println("El minimo es: "+minimo);
    }
    
    
}
