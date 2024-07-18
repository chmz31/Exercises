/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedrapapertisora;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mon
 */
public class Pedrapapertisora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Compruebo las funciones por seaparado:
        //System.out.println("Jugada Manual: " + jugadaManual());
        int puntosj1 = 0;
        int puntosj2 = 0;
        int jugada1, jugada2;
        int ganador;
        int numjugadas = 0; //para contar el numero de jugadas

        System.out.println("BIENVENIDO AL PIEDRA-PAPEL-TIJERA\n");
        do {
            //Jugada:
            //tira humano
            jugada1 = jugadaManual();
            imp_jugada(jugada1);
            //tira maquina
            jugada2 = jugadaMaquina();
            imp_jugada(jugada2);
            //muestro ganador
            ganador = ganadorMano(jugada1, jugada2);
            imp_ganador(ganador);
            //incremento puntuacion
            if (ganador == 1) {
                puntosj1++;
            }
            if (ganador == 2) {
                puntosj2++;
            }
            //muestro marcador
            marcador(puntosj1, puntosj2);
            numjugadas++;

        } while ((puntosj1 < 3 && puntosj2 < 3) && numjugadas < 5);

    }

    //Creo las funciones
    /**
     * Pide al usuario elegir entre piedra-papel-tijera (0,1,2) y devuelve la
     * elección.
     *
     * @return
     */
    public static int jugadaManual() {
        Scanner teclado = new Scanner(System.in);
        int jugada = -1;
        do {
            System.out.println("ELECCION JUGADOR:");
            System.out.print("0-Piedra ");
            System.out.print("1-Papel ");
            System.out.print("2-Tijera ");
            System.out.print("Elige: ");
            jugada = teclado.nextInt();

        } while (jugada < 0 || jugada > 2);

        return jugada;
    }

    /**
     * Funcion que hace la tirada de la máquina: piedra-papel-tijera (0,1,2)
     *
     * @return
     */
    public static int jugadaMaquina() {
        Random r1 = new Random();
        return r1.nextInt(3);
    }

    /**
     * imprime por pantalla Piedra, papel o tijera en función del parametro de
     * entrada (0,1,2)
     *
     * @param tirada 0,1,2 (piedra, papel, tijera)
     */
    public static void imp_jugada(int tirada) {
        if (tirada == 0) {
            System.out.println("Piedra");
        } else if (tirada == 1) {
            System.out.println("Papel");
        } else if (tirada == 2) {
            System.out.println("Tijera");
        } else {
            System.out.println("Tirada No Valida");
        }
    }

    /**
     * Devuelve 0 si hay empate, 1 si gana el jugador 1 y 2 si gana el jugador
     * 2.
     *
     *
     * @param tiradaPlayer1
     * @param tiradaPlayer2
     * @return
     */
    public static int ganadorMano(int tiradaPlayer1, int tiradaPlayer2) {
        int ganador = 0;

        if (tiradaPlayer1 == tiradaPlayer2) {
            ganador = 0;
        } else if (tiradaPlayer1 == 0 && tiradaPlayer2 == 1) {
            ganador = 2;
        } else if (tiradaPlayer1 == 1 && tiradaPlayer2 == 2) {
            ganador = 2;
        } else if (tiradaPlayer1 == 2 && tiradaPlayer2 == 0) {
            ganador = 2;
        } else {
            ganador = 1;
        }

        return ganador;
    }

    /**
     * imprime la frase que jugador ha ganado
     *
     * @param ganador
     */
    public static void imp_ganador(int ganador) {
        if (ganador == 0) {
            System.out.println("Empate!");
        } else if (ganador == 1) {
            System.out.println("Gana Jugador1");
        } else {
            System.out.println("Gana jugador2");
        }
    }

    /**
     * imprime la puntuación de cada jugador.
     *
     * @param puntosPlayer1
     * @param puntosPlayer2
     */
    public static void marcador(int puntosPlayer1, int puntosPlayer2) {
        System.out.println("******* MARCADOR *********");
        System.out.println("** Jugador1 ** Jugador2 **");
        System.out.println("**    " + puntosPlayer1 + "     **     " + puntosPlayer2 + "    **");
        System.out.println("**************************");
    }
}
