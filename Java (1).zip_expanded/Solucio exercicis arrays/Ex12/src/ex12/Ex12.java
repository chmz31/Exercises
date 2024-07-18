/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex12;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char opcion;
        int MAX = 10;
        int[] vector = new int[MAX];
        
        do{
            System.out.println("MENU");
            System.out.println("a)Mostrar Valores");
            System.out.println("b)Introducir Valor");
            System.out.println("c)Salir");
            System.out.print("Elije: ");
            opcion=scan.nextLine().charAt(0);
                 
            switch(opcion){
                case 'a':
                    mostrarValores(vector);
                    break;
                case 'b':
                    introducirValor(vector);
                    break;
                case 'c':
                    System.out.println("ADIOS!");
                    break;
                default:
                    System.out.println("Opcion incorrecta!");
                    break;
                   
            }
        }while(opcion!= 'c');
        
        
    }
    
    public static void introducirValor(int[]vector){
        Scanner scan = new Scanner(System.in);
        System.out.print("Dime la posicion:");
        int pos = scan.nextInt();
        
        System.out.print("Dime el valor:");
        int valor = scan.nextInt();
        
        vector[pos]=valor;
    }
    
    public static void mostrarValores(int[] vector){
        for(int i=0;i<vector.length;i++){
            System.out.print(vector[i]+", ");
        }
    }
    
}
