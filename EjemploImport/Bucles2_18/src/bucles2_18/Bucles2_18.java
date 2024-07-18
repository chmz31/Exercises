/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles2_18;

import java.util.Scanner;

/* Un número perfecte és un enter positiu igual a la suma dels seus divisors diferents d’ell
Per exemple, 6 és un número perfecte perquè la suma dels seus divisors 1, 2 ,3 és igual a 6. 8 
no és un número perfecte perquè la suma dels seus divisors 1, 2, 4 és diferent de 8. 
Escriviu un programa que accepti un enter positiu i determini si és perfecte. Igualment 
ha de mostrar per pantalla tots els divisors del número. */
/**
 *
 * @author alumne
 */
public class Bucles2_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sumaNum = 0;
        boolean imperfecto = false;
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el numero:");
        int numero = scan.nextInt(); // pero te lo pueden entrar supongo que sabes como hacerlo
        System.out.println("Divisores de " + numero + "\n");
        //iteras desde 1 hasta el numero para encontrar los divisores
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                //imprimes la solucion
                System.out.println(i);
                sumaNum = i + sumaNum;
            } 
        } 
        System.out.println("\nsuma de divisores= "+sumaNum);
        if (sumaNum == numero) {    
                System.out.println("El numero es perfecto");
                }else System.out.println("el numero no es pefecto"); 
 
    }
}
