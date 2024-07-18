/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej17;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lee los numeros que introducimos
        //el primer input es la hora
        Scanner miscanner = new Scanner(System.in);
        int x;
        System.out.print("Introduce la hora:  ");
        x = miscanner.nextInt();
        if (x >= 0 && x <= 23) {
            //el segundo input son los minutos
            Scanner segundoscanner = new Scanner(System.in);
            int y;
            System.out.print("Introduce los minutos: ");
            y = segundoscanner.nextInt();
            if (y >= 0 && y <= 60) {
                Scanner tercerscanner = new Scanner(System.in);
                int z;
                System.out.print("Introduce los segundos: ");
                z = tercerscanner.nextInt();
                if (z >= 0 && z <= 59) {
                    z++;
                    //comprobamos si los segundos son 60 para pasar de minuto
                    if (z >= 60) {
                        y++;
                        z = 00;
                    }//comprobamos si los minutos son 60 para pasar de hora
                    if (y >= 60) {
                        y = 00;
                        x++;
                    }//comprobamos si la hora es mayor de 24 y pasamos de dia en caso afirmativo
                    if (x >= 24) {
                        x = 00;
                    }
                    System.out.println("La hora mas un segundo es: " + x + ":" + y + ":" + z);
                } else {
                    System.out.println("Se han introducido unos segundos incorrectos");
                }
            } else {
                System.out.println("Se han introducido unos minutos incorrectos");
            }
        } else {
            System.out.println("Se ha introducido una hora incorrecta");
        }
    }
}
