/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf3.separadorporpalabras;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumne
 */
public class UF3SeparadorPorPalabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nFichero = "files/file.txt";
       File file = new File(nFichero);
       
        try {
            Scanner scan = new Scanner(file); //inicializamos el scaner con el archivo
            while(scan.hasNext()){ //si hay algo entre espacios
                System.out.println(scan.next()); //imprimimos el siguiente "bloque"
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error");
        }
    }
    
}
