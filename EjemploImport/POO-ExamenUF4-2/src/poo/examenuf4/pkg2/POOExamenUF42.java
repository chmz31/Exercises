/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.examenuf4.pkg2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class POOExamenUF42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicializamos las variables
        DAOVehicle utils = new DAOVehicle();
        Scanner scan = new Scanner(System.in);
        int opcion;
        System.out.println("Nota: Si se elimina el ultimo vehiculo, el programa no podra funcionar");
        
        do {//bucle del programa
            System.out.println("MENU\n1. Dar de alta un vehiculo\n2. Dar de baja un vehiculo\n3. Buscar vehiculos por marca\n0. Salir");
            opcion = scan.nextInt();
            scan.nextLine(); //limpiar buffer

            switch (opcion) {
                case 1:
                    utils.altaVehicle();
                    break;
                case 2:
                    utils.baixaVehicle();
                    break;
                case 3:
                    utils.buscarMarca();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("No se ha introducido una opcion valida");
            }
        } while (opcion != 0); //caso de finalizacion
    }

}
