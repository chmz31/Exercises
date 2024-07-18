/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf3.pkg4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class UF34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime nombre de fichero: ");
        String nombreFichero = scan.nextLine();

        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(nombreFichero); //con fw por defecto si ya tenemos un archivo se sobrescribe
            pw = new PrintWriter(fw);
            FileReader fr = new FileReader(nombreFichero);
            //escribimos
            System.out.println("Dime texto a escribir: ");
            String texto = scan.nextLine();
            pw.println(texto);

            fw.close();

            int c = fr.read();
            while (c != -1) { //se ejecuta mientras no llegue al eof
                if (Character.isUpperCase(c)) { //inviertimos mayus y minus al mostrar
                    System.out.print((char) Character.toLowerCase(c));
                } else {
                    System.out.print((char) Character.toUpperCase(c));
                }
                c = fr.read();
            }
            //al acabar hay que cerrar el fichero
            fr.close();

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

}
