/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf3.examen.pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumne
 */
public class UF3Examen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicialziamos variables
        String nFichero = "files/material.txt";
        File material = new File(nFichero);
        Scanner scan = new Scanner(System.in);
        //empezamos el bucle del menu
        int opcion = 0;
        do {
            menu();
            opcion = scan.nextInt();
            scan.nextLine(); // limpiar buffer
            switch (opcion) {
                case 1:
                    mostrarMaterial(material);
                    break;
                case 2:
                    System.out.println("Dime el nombre del producto que buscas");
                    buscarProducto(material, scan.nextLine());
                    break;
                case 3:
                    nuevaComanda();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Se ha introducido una opcion no valida");
            }

        } while (opcion != 0);
    }

    public static void menu() { //menu que imprimimos cada vez
        System.out.println("---MENU---");
        System.out.println("1. Mostrar materiales");
        System.out.println("2. Buscar productos");
        System.out.println("3. Realizar nueva comanda");
        System.out.println("0. Salir");
        System.out.println("Dime opcion: ");
    }

    public static void mostrarMaterial(File material) {//metodo para listar todo el material
        int cantidadProductos = 0;
        try {
            Scanner scan = new Scanner(material); //intentamos leer el fichero
            System.out.println("Lista material: ");
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
                cantidadProductos++; //sumamos cada vez que cuente una linea
            }
            System.out.println("Hay " + cantidadProductos / 2 + " Productos en la lista"); //dividimos entre 2 ya que despues de cada producto hay otra linea con su cantidad
        } catch (FileNotFoundException ex) {
            System.out.println("No he podido acceder al fichero, no existe o esta mal formateado");
        }
    }

    public static void buscarProducto(File material, String producto) { //metodo para buscar si tenemos un producto en la lista
        try {
            boolean encontrado = false;
            Scanner leerFichero = new Scanner(material);
            while (leerFichero.hasNextLine()) {
                String aux = leerFichero.nextLine();
                if (aux.toLowerCase().equals(producto.toLowerCase())) {//en caso de encontrar el producto
                    System.out.println("Hay stock para este producto");
                    encontrado = true;
                }
            }
            if (encontrado == false) { //en caso de no encontrar el producto
                System.out.println("No hay stock para este producto");
            }
        } catch (FileNotFoundException ex) { //expecion de archivo no encontrado
            System.out.println("No he podido acceder al fichero, no existe o esta mal formateado");
        }

    }

    public static void nuevaComanda() { //metodo para crear una nueva comanda que se guardara en un archivo
        FileWriter fw = null;
        PrintWriter pw = null;
        Scanner scan = new Scanner(System.in); // scan para pedir datos
        System.out.println("Que producto quieres adquirir? ");
        String producto = scan.nextLine();
        System.out.println("Cuanta cantidad del producto quieres pedir? ");
        String cantidad = String.valueOf(scan.nextInt()); //pedimos int para que no puedan colarse chars pero lo pasamos a string para facil manejo

        try {
            fw = new FileWriter("files/comanda.txt");
            pw = new PrintWriter(fw);
            pw.println("Comanda Material Coronavirus\n\nL’Hospital de Bellvitge solicita adquirir el següent material:");
            pw.println("Producto: " + producto);
            pw.println("Cantidad: " + cantidad + "\n");
            pw.println("L’Hospitalet del Llobregat, Abril 2022");
            pw.close(); //cerramos ficheros al acabar
            fw.close();

        } catch (Exception ex) { //en caso de error mostrar mensaje
            System.out.println("Error: " + ex.getMessage());
        }

    }

}
