/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf3.concatenaficheros;

import java.io.*;

/**
 *
 * @author alumne
 */
public class UF3ConcatenaFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nFichero1 = "files/documento1.txt";
        String nFichero2 = "files/documento2.txt";

        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("files/sortida.txt"); //con fw por defecto si ya tenemos un archivo se sobrescribe
            pw = new PrintWriter(fw);

            //leemos el primer archivo
            System.out.println("Voy a leer tu archivo " + nFichero1);
            fr = new FileReader(nFichero1);
            br = new BufferedReader(fr);

            String linea = br.readLine(); //recorremos las lineas e añadimos al archivo
            while (linea != null){
                pw.print(linea);
                linea = br.readLine();
            }

            //leemos el segundo archivo
            System.out.println("Voy a leer tu archivo " + nFichero2);
            fr = new FileReader(nFichero2);
            br = new BufferedReader(fr);

            linea = br.readLine(); //recorremos las lineas e añadimos al archivo
            while (linea != null){
                pw.print(linea);
                linea = br.readLine();
            }
            //cerramos todo al acabar
            fr.close();
            pw.close();

        } catch (Exception ex) {
            System.out.println("ERROR " + ex.getMessage());
        }

    }
}
