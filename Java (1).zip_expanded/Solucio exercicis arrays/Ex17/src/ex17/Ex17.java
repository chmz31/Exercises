/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex17;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int MAX = 10;
        int[] v1 = new int[MAX];
        int[] v2 = new int[MAX];
        
        rellenarDosVectores(v1,v2);
        if(sonIguales(v1,v2)){
            System.out.println("IGUALES!!");
        }else{
            System.out.println("DIFERENTES!!!");
        }
        
    }
    
    
    public static void rellenarVector(int[] vector){
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<vector.length;i++){
            System.out.print("Valor "+i+": ");
            vector[i]=scan.nextInt();
        }
    }
    
    public static void rellenarDosVectores(int[]v1, int[]v2){
        System.out.println("Vector 1:");
        rellenarVector(v1);
        
        System.out.println("Vector 2:");
        rellenarVector(v2);
    }
    
    public static boolean sonIguales(int[]v1, int[]v2){
        boolean iguales = true;
        //recorro el vector y miro si coinciden todas las posiciones
        for(int i=0;i<v1.length;i++){
            if(v1[i]!=v2[i]){
                iguales = false;
            }
        }
        return iguales;
    }
}
