/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles10;
//Realiza un programa que lea una secuencia de notas (con valores que van de 0 a 10) que
//termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Bucles10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenid@ a la interfaz contadora de alumnos de 10, introduce las notas (con valores del 0 al 10) e introduce -1 cuando hayas acabado");
        //inicializamos las variables
        int opcion = 0;
        int listillos = 0;
        //inicalizamos un boolean que usaremos mas adelante para comprobar si hubo alumnos de 10
        boolean check = false;
        //comprobamos que la opcion no sea -1 (opcion que equivale a salir)
        while (opcion != -1) {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            if (num >= 0 && num <= 10) {
                if (num == 10) {
                    //si introducimos 10 como nota, se aumentara el contador y activaremos el boolean para que el sistema sepa que hubo alumnos de 10
                    listillos++;
                    check = true;
                }
            } else if (num == -1) {
                //si el numero (nota) introducido es -1, detectamos que el usuario quiere dar por acabado el programa
                System.out.println("Has escogido salir");
                opcion = -1;
            } else {
                System.out.println("El numero introducido es invalido");
            }
        }
        if (check == true) { //si el boolean ha sido activado ( es decir hemos introducido minimo un 10) llevaremos a cabo las siguientes acciones
            System.out.println("En esta clase hubo listillos");
            System.out.println("Alumnos de 10: " + listillos);

        } else {
            System.out.println("No hubo nadie con 10 de nota");
        }
    }

}
