/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buscaeltesoromatriz;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class BuscaElTesoroMatriz {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //aqui inicializamos las variables que vamos a utilizar
        char[][] tablero = new char[8][8];
        int opcion = 5, posX = 0, posY = 0, direccion;
        boolean hayTesoro = true, salir = false;
        iniciarTablero(tablero);
        do {
            if(posX != 7 || posY != 7){
            tablero[7][7] = 'F';
            }
            
            imprimirTablero(tablero);
            menu();
            direccion = mover(tablero, posX, posY);
            
            //comprobamos que la direccion sea valida y actualizamos las cordenadas
            if (direccion == 1 && posY - 1 >= 0) {
                posY = posY - 1;
            }
            if (direccion == 2 && posY + 1 <= 7) {
                posY = posY + 1;
            }
            if (direccion == 3 && posX - 1 >= 0) {
                posX = posX - 1;
            }
            if (direccion == 4 && posX + 1 <= 7) {
                posX = posX + 1;
            }
            
            System.out.println("X: " + posY + " Y: " + posX);
            
            hayTesoro = comprobarFinal(tablero);
            if(hayTesoro == false && posX == 7 && posY == 7){
            salir = true;
            }
        } while (salir == false);
        imprimirTablero(tablero);
        System.out.println("Has ganado!");
    }

    public static void menu() {
        System.out.println("--------------------BUSCA EL TESORO--------------------");
        System.out.println("\t1. ←  2. →  3. ↑  4. ↓ ");
        System.out.println("-----------------------------------------------------------------");

    }

    public static void iniciarTablero(char[][] tablero) { //rellenamos el tablero de - y agregamos los 4 tesoros
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '□';
            }
        }

        tablero[0][0] = 'x';
        tablero[7][7] = 'F';

        int contador = 0;
        for (int i = 0; contador < 4; i++) {
            int r1 = rand8(), r2 = rand8();
            if (tablero[r1][r2] == '□') {
                tablero[r1][r2] = '▣';
                contador++;
            }
        }

    }

    public static void imprimirTablero(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static int rand8() {
        Random r = new Random();
        return r.nextInt(7) + 1;
    }

    public static int mover(char[][] tablero, int posX, int posY) {
        Scanner scan = new Scanner(System.in);
        System.out.print("En que direccion te quieres mover? ");
        int direccion = scan.nextInt();
        if (direccion < 1 || direccion > 4) {
            mover(tablero, posX, posY);
        }
        switch (direccion) {//actualizamos la posicion del jugador y marcamos las casillas pasadas como 0
            case 1:
                if (posY - 1 >= 0) {
                    tablero[posX][posY] = '■';
                    tablero[posX][posY - 1] = 'x';
                }
                break;
            case 2:
                if (posY + 1 <= 7) {
                    tablero[posX][posY] = '■';
                    tablero[posX][posY + 1] = 'x';
                }
                break;
            case 3:
                if (posX - 1 >= 0) {
                    tablero[posX][posY] = '■';
                    tablero[posX - 1][posY] = 'x';
                }
                break;
            case 4:
                if (posX + 1 <= 7) {
                    tablero[posX][posY] = '■';
                    tablero[posX + 1][posY] = 'x';
                }
                break;
        }
        return direccion;
    }

    public static boolean comprobarFinal(char[][] tablero) { //comprobamos si quedan tesoros en el tablero.
        boolean hayTesoro = false;
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j] == '▣') {
                    hayTesoro = true;
                }
            }
        }
        return hayTesoro;
    }
}
