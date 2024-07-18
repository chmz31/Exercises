/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.personaprofesor;

import java.util.Objects;

/**
 *
 * @author alumne
 */
public class Persona {
    protected String nombre;
    protected int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) { //constructor sobrecargado
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void printarDatos(){
        System.out.println("Hola Persona");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
}
