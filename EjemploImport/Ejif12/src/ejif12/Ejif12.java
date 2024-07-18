/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejif12;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejif12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pedimos que introduzcan el año
        Scanner añoScanner = new Scanner(System.in);
        int año;
        System.out.print("Introduce el año: ");
        año = añoScanner.nextInt();
        //hace los calculos
        int dosDigitos = año % 100;
        int cuarto = dosDigitos % 4;
        
        //comprueba si es bisiesto e imprime la respuesta
        if (cuarto == 0 && año % 100 != 0 || año%400==0)
        {
            System.out.println("El año es bisisesto");
        }else {System.out.println("el año no es bisiesto");}
    }  
}   