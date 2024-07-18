/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf3.ejemplobinaryfiles;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumne
 */
public class UF3EjemploBinaryFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("docs/chorizo.jpeg");
        System.out.println("archivo: " + f.getName());
        int[] bytes = new int[6895];

        lecturaFichero(f, bytes);
        escrituraFichero(bytes);

    }

    public static void lecturaFichero(File f, int[] bytes) {
        boolean fin_lectura = false;
        String origen = "docs/chorizo.jpeg";
        int byteLeido;
        int numBytes = 0;
        try {
            FileInputStream fis = new FileInputStream(f);
            while (fin_lectura == false) {
                byteLeido = fis.read();
                if (byteLeido == -1) {
                    fin_lectura = true;
                } else {
                    bytes[numBytes] = byteLeido;
                    numBytes++;
                }
            }
            System.out.println("Bytes: " + numBytes);
            fis.close();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void escrituraFichero(int[] bytes) {
        String nFichero = "docs/copia.jpeg";
        try {
            FileOutputStream fos = new FileOutputStream(nFichero);
            for (int i = 0; i < bytes.length; i++) {
                fos.write(bytes[i]);
            }
            fos.close();
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }

}
