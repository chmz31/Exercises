/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tresenraya;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Tresenraya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[][] tablero = new char[3][3];
        int turno=0;
        char tirada;
        int res;

        iniciaTauler(tablero);
        printaTauler(tablero);
        
        do{
            //turno
            if(turno%2==0){
                tirada='x';
                System.out.println("TIRAN X");
            }else{
                tirada='o';
                System.out.println("TIRAN O");
            }
            //rutina de la tirada
            tirada(tablero,tirada);
            printaTauler(tablero);
            res=comprova(tablero,tirada);
            if(res==1)System.out.println("Ha ganado jugador "+tirada);
            
            turno++;
           
        }while(res==0);

    }
    

    /*rellenamos la matriz con '-'*/
    public static void iniciaTauler(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = '-';
            }
        }
    }

    /*imprimimos la matriz*/
    public static void printaTauler(char[][] tablero) {
        System.out.println("\nTABLERO\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static void tirada(char[][] tablero, char tirada) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dime fila (i): ");
        int i = scan.nextInt();
        System.out.print("Dime la columna(j): ");
        int j = scan.nextInt();

        if (i < 0 || i > 2 || j < 0 || j > 2) {
            System.out.println("valores i,j no validos (0-2)");
            tirada(tablero, tirada);//recursividad
            return;
        }

        if (tablero[i][j] == '-') {
            tablero[i][j] = tirada;
        } else {
            System.out.println("ERROR VUELVE A TIRAR!");
            tirada(tablero, tirada); //recursividad
        }

    }

    /*
    Si hay 3 en raya retorna 1
    Si tablero lleno retorna -1
    Si no hay tres en raya retorna 0
     */
    public static int comprova(char[][] tablero, char tirada) {
        boolean tres = false;
        
        //todas las filas de golpe:
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == tirada && tablero[i][1] == tirada && tablero[i][2] == tirada) {
                tres = true;
            }
        }
        //diagonal1
        if (tablero[0][0] == tirada && tablero[1][1] == tirada && tablero[2][2] == tirada) {
            tres = true;//hay tres en raya
        }
        //todas las columnas
        for (int i = 0; i < 3; i++) {
            if (tablero[0][i] == tirada && tablero[1][i] == tirada && tablero[2][i] == tirada) {
                tres = true;
            }
        }

        //diagonal2
        if (tablero[2][0] == tirada && tablero[1][1] == tirada && tablero[0][2] == tirada) {
            tres = true;//hay tres en raya
        }

        //compruebo si esta lleno: recorro la matriz y miro si no hay guiones
        boolean hay_guiones = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == '-') {
                    hay_guiones = true;
                }
            }
        }
        //retorno resultado
        if (tres) {
            return 1;
        } else if (hay_guiones) {
            return 0;
        } else {
            return -1;
        }
    }
}
