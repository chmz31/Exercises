/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf5.ex2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumne
 */
public class Gato {

    private String nombre;
    private int edad;
    private String color;

    public Gato(String nombre, int edad) {
        try {
            //constructor sobrecargado
            setNombre(nombre);
            setEdad(edad);
            this.color = "negro";
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws minimoCaracteresException {
        if (nombre.length() < 3) {
            throw new minimoCaracteresException("El nombre no puede ser de menos de 3 caracteres");
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws edadMinimaException {
        if (edad <= 0) {
            throw new edadMinimaException("La edad no puede ser menor o igual a 0");
        }
        this.edad = edad;
    }

    @Override
    public String toString() { //imprimir
        return "[Gato] " + "Nombre: " + nombre + ", Edad: " + edad + ", Color: " + color;
    }

}
