/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringsahorcado;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class StringsAhorcado {
    
    public static void main(String[] args) {
        //inicializamos las variables
        boolean acabar = false, acierto = false;
        int INTENTOSMAX = 9, intentos = 0, dichas = 0;
        char[] letrasDichas = new char[27];
        rellenarVector(letrasDichas); // rellenamos el vector letras dichas para su uso posterior
        //pedimos que introduzcan una palabra y usamos su longitud para crear fraseOculta
        System.out.println("Introduce una palabra para empezar el juego: ");
        String fraseFinal = pedirFrase().toLowerCase();
        char[] fraseOculta = new char[fraseFinal.length()];
        rellenarFraseOculta(fraseOculta, fraseFinal);
        do {
            imprimirFraseVector(fraseOculta);
            char letra = pedirLetra(letrasDichas);
            int vecesLetra = buscarLetra(fraseFinal, fraseOculta, letra);
            System.out.println("He encontrado tu letra: " + vecesLetra + " veces");
            acierto = fraseAcertada(fraseFinal, fraseOculta);
            if (intentos == 8 || acierto == true) {
                acabar = true;
            }
            if (letra != '0' && vecesLetra == 0) {
                intentos++;
            }
            System.out.println("Intentos restantes " + (9 - intentos) + "\n");
        } while (acabar == false);
        if (acierto == true) {
            System.out.println("Has adviniado la frase!\nla frase era: " + fraseFinal);
        } else
            System.out.println("Has perdido! mas suerte la proxima vez\nla frase era: " + fraseFinal);
    }

    public static String pedirFrase() {
        Scanner scan = new Scanner(System.in);
        String entrada = scan.nextLine();
        return entrada;
    }

    public static void rellenarFraseOculta(char[] fraseOculta, String fraseFinal) {
        for (int i = 0; i < fraseOculta.length; i++) {
            fraseOculta[i] = fraseFinal.charAt(i);
        }

        for (int i = 0; i < fraseOculta.length; i++) {
            if (fraseOculta[i] != ' ') {
                fraseOculta[i] = '-';
            }
        }
    }

    public static void rellenarVector(char[] vector) {
        //rellena un vector de caracteres
        for (int i = 0; i < vector.length; i++) {
            vector[i] = '-';
        }
    }

    public static void imprimirFraseVector(char[] fraseVector) {
        for (int i = 0; i < fraseVector.length; i++) {
            System.out.print(fraseVector[i]);
        }
        System.out.println(""); //para poner un espacio al final
    }

    public static char pedirLetra(char[] letrasDichas) {
        //comprueba si ya se ha dicho esa letra y en caso negativo la añade a la lista
        Scanner scan = new Scanner(System.in);
        char letra = scan.next().charAt(0);
        for (int i = 0; i < letrasDichas.length; i++) {
            if (letrasDichas[i] == letra) {
                return '0';
            } else if (letrasDichas[i] == '-') {
                letrasDichas[i] = letra;
                System.out.println("--------------------------LETRAS DICHAS--------------------------\n" + Arrays.toString(letrasDichas) + "\n-------------------------------------------------------------------------");
                return letra;
            }
        }
        return letra;
    }

    public static int buscarLetra(String fraseOriginal, char[] fraseOculta, char letra) {
        int contador = 0;
        for (int i = 0; i < fraseOriginal.length(); i++) {
            //si encuentra esa letra en frase original, la remplaza en el array de chars para poder mostrarla
            if (letra == fraseOriginal.charAt(i)) {
                fraseOculta[i] = letra;
                contador++; //tambien lleva la cuenta de las veces que aparece esa letra
            }
        }
        return contador; //devuelve el numero de veces que aparece la letra
    }

    public static boolean fraseAcertada(String fraseFinal, char[] fraseOculta) {
        //comprueba si frase final y la fraseOculta son iguales (en el momento de ejecutar)
        boolean salida = true;
        for (int i = 0; i < fraseFinal.length(); i++) {
            if (fraseOculta[i] != fraseFinal.charAt(i)) {
                salida = false;
            }
        }
        return salida;
    }
}
