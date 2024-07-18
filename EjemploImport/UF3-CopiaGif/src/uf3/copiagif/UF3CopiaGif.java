/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf3.copiagif;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumne
 */
public class UF3CopiaGif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean fin_lectura = false;
        int readbyte;
        Scanner scan = new Scanner(System.in);
        //pedimos ruta origen y destino
        System.out.println("Dime el archivo a copiar: ");
        String rutaO = ("files/" + scan.nextLine() + ".gif");
        System.out.println("Dime nombre del nuevo archivo: ");
        String rutaD = ("files/" + scan.nextLine() + ".gif");

        try {
            FileInputStream fis = new FileInputStream(rutaO);
            FileOutputStream fos = new FileOutputStream(rutaD);

            while (fin_lectura == false) { //mientras no lleguemos al fin, copiamos byte a byte
                readbyte = fis.read();
                if (readbyte == -1) {
                    fin_lectura = true;
                } else {
                    fos.write(readbyte);
                }
            }
            //cerramos ambos objetos
            fis.close();
            fos.close();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

}
