/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf3.examen.pkg2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class HospitalDAO {

    ArrayList<Hospital> llista;

    public HospitalDAO() {
        llista = new ArrayList<>(); //inicializamos un array list junto al objeto
    }

    public void listarHospitales() { //imprimimos todas las personas de la agenda
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("files/sanitat.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            //Guardamos el objeto en un array list auxiliar y cargamos su contenido con un foreach
            llista = (ArrayList<Hospital>) ois.readObject();
            ArrayList<Hospital> aux = llista;
            for (Hospital h : aux) {
                System.out.println(h);
            }
            //cerramos los ficheros para ahorrar memoria cuando no los utilizemos
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No he podido acceder al fichero, no existe o esta mal formateado");
        } catch (IOException ex) {
            System.out.println("Error de lectura/escritura");
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    public void afegirHospitar() { // este metodo agrega un hospital con los datos que le demos y lo guarda en el fichero
        // pedimos datos
        Scanner scan = new Scanner(System.in);
        System.out.println("DATOS NUEVO HOSPITAL:");
        System.out.println("Dime nombre del hospital: ");
        String nombre = scan.nextLine();
        System.out.println("Esta completo? (true/false) "); //pedimos boolean solo aceptara true o false como datos validos
        boolean completo = scan.nextBoolean();
        System.out.println("Dime numero de camas: ");
        int numCamas = scan.nextInt();
        scan.nextLine();//limpiar buffer
        //creamos un objeto auxiliar para comparar a los ya existentes y agregarlo si hace falta
        Hospital aux = new Hospital(nombre, numCamas, completo);
        if (llista.contains(aux) == false) { //si no existe un hospital igual, lo agregamos
            llista.add(aux);
            guardarHospital(llista);
            //si hemos agregado uno nuevo, guardamos
        } else {
            System.out.println("Ya existe un hospital con ese nombre");
        }

    }

    public void mostrarDisponibles() { //listamos solo los disponibles (no completos)
        ArrayList<Hospital> aux = llista; //arraylist auxiliar para evitar ConcurrentModificationException
        System.out.println("Hospitales disponibles: ");
        for (Hospital h : aux) {
            if (h.isComplet() != true) {
                System.out.println(h);
            }
        }
    }

    public void eliminarHospital() { //metodo para eliminar un hospital de la lista
        boolean existe = false;
        ArrayList<Hospital> aux = llista;
        Scanner scan = new Scanner(System.in);
        //pedimos nombre del hospital
        System.out.println("Dime nombre hosptial a borrar: ");
        String nom = scan.nextLine();
        for (int i = 0; i < llista.size(); i++) {
            Hospital h = llista.get(i);
            if (h.getNom().equals(nom)) {
                existe = true;
                System.out.println("Voy a eliminar el hospital: " + h);
                aux.remove(h);
                System.out.println("Se ha eliminado el hospital");
            }
        }
        if (existe == false) {
            System.out.println("No existe ningun hospital con ese nombre");
        }
        //guardamos el nuevo objeto sin el hospital que acabamos de borrar

        guardarHospital(aux);
    }

    public void guardarHospital(ArrayList<Hospital> guardar) {
        //guardamos el archivo
        try {
            FileOutputStream fos = new FileOutputStream("files/sanitat.dat");
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            //Gurdamos el objeto a nuestro fichero con el writeObject del ObjectOuputStream
            ous.writeObject(guardar);
            ous.close();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void cargarHospital() {
        try {
            FileInputStream fis = new FileInputStream("files/sanitat.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            //Guardamos el objeto en el array list 
            llista = (ArrayList<Hospital>) ois.readObject();
            //cerramos los ficheros para ahorrar memoria cuando no los utilizemos
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No he podido acceder al fichero, no existe o esta mal formateado");
        } catch (Exception ex) {
            System.out.println("Erorr: " + ex);

        }
    }
}
