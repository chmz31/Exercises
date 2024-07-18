/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf3.ficheroteclado;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class UF3FicheroTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("Data"); //con fw por defecto si ya tenemos un archivo se sobrescribe
            pw = new PrintWriter(fw);
            //escribimos
            System.out.println("Dime texto a escribir: ");
            String texto = scan.nextLine();
            pw.println(texto);

            fw.close();
            //al acabar hay que cerrar el fichero

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}
