/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicirecursiu3;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ExerciciRecursiu3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("dime un numero: ");
        int num = scan.nextInt();
        System.out.println("Suma de los pares: " + sumaPares(num));
    }
    
    public static int sumaPares(int n){
        if(n%2!=0){ //si numero es impar
            return -1;
        }else if(n==2){//caso base
            return 2;
        }else{//caso recursivo
            return n+sumaPares(n-2);
        }
    }
    
}
