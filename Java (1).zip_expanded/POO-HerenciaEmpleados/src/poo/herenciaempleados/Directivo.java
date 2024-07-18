/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.herenciaempleados;

/**
 *
 * @author alumne
 */
public class Directivo extends Empleado {

    @Override
    public String toString() {
        return "Empleado: " + nombre + " -> Directivo";
    }

    public Directivo(String nombre) {
        super(nombre);
    }
}
