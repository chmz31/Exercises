/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf3.lecturafichersteclat;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class UF3LecturaFichersTeclat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nFichero1 = "files/1.txt";
        File f1 = new File(nFichero1);
        FileWriter fw = null;
        PrintWriter pw = null;
        Scanner scan = null;
        
        try {
            Scanner sc = new Scanner(System.in);
            scan = new Scanner(f1);
            
            fw = new FileWriter(nFichero1);
            pw = new PrintWriter(fw);
            
            System.out.println("Dime contenido fichero: ");
            pw.print(sc.nextLine()); //escribimos fichero
            pw.close();       
            
            //leemos fichero
            System.out.println("Voy a leer tu fichero");
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }

        } catch (Exception ex) {
            System.out.println("ERROR " + ex.getMessage());
        }
        
    }
    
}
