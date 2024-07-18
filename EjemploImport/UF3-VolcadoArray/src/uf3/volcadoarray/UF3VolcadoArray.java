package uf3.volcadoarray;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class UF3VolcadoArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vector = new int[100]; //creamos un array de 100 posiciones donde almacenaremos los datos
        
        System.out.println("Dime nombre del archivo: ");
        String nFichero = scan.nextLine();
        
        boolean salir = false;
        FileReader fr = null;
        do {
            menu();
            System.out.println("Dime opcion: ");
            int opcion = scan.nextInt();
        } while (salir == false);
    }

    public static void menu() {
        System.out.println("1. Crear array");
        System.out.println("2. Mostrar array");
        System.out.println("0. Salir");
    }

}
