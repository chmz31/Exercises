/*
 *Crea un programa que pida diez números reales por teclado, los 
 *almacene en un array, y luego muestre la suma de todos los valores. Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] vector = new double[10];
        
        //rellenar vector
        for(int i=0;i<vector.length;i++){
            System.out.print("Valor "+i+": ");
            vector[i]=scan.nextDouble();
        }
    }
    
}
