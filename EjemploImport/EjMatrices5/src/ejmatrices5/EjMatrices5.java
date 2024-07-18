/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejmatrices5;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjMatrices5 {

//    Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
//    empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la
//    información de N personas distintas (valor también introducido por teclado). Para cada
//    persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta información debe
//    guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio de cada
//    género.
    public static void main(String[] args) {
        //inicializamos las variables
        int genero;
        int salario, introducidos = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("De cuantas personas se va a introducir el salario?");
        int MAX = scan.nextInt();
        int[][] salariosUnisex = new int[2][MAX];
        do {
            genero = determinaGenero();
            salario = pideSalario();
            rellenaMatriz(salariosUnisex, genero, salario);
            introducidos++;
        } while (introducidos < MAX);
        System.out.println("------------MEDIAS------------\nMedia Varón: " + calculaMedia(salariosUnisex, 0) + "\nMedia Mujer: " + calculaMedia(salariosUnisex, 1) + "\n------------------------------");
    }

    public static int determinaGenero() {
        //Pregunta por el genero y devuelve 0 o 1
        Scanner scan = new Scanner(System.in);
        System.out.println("De que genero es la persona?\n0) Hombre\t1) Mujer");
        int genero = scan.nextInt();
        return genero;
    }

    public static int pideSalario() {
        //pregunta por el salario, lee el input del teclado y lo devuelve como entero
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el salario (sin decimales) : ");
        int salario = scan.nextInt();
        return salario;
    }

    public static void rellenaMatriz(int[][] salarios, int genero, int salario) {
        //Busca el siguiente valor no nulo, en la fila segun el genero y lo rellena con el salario
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < salarios[genero].length; j++) {
                if (salarios[genero][j] == 0) {
                    salarios[genero][j] = salario;
                    return;
                }
            }
        }
    }

    public static double calculaMedia(int[][] salarios, int genero) {
        //calcula la media para un genero , que nosotros definimos
        double media = 0.0;
        int contadorNoNulos = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < salarios[genero].length; j++) {
                if (salarios[genero][j] != 0) {
                    media = media + salarios[genero][j];
                    contadorNoNulos++;
                }
            }
            media = media / contadorNoNulos;
        }
        return media;
    }
}
