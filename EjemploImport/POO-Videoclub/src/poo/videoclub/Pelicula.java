/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.videoclub;

import java.util.Objects;

/**
 *
 * @author alumne
 */
public class Pelicula {

    //Variables del objeto
    private int identificador;
    private String nombre;
    private String duracion;
    private String genero;
    private boolean prestada;

    public Pelicula() { //Constructor por defecto
        this.nombre = "Sin Titulo";
    }

    public Pelicula(String nombre) { //constructor sobrecargado con el nombre
        this.nombre = nombre;
    }

    public Pelicula(String nombre, String genero) { //constructor sobrecargado con el nombre y el genero
        this.nombre = nombre;
        this.genero = genero;
        this.prestada = false;
    }

    //Getters & Setters
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isPrestada() {
        return prestada;
    }

    public void setPrestada(boolean prestada) {
        this.prestada = prestada;
    }

    public boolean isWestern() { //metodo que devuelve si una pelicula es de genero western.
        boolean western = false;
        if (this.genero == "Western") {
            western = true;
        }
        return western;
    }

    @Override
    public String toString() {
        return nombre + ", de genero: " + genero;
    }

    @Override
    public boolean equals(Object obj) { //devuelve si dos peliculas tienen el mismo nombre o genero
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pelicula other = (Pelicula) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.genero, other.genero);
    }

    
}
