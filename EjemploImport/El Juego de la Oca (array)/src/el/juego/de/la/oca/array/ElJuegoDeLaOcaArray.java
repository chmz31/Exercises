/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package el.juego.de.la.oca.array;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author alumne
 */
public class ElJuegoDeLaOcaArray {

    //el juego de la oca yo tiro porque me toca
    public static void main(String[] args) {
        //inicializamos las variables
        int[] tablero = new int[30];
        int posJ1 = 0, posJ2 = 0, tiradaJ1, tiradaJ2;
        boolean acabar = false;
        iniciarTablero(tablero);
        while (acabar == false) {
            System.out.println("Turno J1:");
            posJ1 = nuevaPos(tablero, posJ1, tirada_dado());
            imprimirPosicion(tablero, posJ1, posJ2);
            System.out.println("Turno J2:");
            posJ2 = nuevaPos(tablero, posJ2, tirada_dado());
            imprimirPosicion(tablero, posJ1, posJ2);
            if (posJ1 >= 30 || posJ2 >= 30) {
                acabar = true;
            }
        }
    }

    public static int tirada_dado() {
        //simula la tirada de un dado de 6 caras
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    public static void iniciarTablero(int[] tablero) {
        //rellena el tablero de 0s
        for (int i = 0; i < tablero.length; i++) {
            tablero[i] = 0;
        }
        for (int i = 0; i < 5; i++) {
            tablero[rellenaOca(tablero)] = 1;
        }

        int muertes = 0;
        while (muertes < 1) {
            int r = azar();
            if (tablero[r] == 0) {
                tablero[r] = 2;
                muertes++;
            }
        }
    }

    public static int azar() {
        //genera 1 numero entre 0 y 30
        Random rand = new Random();
        return rand.nextInt(29) + 1;
    }

    public static int rellenaOca(int[] tablero) {
        int vuelta = 0;
        //rellena 1 casillas al azar con oca
        int num = azar();
        if (tablero[num] == 0) {
            vuelta = num;
        } else {
            return rellenaOca(tablero);
        }
        return vuelta;
    }

    public static int nuevaPos(int[] tablero, int posJugador, int tirada) {
        posJugador = posJugador + tirada;
        //Devuelve la nueva posicion por el tablero segun su tirada
        if (tablero[posJugador] == 2){
        return 0;
        }
        
        if (tablero[posJugador] == 1) {
            for (int i = posJugador + 1; i < tablero.length; i++) {
                if (tablero[i] == 1) {
                    return i;
                }
                //si llego al final y no hay mas ocas devuelve la ultima casilla
                if (i == tablero.length - 1) {
                    return tablero.length;
                }
            }
        }
        return posJugador;
    }

    public static void imprimirPosicion(int[] tablero, int posJ1, int posJ2) {
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(tablero[i] + " ");
        }
        System.out.println("");
        System.out.println("El jugador 1 se encuentra en la casilla: " + posJ1);
        System.out.println("El jugador 2 se encuentra en la casilla: " + posJ2);
    }
}
