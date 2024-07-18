/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Exceptions.MenuException;
import Persistencia.DAOPelicula;
import Vista.Vista;
import java.util.Scanner;

/**
 *
 * @author alessandro
 */
public class ControladorMenu {

    public Vista vista;
    DAOPelicula modelo;

    public ControladorMenu(DAOPelicula modelo) {
        this.vista = new Vista(this);
        this.modelo = modelo;
        vista.mostrarMenu();
    }

    public void pedirMenu() { //metodo para captar la opcion escojida del menu
        Scanner scan = new Scanner(System.in);
        vista.imprimePantalla("Dime opcion: ");
        try {
            int opcion = scan.nextInt();
            scan.nextLine();
            if (opcion > 6) {
                throw new MenuException("Valor fuera de rango");
            }
            accionesMenu(opcion);
        } catch (MenuException e) {
            System.out.println("Erorr de menu: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void accionesMenu(int opcion) { //metodo que controla las funciones del menu
        switch (opcion) {
            case 1: //case afegir pelicula
                modelo.afegirPelicula();
                break;
            case 2: //case eliminar pelicula
                modelo.eliminarPelicula();
                break;
            case 3: //case modificar pelicula
                modelo.modificarPelicula();
                break;
            case 4: //case listar todas las pelicuas
                modelo.listarPeliculas();
                break;
            case 5: //case listar peliculas por genero
                modelo.listarPeliculasGenero();
                break;
            case 6: //case listar peliculas por edad
                modelo.listarPeliculasEdad();
                break;
            case 0:
                System.exit(0);
        }
    }

}
