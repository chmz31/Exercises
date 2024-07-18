/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ej5;
import java.util.Scanner;

/**
 *
 * @author Alessandro
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Aqui inicializamos el scanner y la variable radio
      Scanner miscanner = new Scanner(System.in);
      double radio;
       //Aqui pedimos que el usuario introduzca el radio
      System.out.println("Introduce un numero: ");
      radio = miscanner.nextDouble();      
    
        //aqui se establece la constante PI
         double PI = 3.1416;
       
         //aqui ocurre la logica & se imprimen los resultados
         double longitud =  2 * PI * radio;
         System.out.println("longitud = " + longitud);
         double area = PI * (radio * radio);
         System.out.println("area = " + area);
         double volumen = (4/3) * PI * Math.pow(radio, 3);
         System.out.println("volumen = "+ volumen);           
    }
 }
