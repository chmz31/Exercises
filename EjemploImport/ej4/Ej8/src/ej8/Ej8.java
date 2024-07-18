/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej8;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miscanner = new Scanner(System.in);
        int  edad;
        
        System.out.println("Introduce tu edad");
        edad = miscanner.nextInt();      
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad"); 
        } else  System.out.println("Eres menor de edad");
    }
    
}
