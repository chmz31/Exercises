/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf3.copiasinvocales;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class UF3CopiaSinVocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nFichero = "files/datos.txt";
        FileReader fr = null;
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            //inicializamos objetos lectura
            fr = new FileReader(nFichero);
            System.out.println("Voy a copiar tu archivo " + nFichero);
            //inicializamos objetos escritura
            fw = new FileWriter("files/copia.txt");
            pw = new PrintWriter(fw);

            int c = fr.read();
            while (c != -1) {
                //comprobamos que el caracter no sea una vocal
                if ((char) c == 'a' | (char) c == 'e' | (char) c == 'i' | (char) c == 'o' | (char) c == 'u' | (char) c == 'A' | (char) c == 'E' | (char) c == 'I' | (char) c == 'O' | (char) c == 'U') {
                    
                }else{ //Si no es una vocal sabemos que lo tenemos que imprimir
                    pw.print((char) c);
                }
                c = fr.read();

            }
            //al acabar hay que cerrar el fichero
            pw.close();
            fr.close();
            System.out.println("cpd crrctmnt t rchv");
        } catch (Exception ex) {
            System.out.println("ERROR " + ex.getMessage());
        }
    }

}
