/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejfunciones7;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjFunciones7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pedimos el ancho
        System.out.print("Por favor introduce el ancho de tu rectangulo: ");
        Scanner scan = new Scanner(System.in);
        double alto = scan.nextDouble();
        //pedimos el largo
        System.out.print("Por favor introduce el largo de tu rectangulo: ");
        double ancho = scan.nextDouble();
        //mostramos el perimetro y el area, calculados en sus funciones
        System.out.println("El Perimetro de tu rectangulo es: "+permietroRectangulo(ancho,alto));
        System.out.println("El Area de tu rectangulo es: "+areaRectangulo(ancho,alto));
    }
    public static double permietroRectangulo(double ancho, double alto){
     double perimetro = (2*ancho) + (2*alto);
     return perimetro;
    }
    public static double areaRectangulo(double ancho, double alto){
        double area = ancho * alto;
        return area;  
    }
}
