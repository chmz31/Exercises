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
public class Pelicula {

    private String titulo; //ha de ser unico
    private int duracion;
    private String pais;
    private String Genero;
    private int edad;
    private double valoracion; //entre 0 y 5
    private String sinopsis;

    public Pelicula(String titulo, int duracion, String pais, String Genero, int edad, double valoracion, String sinopsis) { //constructor sobrecargado con todos los atributos
        this.titulo = titulo;
        this.duracion = duracion;
        this.pais = pais;
        this.Genero = Genero;
        this.edad = edad;
        this.valoracion = valoracion;
        this.sinopsis = sinopsis;
    }

    //setters & getters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    @Override
    public boolean equals(Object obj) { //no podemos tener dos peliculas con el mismo titulo
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
        return Objects.equals(this.titulo, other.titulo);
    }

    @Override
    public String toString() {
        return "Pelicula:\n" + "titulo: " + titulo + "\nduracion: " + duracion + "\npais: " + pais + "\nGenero: " + Genero + "\nedad: " + edad + "\nvaloracion: " + valoracion + "\nsinopsis: " + sinopsis+"\n";
    }

}
