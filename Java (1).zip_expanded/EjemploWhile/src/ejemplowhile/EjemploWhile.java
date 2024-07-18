/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplowhile;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjemploWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pedimos un numero
        System.out.println("Dime un numero");
        Scanner Scan = new Scanner(System.in);
       int num1= Scan.nextInt();
       
       while (num1 < 10) {
           //mientras el numero sea menor que 10 sumamos 1 e imprimimos cada vez
          //num=Scan.nextInt()
            num1++;
           System.out.println(+num1);
       }
        System.out.println("Adios");
       
       }
    }
    
