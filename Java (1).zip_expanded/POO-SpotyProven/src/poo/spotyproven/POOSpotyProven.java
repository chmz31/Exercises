/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.spotyproven;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class POOSpotyProven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CancionDAO utils = new CancionDAO();
        Scanner scan = new Scanner(System.in);
        int opcion;

        do {
            menu();
            System.out.print("Dime que deseas hacer?\n");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    utils.insertarCancion();
                    break;
                case 2:
                    utils.borrarCancion();
                    break;
                case 3:
                    utils.listarCanciones();
                    break;
                case 4:
                    System.out.print("Dime album: ");
                    scan.nextLine(); //limpiar buffer
                    String album = scan.nextLine();
                    utils.listarCancionesAlbum(album);
                    break;
                case 5:
                    ArrayList<Cancion> lista = utils.generarListaAleatoria(); //No podemos ejecutar este metodo si tenemos menos de 3 canciones.
                    for (Cancion c : lista) {
                        System.out.println(c);
                    }
                    break;
            }
        } while (opcion != 6);
    }

    public static void menu() {
        System.out.println("SPOTYPROVEN\n1.Insertar cancion\n2.Borra cancion");
        System.out.println("3.Listar canciones\n4.Listar canciones de album\n5.Generar lista de reproduccion dinamica");
        System.out.println("6. Salir");
    }
}
