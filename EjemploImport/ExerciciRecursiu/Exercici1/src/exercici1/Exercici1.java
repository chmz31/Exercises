/*
 * Programar un algoritme recursiu que calculi la suma dels n primers números. 
 * Exemple: Entrada: 6 -- Sortida: 21 (1+2+3+4+5+6)
 */
package exercici1;

import java.util.Scanner;

/**
 *
 * @author mati
 */
public class Exercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        num = sc.nextInt();
        System.out.println("SumaRecursiva de " + num + "=" + sumarecursiva(num));
    }

    public static int sumarecursiva(int n) {
        //caso base
        if (n == 1) {
            return 1;
        } else {//caso recursivo
            return n + sumarecursiva(n - 1);
        }

    }

}
