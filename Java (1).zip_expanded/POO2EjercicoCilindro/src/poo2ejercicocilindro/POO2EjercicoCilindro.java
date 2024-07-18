/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2ejercicocilindro;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class POO2EjercicoCilindro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicializamos nuestro cilindro con las medidas que introducimos por teclado
        double radio, altura;
        Scanner scan = new Scanner(System.in);
        System.out.print("Dime el radio de tu cilindro: ");
        radio = scan.nextDouble();
        System.out.print("Dime la altura de tu cilindro: ");
        altura = scan.nextDouble();
        Cilindro mi_cilindro = new Cilindro(radio, altura);
        System.out.println(mi_cilindro);
    }
    
}
