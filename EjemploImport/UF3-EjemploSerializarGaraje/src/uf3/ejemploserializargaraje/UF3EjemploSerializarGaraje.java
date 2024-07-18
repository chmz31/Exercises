/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf3.ejemploserializargaraje;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class UF3EjemploSerializarGaraje {

    static garajeDAO garaje = new garajeDAO();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("1. Guardar Garaje en fichero \n2. Leer fichero de Garaje\n3. Add coche\n4. Mostrar Garaje\n0. Salir");
            System.out.print("Opcion: ");
            opcion = scan.nextInt();
            scan.nextLine(); //limpiar buffer
            switch (opcion) {
                case 1: // guardar fichero
                    garaje.guardarFichero();
                    break;
                case 2:// Leer fichero
                    garaje.leerFichero();
                    break;
                case 3: //add coche
                    garaje.addCoche();
                    break;
                case 4: //listar
                    garaje.listarGaraje();
                    break;
                case 0:
                    System.out.println("Saliendo...");
            }
        } while (opcion != 0);
    }
}
