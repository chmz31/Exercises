/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author alumne
 */
public class SortList {

    public static void main(String[] args) {
        List<Persona> alPersona = new ArrayList<>();
        System.out.println("Ejecutando sort");
        alPersona.add(new Persona(18, "Pedro"));
        alPersona.add(new Persona(23, "Rogelio"));
        alPersona.add(new Persona(11, "Juanote"));
        alPersona.add(new Persona(19, "Maria"));

        System.out.println("Imprimo array");
        for (Persona p : alPersona) {
            System.out.println(p);
        }
        System.out.println("\nOrdenamos por edad");
        Collections.sort(alPersona, new SortByEdad());
        System.out.println("Imprimo array ordenado");
        for (Persona p : alPersona) {
            System.out.println(p);
        }
        System.out.println("\nOrdenamos por nombre");
        Collections.sort(alPersona, new SortByNombre());
        System.out.println("Imprimo array ordenado");
        for (Persona p : alPersona) {
            System.out.println(p);
        }

    }
}
