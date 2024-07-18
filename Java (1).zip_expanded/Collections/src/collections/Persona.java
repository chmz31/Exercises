/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collections;

import java.util.Comparator;

/**
 *
 * @author alumne
 */
public class Persona {

    int edad;
    String nombre;

    //constructores
    public Persona(int id, String nombre) {
        this.edad = id;
        this.nombre = nombre;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return "edad: " + edad + ", nombre: " + nombre;
    }

}

class SortByEdad implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.edad - p2.edad;
    }

}

class SortByNombre implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.nombre.compareToIgnoreCase(p2.nombre);
    }
}
