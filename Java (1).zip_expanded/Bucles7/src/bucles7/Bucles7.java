/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles7;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucles7 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
           System.out.println("Introduce 10 valores, no puedes introducir 0 como valor");
         //se establece contador
        int contador;
        int negativos = 0;
        int positivos = 0;
        // A) Valor inicial B) Condicion que se debe cumplir C) Incremento despues de cada ciclo
        for (contador=10; contador > 0;  contador-- ) {
            Scanner miscanner = new Scanner(System.in);
            int n = miscanner.nextInt();
            if (n!=0){
            if (n <0)
            {
            negativos++;
            }
            if (n>0) {
            positivos++;
            }
        } else
                System.out.println("Has introducido un valor invalido");
        }
        
        System.out.println("He contado "+negativos +" negativos\nHe contado "+positivos+" positivos" );
    }
    
}
