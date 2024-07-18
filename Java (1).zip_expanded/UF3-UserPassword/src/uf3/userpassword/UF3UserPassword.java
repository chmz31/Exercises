/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf3.userpassword;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class UF3UserPassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime nombre de fichero: ");
        String nombreFichero = scan.nextLine();

        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("files/admin.txt"); //creamos un FileWriter 
            pw = new PrintWriter(fw);
            
            //PEDIMOS DATOS
            System.out.println("Dime usuario: ");
            String usuario = scan.nextLine();
            System.out.println("Dime password: ");
            String password = scan.nextLine();
            System.out.println("Dime edad: ");
            String edad = scan.nextLine();
            //Escribimos los datos al archivo y cerramos
            pw.println("usuario: "+usuario);
            pw.println("password: "+password);
            pw.print("edad: "+edad);
            pw.close();
            
        } catch (Exception ex) {
            System.out.println("ERROR " + ex.getMessage());
        }

    }
}
