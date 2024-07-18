/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf3.ficheros;

import java.io.File;
import java.util.Date;

/**
 *
 * @author alumne
 */
public class UF3Ficheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File miCarpetaAbsoluta = new File("/home/alumne/Dropbox/Java/UF3-Ficheros"); //no usaremos la ruta absoluta por comodidad
        File miArchivoRelativo = new File("files/beemovie.jpg");

        System.out.println("Ruta padre relativo: " + miArchivoRelativo.getParent());
        System.out.println("Ruta absoluta: " + miArchivoRelativo.getAbsolutePath());
        System.out.println("Existe? " + miArchivoRelativo.exists());

        //propiedades
        System.out.println("ultima modificacion (sin date): " + miArchivoRelativo.lastModified());
        Date fecha = new Date(miArchivoRelativo.lastModified());
        System.out.println("Ultima modificacion (con date): " + fecha);
        System.out.println("Tamany archivo: " + miArchivoRelativo.length() + " bytes");
        
        listarArchivos(miArchivoRelativo);
        listarArchivos(miCarpetaAbsoluta);
    }

    private static void listarArchivos(File file) {
        File[] lista = file.listFiles();
        if (!file.isDirectory()) {
            System.out.println("No es un directorio.");
            return;
        }

        for (int i = 0; i < lista.length; i++) {
            File f = lista[i];
           if (f.isDirectory()){
               System.out.println("[DIR]"+f.getName());
           }else {
               System.out.println("[ARCH]"+f.getName());
           }
        }
    }
}
