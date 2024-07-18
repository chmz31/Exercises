/*
 * Programa que calculi un numero elevat a una potencia , tots dos valors 
 * demanats al usuari, de forma recursiva.
 */
package exercici2;

import java.util.Scanner;

/**
 *
 * @author mati
 */
public class Exercici2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x, n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime la base: ");
        x = sc.nextInt();
        System.out.print("Dime la potencia: ");
        n = sc.nextInt();
        System.out.println(x + "^" + n + " = " + potenciaRecursiva(x, n));
    }

    public static double potenciaRecursiva(int x, int n) {
        //caso base
        if (n == 0) {
            return 1;
        } else {//caso recursivo
            return x * potenciaRecursiva(x, n - 1);
        }
    }

}
