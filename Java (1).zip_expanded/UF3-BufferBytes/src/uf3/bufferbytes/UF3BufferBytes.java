/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf3.bufferbytes;

import java.io.*;

/**
 *
 * @author alumne
 */
public class UF3BufferBytes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String origen = "files/mr.gif";
        String destino = "files/copia.gif";
        copia(origen, destino);
    }

    public static void copia(String origen, String destino) {

        int readbyte;
        byte[] array = new byte[1000]; //leermos muchos bytes de golpe
        try {
            FileInputStream fis = new FileInputStream(origen);
            BufferedInputStream bis = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream(destino);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            readbyte = bis.read(array);
            while (readbyte > 0) {
                bos.write(array, 0, readbyte);
                readbyte = bis.read(array);
            }
            //cerramos ambos objetos
            bis.close();
            bos.close();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

}
