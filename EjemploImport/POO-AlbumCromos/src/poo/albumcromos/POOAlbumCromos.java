/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.albumcromos;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class POOAlbumCromos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean salir = false;
        int opcion;
        Scanner scan = new Scanner(System.in);
        CromosDAO utils = new CromosDAO();
        while (salir == false) {
            menu();
            opcion = scan.nextInt();
            switch (opcion) {
                case 0: //Salir
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
                case 1:
                    System.out.println("Dime numero del cromo ");
                    utils.insertarCromo(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Eliminar cromo");
                    utils.eliminarCromo(scan.nextInt());
                    break;
                case 3:
                    System.out.println("Lista de cromos");
                    System.out.println("Modo de listado: \n1. Mostrar repetidos  2. Mostrar todos  3. Mostrar Restantes  4. Mostrar equipo");
                    int modo = scan.nextInt();
                    switch (modo) {
                        case 1: //muestra los repetidos
                            utils.listarCromos(modo);
                            break;
                        case 2: //mostrar todos los cromos
                            utils.listarCromos(modo);
                            break;
                        case 3: //muestra los restantes
                            utils.listarCromos(modo);
                            break;
                        case 4: //Muestra por equipo especifico
                            utils.listarCromos(modo);
                            break;
                    }
                    break;
            }
        }

    }

    public static void menu() {
        System.out.println("0. Salir  1. Insertar Cromo  2.Elimnar Cromo  3. Listar Cromos");
    }

}
