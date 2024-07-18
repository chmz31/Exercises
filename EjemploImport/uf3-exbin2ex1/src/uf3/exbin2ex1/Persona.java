/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf3.exbin2ex1;

import java.io.Serializable;

/**
 *
 * @author alumne
 */
public class Persona implements Serializable {
    protected String nombre;
    protected String ciudad;
    protected int edad;

    public Persona(String nombre, String ciudad, int edad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.edad = edad;
    }
    
    
}
