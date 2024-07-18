/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejif16;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjIf16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se ejecuta el escaner buscando una linea de texto
        Scanner miscanner = new Scanner(System.in);
        System.out.print("Introduce la hora en formato horas:minutos:segundos: ");
        String str = miscanner.nextLine();
        //separamos el texto en caracteres segun su posicion
        char hora1 = str.charAt(0);
        char hora2 = str.charAt(1);
        char minuto1 = str.charAt(3);
        char minuto2 = str.charAt(4);
        char segundo1 = str.charAt(6);
        char segundo2 = str.charAt(7);

        //Convierte los chars en int, multiplicando el primer caracter de las horas por 10
        int x = Character.getNumericValue(hora1) * 10;
        int y = Character.getNumericValue(hora2);
        int horas = x + y;
        System.out.println("horas: " + horas);

        //Convierte los chars en int, multiplicando el primer caracter de los minutos por 10
        int a = Character.getNumericValue(minuto1) * 10;
        int b = Character.getNumericValue(minuto2);
        int minutos = a + b;
        System.out.println("minutos: " + minutos);

        //Convierte los chars en int, multiplicando el primer caracter de las horas por 10
        int s = Character.getNumericValue(segundo1) * 10;
        int z = Character.getNumericValue(segundo2);
        int segundos = s + z;
        System.out.println("segundos: " + segundos);

        if (segundos >= 0 && segundos <= 59) {
            segundos++;

            if (segundos >= 60) {
                minutos++;
                segundos = 00;
            }
            if (minutos >= 60) {
                minutos = 00;
                horas++;
            }
            if (horas >= 24) {
                horas = 00;
            }
        }
        System.out.println("La nueva hora es: " + horas + ":" + minutos + ":" + segundos);
    }

}
