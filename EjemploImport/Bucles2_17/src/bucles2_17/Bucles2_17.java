/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles2_17;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucles2_17 {

    /* Escriu un programa que llegeixi un número N i mostri per pantalla el següent:
1
1 2
1 2 3
.......
1 2 3 ......... N*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicializamos las variables
        int n;
        System.out.println("Introduce un valor N");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int x;
        int contador;
        for (contador = 1; contador <= n; ++contador) {
            //cada paso la x suma 1 hasta llegar al numero de contador
        for (x = 1 ; x <=contador ; x++) {
            //imprimimos X en cada paso
            System.out.print(+x + " " );
        }
            System.out.println("\n");
        }
        
    }

}
