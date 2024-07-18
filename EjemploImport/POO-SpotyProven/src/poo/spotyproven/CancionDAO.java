/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.spotyproven;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class CancionDAO {

    ArrayList<Cancion> canciones;

    public CancionDAO() {
        canciones = new ArrayList<>();
    }

    public void insertarCancion() { //Añade una cancion al ArrayList de canciones.
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime titulo de la cancion: ");
        String tit = scan.nextLine();
        System.out.println("Dime Autor de la cancion: ");
        String aut = scan.nextLine();
        System.out.println("Dime su duracion en segundos: ");
        double dur = scan.nextDouble();
        scan.nextLine(); // limpiar buffer
        System.out.println("Dime su album: ");
        String album = scan.nextLine();
        if (canciones.contains(new Cancion(tit, aut, album, dur)) == false){
        canciones.add(new Cancion(tit, aut, album, dur));
        }

    }

    public void listarCanciones() { //lista todas las canciones de el ArrayList
        for (Cancion c : canciones) {
            System.out.println(c);
        }
    }

    public void borrarCancion() { //borra canciones con un titulo y un autor.
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime el titulo de la cancion para borrar");
        String tit = scan.nextLine();
        System.out.println("Dime el Autor de la cacion: ");
        String aut = scan.nextLine();
        for (int i = 0; i < canciones.size(); i++) {
            Cancion c = canciones.get(i);
            if (c.getNom().toLowerCase().equals(tit.toLowerCase()) && c.getAutor().toLowerCase().equals(aut.toLowerCase())) {
                System.out.println("Cancion " + c + " ha sido eliminada");
                canciones.remove(c);
            } else {
                System.out.println("No he encontrado tu cancion");
            }
        }
    }

    public void listarCancionesAlbum(String album) { //Lista canciones de un album que le pasemos por teclado
        for (int i = 0; i < canciones.size(); i++) {
            if (canciones.get(i).getNomAlbum().toLowerCase().equals(album.toLowerCase())) {
                System.out.println(canciones.get(i));
            }
        }
    }

    public ArrayList generarListaAleatoria() { //Genera una lista de reproduccion con 3 canciones, necesitamos minimo 3 canciones diferentes;
        ArrayList<Cancion> playlist = new ArrayList<>();
        System.out.println("Tu lista de reproduccion: ");
        Random r = new Random();
        for (int i = 0; i < 3;) {
            int random = r.nextInt(canciones.size());
            if (playlist.contains(canciones.get(random)) == false) {
                playlist.add(canciones.get(random));
                i++;
            }
        }
        return playlist;
    }
}
