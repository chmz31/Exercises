/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrius.pkg3.en.ralla;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Matrius3EnRalla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicializamos las variables
        Scanner scan = new Scanner(System.in);
        char[][] tauler = new char[3][3];
        int puntosJ1 = 0, puntosJ2 = 0, puntosPartida, turno = 0;
        char tirada = '-';
        boolean acaba = false;
        System.out.print("a cuantos puntos quieres jugar?: \n");
        puntosPartida = scan.nextInt(); //preguntamos por los puntos para ganar
        iniciaTauler(tauler); //inicia el tablero rellenando con "-"
        printaTauler(tauler);
        int salida = 0;
        do {
            if (turno == 0) {
                tirada = 'x';
                turno = 1;
            } else {
                tirada = 'o';
                turno = 0;
            }
            tirada(tauler, tirada);
            printaTauler(tauler);
            salida = comprova(tauler, tirada);
            switch (salida) {
                case 0:

                    break;
                case 1:
                    System.out.println("Tres en ralla!");
                    if (tirada == 'x') {
                        puntosJ1++;
                    } else if (tirada=='o'){
                        puntosJ2++;
                    }
                    marcador(puntosJ1, puntosJ2);
                    iniciaTauler(tauler); //inicia el tablero rellenando con "-"
                    printaTauler(tauler);
                    break;
                case -1:
                    System.out.println("Empate el tablero esta lleno");
                    marcador(puntosJ1, puntosJ2);
                    iniciaTauler(tauler); //inicia el tablero rellenando con "-"
                    printaTauler(tauler);
                    break;
            }

            if (puntosJ1 >= puntosPartida || puntosJ2 >= puntosPartida) {
                acaba = true;
            }
        } while (acaba == false);

    }

    public static void iniciaTauler(char[][] tauler) {
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                tauler[i][j] = '-';
            }
        }
    }

    public static void printaTauler(char[][] tauler) {
        int fila = 0;
        System.out.println("0  1  2");
        //esta funcion imprime el tablero
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                System.out.print(tauler[i][j] + "  ");

            }
            System.out.println(fila + "");
            fila++;
            System.out.println("");
        }
    }

    public static void tirada(char[][] tauler, char tirada) {
        //Esta funcion colocara la ficha si la posicion esta disponible
        Scanner scan = new Scanner(System.in);
        System.out.println("Le toca a: " + tirada);
        System.out.print("En que posicion colocas ficha: \nIntroduce fila: ");
        int x = scan.nextInt();
        System.out.print("\nIntroduce columna:\n");
        int y = scan.nextInt();
        if (tauler[x][y] == '-') {
            tauler[x][y] = tirada;
        } else {
            System.out.println("Incorrecto");
            tirada(tauler, tirada);
        }
    }

    public static int comprova(char[][] tauler, char tirada) {
        //comprueba si hay tres en ralla para el jugador que ha hecho la ultima jugada y devuelve segun.
        //Aqui tenemos toda la logica del juego
        boolean tableroLleno = true;
        for (int i = 0; i < 3; i++) { //comprobamos las filas
            if (tauler[i][0] == tauler[i][1] && tauler[i][1] == tauler[i][2] && tauler[i][2] == tirada) {
                return 1;
            }
        }
        for (int i = 0; i < 3; i++) { //comprobamos columnas
            if (tauler[0][i] == tauler[1][i] && tauler[1][i] == tauler[2][i] && tauler[2][i] == tirada) {
                return 1;
            }
        }   //comprobamos diagonales
        if (tauler[0][0] == tirada && tauler[0][0] == tauler[1][1] && tauler[1][1] == tauler[2][2] || tauler[0][0] == tirada && tauler[0][2] == tauler[1][1] && tauler[1][1] == tauler[0][0]) {
            return 1;
        }

        for (int i = 0; i < tauler.length; i++) { //revisamos si el tablero esta lleno
            for (int j = 0; j < tauler.length; j++) {
                if (tauler[i][j] == '-') {
                    tableroLleno = false; //si encuentra un espacio sin ficha lleno=false
                }
            }
        }

        if (tableroLleno == true) {
            return -1;
        }

        return 0; //este es el return por defecto si no se cumple nada de lo anterior es decir, no hay tres en ralla y no esta lleno el tablero
    }

    public static void marcador(int puntsJug1, int puntsJug2) {
        System.out.println("--------MARCADOR--------\nPuntos J1: " + puntsJug1 + " PuntosJ2: " + puntsJug2 + "\n--------------------------------");
    }

}
