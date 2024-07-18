/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles14_nobucle;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucles14_Nobucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dinero, num500 = 0, num200 = 0, num100 = 0, num50 = 0, num20 = 0, num10 = 0, num5 = 0, resto = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        dinero = scan.nextInt();
        num500 = dinero / 500;
        resto = dinero % 500;
        num200 = resto / 200;
        resto = resto % 200;
        num100 = resto / 100;
        resto = resto % 100;
        num50 = resto / 50;
        resto = resto % 50;
        num20 = resto / 20;
        resto = resto % 20;
        num10 = resto / 10;
        resto = resto % 10;
        num5 = resto / 5;
        resto = resto % 5;
        System.out.println(num500 + " billetes de 500 \n" + num200 + " billetes de 200 \n" + num100 + " billetes de 100 \n" + num50 + " billetes de 50 \n" + num20 + " billetes de 20 \n" + num10 + " billetes de 10 \n" + num5 + " billetes de 5  \nY te quedan "+resto+" euros");
    }
}
