/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf5.ex7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class GatoDAO {

    int nGatos;
    ArrayList<Gato> gatera;

    public GatoDAO() {
        gatera = new ArrayList<>();
        this.nGatos = 0;
    }

    public void addGato() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Dime edad: ");
        int edad = scan.nextInt();
        scan.nextLine();
        try {
            Gato g = new Gato(nombre, edad);

            if (g.getEdad() == 0 || g.getNombre() == null) {
                System.out.println("No se ha añadido el gato correctamente");
            } else {
                //si el gato es correcto se ejecutara
                gatera.add(g);
                imprimeGato(g);
                this.nGatos += 1;
            }

        } catch (Exception ex) {
            System.out.println("Error al añadir el gato");
        }

    }

    public void imprimeGato(Gato g) {
        System.out.println(g);
    }
}
