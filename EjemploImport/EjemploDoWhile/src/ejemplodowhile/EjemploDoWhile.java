/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplodowhile;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjemploDoWhile {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("**MENU**");
            System.out.println("1. Di Hola");
            System.out.println("2. Di que tal");
            System.out.println("0. Salir");
            System.out.println("\nIntroduce una opcion");
            opcion = Scan.nextInt();
            
            switch (opcion)  {
                case 1:
                    System.out.println("\n\n\n\n\n\n\n\nHOLA\n");
                    break;
                case 2:
                    System.out.println("\n\n\n\n\n\n\n\nQue tal amigo\n");
                    break;
                case 0:
                    System.out.println("Saliendo");
                    break;
            }
        
        } while (opcion !=0);
        // TODO code application logic here
    }
    
}
