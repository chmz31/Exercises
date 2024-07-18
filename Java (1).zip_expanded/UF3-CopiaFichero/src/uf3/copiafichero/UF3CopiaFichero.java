/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf3.copiafichero;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author alumne
 */
public class UF3CopiaFichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nFichero = "files/datos.txt";

        FileReader fr = null;
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            System.out.println("Voy a copiar tu archivo "+nFichero);
            fr = new FileReader(nFichero);
            
            fw = new FileWriter("files/copia.txt"); //con fw por defecto si ya tenemos un archivo se sobrescribe
            pw = new PrintWriter(fw);

            int c = fr.read(); //recorremos el archivo de texto original
            while (c != -1) {
                pw.print((char) c); //convertimos a caracter e añadimos al fichero copia.txt
                c = fr.read();
            }
            //cerramos los objetos lectura/escritura
            fr.close();
            pw.close();
            System.out.println("He copiado correctamente tu archivo");
        } catch (Exception ex) {
            System.out.println("ERROR " + ex.getMessage());
        }

    }

}
