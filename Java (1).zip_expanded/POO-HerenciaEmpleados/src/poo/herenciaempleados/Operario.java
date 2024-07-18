/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.herenciaempleados;

/**
 *
 * @author alumne
 */
public class Operario extends Empleado {

    @Override
    public String toString() {
        return "Empleado: " + nombre + " -> Operario";
    }

    public Operario(String nombre) {
        super(nombre);
    }
    
}
