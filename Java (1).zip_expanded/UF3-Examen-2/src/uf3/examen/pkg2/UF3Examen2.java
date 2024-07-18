/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf3.examen.pkg2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class UF3Examen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //programa principal
        HospitalDAO dao = new HospitalDAO();
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        dao.cargarHospital();
        do {
            //bucle que repetimos durante la ejecucion del programa
            menu();
            opcion = scan.nextInt();
            scan.nextLine(); // limpiar buffer
            switch (opcion) {
                case 1: 
                    dao.listarHospitales();
                    break;
                case 2:
                    dao.afegirHospitar();
                    break;
                case 3:
                    dao.mostrarDisponibles();
                    break;
                case 4:
                    dao.eliminarHospital();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Se ha introducido una opcion no valida");
            }

        } while (opcion != 0);
    }

    public static void menu() { //menu que mostramos en cada iteracion
        System.out.println("---MENU---");
        System.out.println("1. Listar Hospitales: ");
        System.out.println("2. Agregar Hosptial: ");
        System.out.println("3. Mostrar Disponibles: ");
        System.out.println("4. Eliminar Hospital: ");
        System.out.println("0. Salir");
    }

}
