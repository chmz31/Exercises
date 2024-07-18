/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo1.ejercicioesfera;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class POO1EjercicioEsfera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicializamos variables
        Scanner scan = new Scanner(System.in);
        Esfera esfera = new Esfera(); //instanciamos nuestra esfera
        
        System.out.print("Introduce el radio de la esfera: ");
        esfera.setR(scan.nextInt());
        System.out.println(esfera);
    }
    
}
