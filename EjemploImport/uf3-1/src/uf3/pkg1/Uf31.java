/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf3.pkg1;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumne
 */
public class Uf31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nFichero = "files/datos.txt";
       
        try {
            FileReader fr = new FileReader(nFichero);
            
            int c = fr.read();
            while (c != -1) {
                System.out.print((char) c);
                c = fr.read();
            }
            fr.close();
        } catch (Exception ex) {
            System.out.println("ERROR "+ex.getMessage());
        }
    }
    
}
