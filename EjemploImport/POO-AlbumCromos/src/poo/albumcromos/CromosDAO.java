/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.albumcromos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class CromosDAO {

    ArrayList<Cromo> album;

    public CromosDAO() {
        album = new ArrayList<>();
    }

    public void insertarCromo(int num) { //funcion que añade un cromo a tu coleccion y crea un nuveo objeto si es el primero de ese tipo
        Scanner scan = new Scanner(System.in);
        boolean contiene = false;
        if (album.size() > 0) {

            for (int i = 0; i < album.size(); i++) {

                if (album.contains(new Cromo(num))) {
                    contiene = true;
                } else if (album.contains(new Cromo(num)) == false) {
                    contiene = false;
                }
            }

            if (contiene == true) {
                System.out.println("Ese cromo ya esta en tu coleccion, duplicado\n");
                añadirCromo(num);

            } else if (contiene == false) {
                album.add(new Cromo(num));
                int pos = album.indexOf(new Cromo(num));
                System.out.println("Dime nombre del futbolista: ");
                album.get(pos).setNombre(scan.nextLine());
                System.out.println("Dime el equipo donde juega: ");
                album.get(pos).setEquipo(scan.nextLine());
                System.out.println("Se ha dado de alta el cromo" + album.get(pos));
            }
        } else {
            album.add(new Cromo(num));
            int pos = album.indexOf(new Cromo(num));
            System.out.println("Dime nombre del futbolista: ");
            album.get(pos).setNombre(scan.nextLine());
            System.out.println("Dime el equipo donde juega: ");
            album.get(pos).setEquipo(scan.nextLine());
            System.out.println("Se ha dado de alta el cromo" + album.get(pos));
        }
    }

    public void añadirCromo(int num) {
        for (int i = 0; i < album.size(); i++) {
            if (album.get(i).getNum() == num) {
                album.get(i).setCantidad(album.get(i).getCantidad() + 1);
            }
        }
    }

    public void listarCromos(int modo) {
        Scanner scan = new Scanner(System.in);
        switch (modo) {
            case 1: // listar repetidos
                for (int i = 0; i < album.size(); i++) {
                    if (album.get(i).getCantidad() > 1) {
                        System.out.println(album.get(i));
                    }
                }
                break;
            case 2: //muestra todo el ArrayList
                for (Cromo c : album) {
                    System.out.println(c);
                }
                break;
            case 3: //mostrar los que faltan
                ArrayList<Cromo> restantes = new ArrayList<Cromo>();
                for (int i = 1; i <= 100; i++) {
                    restantes.add(new Cromo(i));
                }
                
                for (int i = 0; i < album.size(); i++) {
                    Cromo existente = album.get(i);
                    restantes.remove(existente);
                }
                
                for (Cromo c : restantes) {
                    System.out.println(c);
                }
                break;
            case 4: //listar por equipos
                System.out.println("Dime el equipo: ");
                String equipo_objetivo = scan.nextLine();
                
                for (int i = 0; i < album.size(); i++) {
                    if (album.get(i).getEquipo().toLowerCase().equals(equipo_objetivo.toLowerCase())){
                        System.out.println(album.get(i));
                    }
                }
                break;
        }
    }

    public void eliminarCromo(int num) { //reduce o elimina el cromo que le pasemos (comparando el num)
        for (int i = 0; i < album.size(); i++) {
            Cromo objetivo = album.get(i);

            if (objetivo.getNum() == num) {
                if (objetivo.getCantidad() > 1) {
                    objetivo.setCantidad(album.get(i).getCantidad() - 1);
                    System.out.println("Se ha reducido la cantidad del cromo " + objetivo);
                } else if (objetivo.getCantidad() == 1) {
                    album.remove(i);
                    System.out.println("Se ha eliminado el cromo " + objetivo);
                }
            }
        }

    }
}
