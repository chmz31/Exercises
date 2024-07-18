/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.herenciaempleados;

/**
 *
 * @author alumne
 */
public class Empleado {
    protected String nombre;

    public Empleado() {
    }

    public Empleado(String nombre) { //constructor sobrecargado con el nombre
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado: "+ nombre;
    }
    
}
