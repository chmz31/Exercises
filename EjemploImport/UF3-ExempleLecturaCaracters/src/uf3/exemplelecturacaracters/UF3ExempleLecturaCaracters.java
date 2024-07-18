/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf3.exemplelecturacaracters;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumne
 */
public class UF3ExempleLecturaCaracters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String rutaFichero = "f1.txt";
        File archivo = new File(rutaFichero);

        try {
            FileReader fr = new FileReader(archivo);

            int c = fr.read();
            while (c != -1) {
                System.out.print((char) c);
                c = fr.read();
            }
            //al acabar hay que cerrar el fichero
            fr.close();

        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        } finally { //se ejecuta siempre al acabar haya error o no
            System.out.println("Final");
        }
    }

}
