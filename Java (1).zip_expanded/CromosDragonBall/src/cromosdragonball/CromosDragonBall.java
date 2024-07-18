/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cromosdragonball;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author alessandro
 */
public class CromosDragonBall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //incializamos los albums, en este caso los haremos de 100
        AlbumDAO album = new AlbumDAO(100);
        RepetidosDAO repetidos = new RepetidosDAO(100);
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        do {
            try {
                menu();
                opcion = scan.nextInt();
                scan.nextLine(); // limpiar  buffer
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
            switch (opcion) {
                case 1:
                    try {
                    Cromo c1 = crearCromo();
                    if (album.contieneCromo(c1) == false) { //si album no contiene el cromo lo agregamos
                        album.addCromo(c1);
                    } else if (repetidos.contieneComo(c1.getNumero()) == false) { //si album ya contiene el cromo lo agregamos a repetidos
                        repetidos.addCromo(c1);
                    } else {
                        System.out.println("Ya tenias ese cromo repetido");
                    }
                } catch (Exception ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
                break;
                case 2:
                    try {
                    System.out.println("Dime numero del cromo: ");
                    int numero = scan.nextInt();
                    if (repetidos.contieneComo(numero)) { //si el cromo esta en la lista de repetidos lo borramos
                        repetidos.eliminarCromo(numero);
                    } else if (album.contieneCromo(numero)) { //si no lo eliminamos del album principal
                        album.eliminarCromo(numero);
                    } else {
                        System.out.println("No puedo eliminar el cromo, no se ecuentra en ningun album");
                    }
                } catch (Exception ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
                break;
                case 3:
                    try {
                    System.out.println("Dime numero del cromo que has cambiado: ");
                    int numero_mod = scan.nextInt();
                    scan.nextLine(); //limpiar buffer
                    System.out.println("Dime datos del nuevo cromo: ");
                    Cromo nuevo = crearCromo();
                    if (repetidos.contieneComo(numero_mod) && album.contieneCromo(nuevo) == false) { //solo procedera con el cambio si tenemos el cromo a cambiar repetido y no tenemos el cromo nuevo en el album
                        repetidos.eliminarCromo(numero_mod);
                        album.addCromo(nuevo);
                    } else if (album.contieneCromo(nuevo) == true) { //si no esta ni en repetidos ni en album no lo tenemos
                        System.out.println("No puedo proceder con el cambio, ya tienes el cromo a cambiar");
                    } else {
                        System.out.println("No se ha podido efectuar el cambio");
                    }
                } catch (Exception ex) {
                    System.out.println("Error: " + ex.getMessage());
                }
                break;
                case 4:
                    System.out.println("Cromos en el album: ");
                    album.listarCromos();
                    break;
                case 5:
                    System.out.println("Cromos repetidos: ");
                    repetidos.listarCromos();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("No se ha introducido una opcion valida");
                    break;
            }
        } while (opcion != 0);
    }

    public static void menu() {
        System.out.println("Cromos Dragon Ball: ");
        System.out.println("1. Agregar cromo");
        System.out.println("2. Eliminar cromo");
        System.out.println("3. Cambiar cromo");
        System.out.println("4. Listar cromos");
        System.out.println("5. Listar cromos repetidos");
        System.out.println("0. Salir");
    }

    public static Cromo crearCromo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime numero: ");
        int numero = scan.nextInt();
        scan.nextLine(); //limpiar buffer
        System.out.println("Dime descripcion: ");
        String descripcion = scan.nextLine();
        return (new Cromo(descripcion, numero));
    }
}
