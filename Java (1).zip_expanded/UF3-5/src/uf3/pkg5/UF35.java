/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf3.pkg5;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author alumne
 */
public class UF35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nFichero = "files/numeros.txt";
        int suma = 0;
        
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(nFichero);
            br = new BufferedReader(fr);
            String linea = br.readLine();
            
            while (linea != null) {
                System.out.println(Integer.valueOf(linea));
                suma += Integer.valueOf(linea);
                linea = br.readLine();
            }
            
            System.out.println("La suma final es de: "+suma);
            fr.close();
            //al acabar hay que cerrar el fichero

        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

}
