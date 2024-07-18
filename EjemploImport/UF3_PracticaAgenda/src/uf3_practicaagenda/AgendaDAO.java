/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf3_practicaagenda;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumne
 */
public class AgendaDAO {

    ArrayList<Contacto> agenda;

    public AgendaDAO() {
        agenda = new ArrayList<>();
    }

    public void agregarContacto() { //añadimos una nueva contacto a la agenda, con todos sus datos que pedimos por teclado
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Dime telefono: ");
        int telefono = scan.nextInt();
        scan.nextLine(); //limpiar buffer
        System.out.println("Dime email: ");
        String email = scan.nextLine();
        System.out.println("Dime fecha nacimieno (dd/mm/yyyy)");
        String fechatexto = scan.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Dime localidad: ");
        String localidad = scan.nextLine();
        System.out.println("Dime codigo postal: ");
        String cp = scan.nextLine();
        try { //Utilizamos try/catch porque al hacer un parse se pueden producir errores
            if (agenda.contains(new Contacto(nombre, telefono, email, sdf.parse(fechatexto), localidad, cp)) == false) {
                agenda.add(new Contacto(nombre, telefono, email, sdf.parse(fechatexto), localidad, cp));
                System.out.println("Contacto añadido correctamente");
            }else {
                System.out.println("Ya existe un contacto con ese telefono, no puedo añadir otro"); //para que no hayan dos personas iguales
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void listarContactos() { //imprimimos todas las personas de la agenda
        for (Contacto contacto : agenda) {
            System.out.println(contacto);
        }
        if (agenda.size() == 0) { // si la agenda esta vacia mostramos el siguiente mensaje
            System.out.println("No hay contactos para mostrar, la agenda esta vacia");
        }
    }

    public void buscarContactos() { //funcion para buscar contactos tanto por nombre como por telefono
        Scanner scan = new Scanner(System.in); //inicializamos el scan para pedir opcion
        boolean existe = false;
        int opcion;
        System.out.println("Escoge: 1) por nombre  2) por telefono");
        opcion = scan.nextInt();
        scan.nextLine(); // limpiar buffer
        switch (opcion) {
            case 1:
                System.out.println("Dime nombre: ");
                String nombre = scan.nextLine();
                for (Contacto p : agenda) {
                    if (p.getNombre().equals(nombre)) { //Si el nombre coincide imprimimos sus datos
                        System.out.println(p);
                        existe = true;
                    }
                }
                break;
            case 2:
                System.out.println("Dime telefono: ");
                int telefono = scan.nextInt();
                scan.nextLine(); //limpiar buffer
                for (Contacto p : agenda) {
                    if (p.getTelefono() == telefono) { //Si el telefono coincide imprimimos sus datos
                        System.out.println(p);
                        existe = true;
                    }
                }
                break;
            default:
                System.out.println("No se ha introducido una opcion valida");
        }
        if (existe == false) {
            System.out.println("No existe ningun contacto que cumpla el criterio");
        }
    }

    public void buscarCumplenHoy() { //funcion para mostrar los contactos que cumplen hoy
        System.out.println("Personas que cumplen hoy: ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM");
        Date hoy = new Date();
        System.out.println(sdf.format(hoy));
        for (Contacto persona : agenda) {
            Date aux = persona.getFecha_nacimiento();
            System.out.println(sdf.format(aux));
            if (sdf.format(aux).equals(sdf.format(hoy))) {
                System.out.println(persona);
            }

        }
    }

    public void guardarDAO() { //funcion para guardar el DAO en un archivo
        try {
            FileOutputStream fos = new FileOutputStream("files/agenda.bin");
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            //Escribimos el objeto con el writeObject del ObjectOuputStream
            ous.writeObject(agenda);
            ous.close();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public void cargarDAO() { //metodo para cargar la agenda desde un archivo guardado
        try {
            FileInputStream fis = new FileInputStream("files/agenda.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            //Guardamos el objeto en un array list auxiliar y cargamos su contenido con un foreach
            ArrayList<Contacto> aux = (ArrayList<Contacto>) ois.readObject();
            for (Contacto p : aux) {
                this.agenda.add(p);
            }
            ois.close();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

}
