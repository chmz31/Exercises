/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf3.ejemploserializargaraje;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.*;
import static uf3.ejemploserializargaraje.UF3EjemploSerializarGaraje.garaje;

/**
 *
 * @author alumne
 */
public class garajeDAO {

    ArrayList<Coche> garaje;

    public garajeDAO() {
        garaje = new ArrayList<>();
    }

    public void listarGaraje() {
        for (Coche c : garaje) {
            System.out.println(c);
        }
    }

    public void addCoche() {
        //add coche
        Scanner scan = new Scanner(System.in);

        System.out.println("Dime marca: ");
        String marca = scan.nextLine();
        System.out.println("Dime matricula: ");
        String matricula = scan.nextLine();
        System.out.println("Dime n Puertas: ");
        int puertas = scan.nextInt();
        Coche aux = new Coche(marca, matricula, puertas);
        if (garaje.contains(aux) == false) {
            garaje.add(aux);
        } else {
            System.out.println("Ya hay un coche con esa matricula");
        }
    }

    public void leerFichero() { 
        try {
            FileInputStream fis = new FileInputStream("files/garaje.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            //Guardamos el objeto en un array list auxiliar
            ArrayList<Coche> aux = (ArrayList<Coche>) ois.readObject();
            for (Coche c : aux) {
                System.out.println(c);
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void guardarFichero() {
        try {
            FileOutputStream fos = new FileOutputStream("files/garaje.bin");
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            //Escribimos el objeto con el writeObject del ObjectOuputStream
            ous.writeObject(garaje);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}
