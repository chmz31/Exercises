/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejif13;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejif13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Lee los numeros que introducimos
        Scanner miscanner = new Scanner(System.in);
        int num1;
        System.out.print("Introduce el primer numero: ");
        num1 = miscanner.nextInt();

        Scanner segundoscanner = new Scanner(System.in);
        int num2;
        System.out.print("Introduce el segundo numero: ");
        num2 = segundoscanner.nextInt();

        Scanner tercerscanner = new Scanner(System.in);
        int num3;
        System.out.print("Introduce el tercer numero: ");
        num3 = tercerscanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println("Los numeros en orden ascendente son: "+num3 +" "+ num2 +" " +num1);
            } else {
                System.out.println("Los numeros en orden ascendente son: "+num2 +" "+ num3 +" " +num1);
            }
        }
        if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.println("Los numeros en orden ascendente son: "+num3 +" "+ num1 +" " +num2);
            } else {
                System.out.println("Los numeros en orden ascendente son: "+num1 +" "+ num3 +" " +num2);
            }
        }
        if (num3 > num2 && num3 > num1){
            if (num2 > num1){
                System.out.println("Los numeros en orden ascendente son: "+num2 +" "+ num1 +" " +num3);
            }else  {
                System.out.println("Los numeros en orden ascendente son: "+num1 +" "+ num2 +" " +num3);
            }
        } 
    }

}
