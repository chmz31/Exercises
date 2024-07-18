/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.herenciaempleados;

/**
 *
 * @author alumne
 */
public class Oficial extends Operario {

    @Override
    public String toString() {
        return "Empleado: " + nombre + " -> Oficial";
    }

    public Oficial(String nombre) {
        super(nombre);
    }
}
