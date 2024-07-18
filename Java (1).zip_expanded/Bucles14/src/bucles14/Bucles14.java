/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles14;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucles14 {

    /* Realiza un programa que dada una cantidad de euros que el usuario introduce por teclado
(múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para alcanzar dicha
cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que indicar el mínimo de
billetes posible. Por ejemplo, si el usuario introduce 145 el programa indicará que será necesario
1 billete de 100 €, 2 billetes de 20 € y 1 billete de 5 € (no será válido por ejemplo 29 billetes de
5, que aunque sume 145 € no es el mínimo número de billetes posible).*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicializamos las variables
        int dinero, dineroContado = 0, contador500 = 0, contador200 = 0, contador100 = 0, contador50 = 0, contador20 = 0, contador10 = 0, contador5 = 0;
        //Pedimos que introduzcan el numero
        System.out.println("Introduce el dinero deseado en billetes (multiplo de 5)");
        Scanner scan = new Scanner(System.in);
        dinero = scan.nextInt();
        //sumamos cada valor hasta que se pase, entonces hacer lo mismo con el valor anterior (restando 1 si se pasa)
        if (dinero % 5 == 0) {
            while (dineroContado <= dinero) {
                contador500++;
                dineroContado = dineroContado + 500;
            }
            if (dineroContado > dinero) {
                contador500--;
                dineroContado = dineroContado - 500;
            }
            while (dineroContado <= dinero) {
                contador200++;
                dineroContado = dineroContado + 200;
            }
            if (dineroContado > dinero) {
                contador200--;
                dineroContado = dineroContado - 200;
            }
            while (dineroContado <= dinero) {
                contador100++;
                dineroContado = dineroContado + 100;
            }
            if (dineroContado > dinero) {
                contador100--;
                dineroContado = dineroContado - 100;
            }
            while (dineroContado < dinero) {
                contador50++;
                dineroContado = dineroContado + 50;
            }
            if (dineroContado > dinero) {
                contador50--;
                dineroContado = dineroContado - 50;
            }
            while (dineroContado < dinero) {
                contador20++;
                dineroContado = dineroContado + 20;
            }
            if (dineroContado > dinero) {
                contador20--;
                dineroContado = dineroContado - 20;
            }
            while (dineroContado < dinero) {
                contador10++;
                dineroContado = dineroContado + 10;
            }
            if (dineroContado > dinero) {
                contador10--;
                dineroContado = dineroContado - 10;
            }
            while (dineroContado < dinero) {
                contador5++;
                dineroContado = dineroContado + 5;
            }
            if (dineroContado > dinero) {
                contador100--;
                dineroContado = dineroContado - 5;
            }
        } else {
            System.out.println("Has introducido un numero no multiplo de 5");
        }
        //Imprimimos el valor final
        System.out.println("He contado " + contador500 + " billetes de 500\nHe contado "+contador200+" billetes de 200\nHe contado "+contador100+" billetes de 100\nHe contado "+contador50 + " billetes de 50\nHe contado "+contador20+" billetes de 20\nHe contado "+contador10 +" billetes de 10\nHe contado "+contador5+" billetes de 5");
    }
}