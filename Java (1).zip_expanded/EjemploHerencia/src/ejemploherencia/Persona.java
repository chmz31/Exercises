/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploherencia;

/**
 *
 * @author alumne
 */
public class Persona {
    public String nombre;

    public Persona() {
        this.nombre = "pepito";
    }

    public Persona(String nombre) {
        this.nombre = nombre+" Jose";
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + '}';
    }
}
