/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.ControladorMenu;
import Modelo.Pelicula;

/**
 *
 * @author alessandro
 */
public class Vista {

    ControladorMenu controlador;

    public Vista(ControladorMenu controlador) {
        this.controlador = controlador;
    }

    public static void imprimePantalla(String texto) {
        System.out.print(texto);
    }

    public static void imprimePelicula(Pelicula p) {
        System.out.println(p);
    }

    public void menu() {
        System.out.println("0. Salir");
        System.out.println("1. Afegir pelicula ");
        System.out.println("2. Eliminar pelicula ");
        System.out.println("3. Modificar pelicula ");
        System.out.println("4. Listar todas las peliculas ");
        System.out.println("5. Listar peliculas por genero ");
        System.out.println("6. Listar peliculas por edad ");
    }

    public void mostrarMenu() {
        do {
            menu();
            controlador.pedirMenu();
        } while (true);
    }

}
