/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf3.exbin2ex1;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumne
 */
public class Uf3Exbin2ex1 {

//Creación de un fichero binario (con el nombre que tu quieras) en el que indiques en cada linea:
//Tu Nombre.
//Tu Edad.
//Tu Ciudad de Nacimiento.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime tu nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Dime tu ciudad de nacimiento: ");
        String ciudad = scan.nextLine();
        String salto = "\n";
        System.out.println("Dime tu edad: ");
        int edad = scan.nextInt();

        String nFichero = "files/file.txt";

        try {
            FileOutputStream fos = new FileOutputStream(nFichero);

            char[] input = nombre.toCharArray();
            for (int i = 0; i < input.length; i++) {
                fos.write(input[i]);
            }
            fos.write(salto.charAt(0));
            input = String.valueOf(edad).toCharArray();
            for (int i = 0; i < input.length; i++) {
                fos.write(input[i]);
            }
            fos.write(salto.charAt(0));
            input = ciudad.toCharArray();
            for (int i = 0; i < input.length; i++) {
                fos.write(input[i]);
            }
            fos.close();
        } catch (Exception ex) {
            System.out.println("Error");
        }

        System.out.println("He leido:");
        leerFichero(nFichero);

        serializarObj();
        leerObjectoSerializado();
    }

    public static void leerFichero(String nFichero) {
        boolean fin = false;
        int byteLeido = 0;
        try {
            FileInputStream fis = new FileInputStream(nFichero);
            while (fin == false) {
                byteLeido = fis.read();
                if (byteLeido == -1) {
                    fin = true;
                } else {
                    System.out.print((char) byteLeido);
                }
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    public static void serializarObj() { //metodo para serializar un objeto 
        Persona p1 = new Persona("Juan", "Barcelona", 33);
        try {
            FileOutputStream fos = new FileOutputStream("files/objeto.bin");
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            //Escribimos el objeto con el writeObject del ObjectOuputStream
            ous.writeObject(p1);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void leerObjectoSerializado() { 
        try {
            FileInputStream fis = new FileInputStream("files/objeto.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            Persona aux = (Persona) ois.readObject();
            System.out.println(aux);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
