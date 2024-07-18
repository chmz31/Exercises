/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exuf1nf2_pe2_2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ExUF1NF2_pe2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicializamos las variables
        Scanner scan = new Scanner(System.in);
        int opcion, fila, columna;
        int TAM = 20; //constante para el tamaño de la matriz
        int[][] mapa = new int[TAM][TAM];

        //codigo principal, switch para las opciones
        do {
            opcion = menu();
            switch (opcion) {
                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    carregarMapa(mapa);
                    break;
                case 2:
                    visualitzarMapa(mapa);
                    break;
                case 3:
                    System.out.println("Dime fila: ");
                    fila = scan.nextInt();
                    System.out.println("Dime columna: ");
                    columna = scan.nextInt();
                    if (fila <= 19 && fila >= 0 || columna <= 19 && columna >= 0) {
                        System.out.println("En esta posicion hay " + minaEnPosicio(mapa, fila, columna) + " minas");
                    } else {
                        System.out.println("No se ha introducido una posicion valida");
                    }
                    break;
                case 4:
                    System.out.println("Dime fila: ");
                    fila = scan.nextInt();
                    System.out.println("Dime columna: ");
                    columna = scan.nextInt();
                    if (fila <= 19 && fila >= 0 || columna <= 19 && columna >= 0) {
                        System.out.println("En las casillas adjacentes hay: " + minesAdjacents(mapa, fila, columna) + " minas");
                    } else {
                        System.out.println("No se ha introducido una posicion valida");
                    }
                    break;
                case 5:
                    desactivarMina(mapa);
                    break;
            }
        } while (opcion != 0); //condicion de salida del programa

    }

    public static void carregarMapa(int[][] mapa) {
        //funcion que rellena todas las casillas del mapa con valores del 0 al 2
        Random r = new Random();
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                mapa[i][j] = r.nextInt(3);
            }

        }
    }

    public static void visualitzarMapa(int[][] mapa) {
        //funcion que imprime el mapa (tablero) por pantalla
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print(mapa[i][j] + " ");
            }
            System.out.println(""); //salto de linea despues de cada linea
        }
    }

    public static int minaEnPosicio(int[][] mapa, int fila, int columna) {
        //retorna la cantidad de minas que hay en una posicion
        int devuelto = 0;
        if (fila <= 19 && fila >= 0 || columna <= 19 && columna >= 0) { //comprobamos que las coordenadas sean validas
            devuelto = mapa[fila][columna];
        }
        return devuelto;
    }

    public static boolean desactivarMina(int[][] mapa) {
        boolean desactivar = false;
        Scanner scan = new Scanner(System.in);
        int fila, columna, opcion;
        System.out.println("Para desactivar una mina tienes que indicarme su posicion: ");
        System.out.print("Dime la fila: ");
        fila = scan.nextInt();
        System.out.print("Dime la columna:");
        columna = scan.nextInt();
        System.out.println("En esta posicion hay: " + minaEnPosicio(mapa, fila, columna) + "\n Quieres desactivar las minas en esta posicion? \n 1) Si 0) No");
        opcion = scan.nextInt();
        if (opcion == 1) {
            desactivar = true;
            mapa[fila][columna] -= 1;
        }
        return desactivar;
    }

    public static int minesAdjacents(int[][] mapa, int fila, int columna) {
        //retorna la cantidad de minas que hay adjacentes a una posicion
        int devuelto = 0;
        if (fila <= (mapa.length - 1) && fila >= 0 || columna <= (mapa.length - 1) && columna >= 0) { //comprobamos que las coordenadas sean validas
            if (fila == (mapa.length - 1) && columna != (mapa.length - 1) && columna != 0) { //fila derecha columna cualquiera
                devuelto += mapa[fila][columna - 1];
                devuelto += mapa[fila][columna + 1];
                devuelto += mapa[fila - 1][columna];
                devuelto += mapa[fila - 1][columna + 1];
                devuelto += mapa[fila - 1][columna - 1];
            }
            if (columna == (mapa.length - 1) && fila != (mapa.length - 1) && fila != 0) { //columna abajo cualquier fila
                devuelto += mapa[fila + 1][columna];
                devuelto += mapa[fila - 1][columna];
                devuelto += mapa[fila][columna - 1];
                devuelto += mapa[fila + 1][columna - 1];
                devuelto += mapa[fila - 1][columna - 1];

            }
            if (columna == (mapa.length - 1) && fila == (mapa.length - 1) && fila != 0) { //esquina inf derecha
                devuelto += mapa[fila - 1][columna];
                devuelto += mapa[fila][columna - 1];
                devuelto += mapa[fila - 1][columna - 1];
            }
            if (columna == 0 && fila != 0 && fila != (mapa.length - 1)) { //columna arriba cualquier fila
                devuelto += mapa[fila + 1][columna];
                devuelto += mapa[fila - 1][columna];
                devuelto += mapa[fila - 1][columna];
                devuelto += mapa[fila - 1][columna + 1];
                devuelto += mapa[fila][columna + 1];
            }
            if (fila == 0 && columna != 0 && columna != (mapa.length - 1)) { // fila izquierda columna cualquiera
                devuelto += mapa[fila][columna + 1];
                devuelto += mapa[fila][columna - 1];
                devuelto += mapa[fila + 1][columna];
                devuelto += mapa[fila + 1][columna - 1];
                devuelto += mapa[fila + 1][columna + 1];
            }

            if (columna == 0 && fila == 0) { //esqina superior izquierda
                devuelto += mapa[fila + 1][columna];
                devuelto += mapa[fila][columna + 1];
                devuelto += mapa[fila + 1][columna + 1];

            }
            if (fila == 0 && columna == (mapa.length -1)) { //ESQUINA INFERIOR IZQ
                devuelto += mapa[fila + 1][columna];
                devuelto += mapa[fila][columna - 1];
                devuelto += mapa[fila + 1][columna - 1];
                
            } else if (columna != 0 && columna != (mapa.length - 1) && fila != 0 && fila != (mapa.length - 1)) { //other
                devuelto += mapa[fila + 1][columna];
                devuelto += mapa[fila + 1][columna + 1];
                devuelto += mapa[fila + 1][columna - 1];
                devuelto += mapa[fila][columna + 1];
                devuelto += mapa[fila][columna - 1];
                devuelto += mapa[fila - 1][columna + 1];
                devuelto += mapa[fila - 1][columna];
                devuelto += mapa[fila - 1][columna - 1];
            }
        }
        return devuelto;
    }

    public static int menu() {
        //el menu que imprimimos por pantalla
        Scanner scan = new Scanner(System.in);
        int opcion = 1;
        System.out.println("DESACTIVADOR\t\t|\n0.salir\t\t\t|\n1.Cargar imagen satelite\t\t|\n2.Mostrar imagen\t\t|\n3.Buscar minas en posicion\t\t|\n4.Buscar minas adjacentes\t\t|\n5.Desactivar Mina\t\t|\n");
        System.out.println("Opcion: ");
        opcion = scan.nextInt();
        return opcion;

    }

}
