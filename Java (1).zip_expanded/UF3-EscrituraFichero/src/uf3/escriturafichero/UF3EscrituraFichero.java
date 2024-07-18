/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf3.escriturafichero;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumne
 */
public class UF3EscrituraFichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreFichero = "f1.txt";
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter(nombreFichero); //con fw por defecto si ya tenemos un archivo se sobrescribe
            pw = new PrintWriter(fw);
            //escribimos
            pw.println("Aqui escribimos");
            for (int i = 0; i < 10; i++) {
                pw.println(i);
            }
            fw.close();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        
        try {
            //añadir texto
            fw = new FileWriter(nombreFichero,true); //si añadimos un true, en vez de soobrescribir añade
            pw = new PrintWriter(fw);
            pw.println("Ola k ase");
            fw.close();
        } catch (Exception ex) {
            System.out.println("Cagaste");
        }
    }

}
