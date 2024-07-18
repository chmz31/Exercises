/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Objects;

/**
 *
 * @author alessandro
 */
public class Persona{
    private String nombre;
    private int edad;
    private String apellido;

    public Persona() { //constructor vacio
    }

    public Persona(String nombre, int Edad, String apellido) { //constructor sobrecargado con todos los elementos
        this.nombre = nombre;
        this.edad = Edad;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int Edad) {
        this.edad = Edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override //lo que vamos a imprimir cuando llamemos a un objeto persona
    public String toString() {
        return "Persona: " + "Nombre: " + nombre + ", Edad: " + edad + ", Apellido: " + apellido;
    }

    @Override //una persona es igual a otra si tiene el mismo nombre y apellido
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
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.apellido, other.apellido);
    }
    
    
    
}
