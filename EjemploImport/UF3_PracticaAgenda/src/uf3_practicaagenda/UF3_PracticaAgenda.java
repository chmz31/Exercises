/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf3_practicaagenda;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class UF3_PracticaAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicialzamos las variables
        FileWriter fw = null;
        PrintWriter pw = null;
        int numContactos = 0;
        AgendaDAO agenda = new AgendaDAO();
        //cargamos la agenda guardada automaticamente al abrir
        agenda.cargarDAO();
        Scanner scan = new Scanner(System.in);
        int opcion;
        //aqui empieza el bucle
        do {
            System.out.println("--Agenda--\n1) Agregar contacto\n2) Listar contactos\n3) Buscar contactos\n4) Buscar personas que cumplen hoy\n5) Borrar agenda\n0) Salir");
            opcion = scan.nextInt();
            scan.nextLine(); //limpiar buffer
            switch (opcion) {
                case 1:
                    agenda.agregarContacto();
                    break;
                case 2:
                    agenda.listarContactos();
                    break;
                case 3:
                    agenda.buscarContactos();
                    break;
                case 4:
                    agenda.buscarCumplenHoy();
                    break;
                case 5:
                    System.out.println("Borrando agenda");
                    agenda.agenda.clear();
                    System.out.println("Se ha borrado la agenda correctamente");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("No se ha introducido una opcion valida");
            }
        } while (opcion != 0);
        //guardamos el archivo automaticamente al salir
        agenda.guardarDAO();

        try { //guardamos el numero de contactos al salir

            fw = new FileWriter("files/resumen.txt"); //con fw por defecto si ya tenemos un archivo se sobrescribe
            pw = new PrintWriter(fw);
            //escribimos
            pw.println("Hay " + agenda.agenda.size() + " Contactos en la agenda");

            fw.close();
            //al acabar cerramos el fichero

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

}
