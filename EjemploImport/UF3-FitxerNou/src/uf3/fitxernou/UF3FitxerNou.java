/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf3.fitxernou;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class UF3FitxerNou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime nombre de fichero: ");
        String nFichero = scan.nextLine();

        FileWriter fw = null;
        PrintWriter pw = null;
         try {
            fw = new FileWriter(nFichero); //con fw por defecto si ya tenemos un archivo se sobrescribe
            pw = new PrintWriter(fw);
            pw.print("Fitxer nou");
  
            //cerramos los objetos de escritura
            pw.close();
            System.out.println("He creado correctamente tu archivo");
        } catch (Exception ex) {
            System.out.println("ERROR " + ex.getMessage());
        }
    }
    
}
