/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles13_mitades;

import java.util.Scanner;

/* 13. Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el ordenador intenta
adivinarlo. Es decir, el ordenador irá proponiendo números una y otra vez hasta adivinarlo (el
usuario deberá indicarle al ordenador si es mayor, menor o igual al número que ha pensado).
Calcular la mitad del rango ejemplo numero 27,
menor o igual a 50? 
menor, -->50/2 = 
25, mayor or menor? 
mayor ---> mitad 25/50
*/
/**
 *
 * @author alumne
 */
public class Bucles13_Mitades {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Bienvenido al juego de la adivinazna introduce un numero entre el 1 y el 100  y la maquina intentara acertarlo: ");
        //pedimos un numero
        Scanner scan = new Scanner(System.in);
        //Se inicializan las variables
        boolean acierto = false;
        int num = scan.nextInt();
        int min = 1, max = 100;
        int numPC = 50;
        //hacemos que la opcion sea un char para que se puedan usar los caracteres + o - para indicarle al programa
        char opcion;
        while (!acierto) {
            //cada iteracion el ordenador propone un numero y el usuario dira si es mayor o menor
            numPC =(min  + max ) / 2;
            System.out.println("Creo que tu numero es "+numPC+"\n dime si es menor (-) mayor (+) o igual (=)");
            opcion = scan.next().charAt(0);
            switch (opcion) {
                //en caso de que sea mayor el nuevo minimo es el numeroPC (rango de numPC a maximo)
                case '+':
                      min = numPC;                      
                    break;
                case '-':
                    //en caso de que sea mernor el nuevo maximo es el numeroPC (rango de minimo a numPC)
                     max = numPC;
                    break;
                case '=':
                    if (numPC == num){
                    acierto = true;
                    } else System.out.println("Tramposo");
                    break;
                default:
                     System.out.println("Lo siento, escoge una opcion valida");
            }
        }
        System.out.println("Lo he adivinado tu numero es: "+numPC);
    }
}