/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.spotyproven;

import java.util.Objects;

/**
 *
 * @author alumne
 */
public class Cancion {
    private String titulo_Cancion;
    private String autor;
    private String album;
    private double durada_segons;

    public Cancion(String nom, String autor) {
        this.titulo_Cancion = nom;
        this.autor = autor;
    }

    public Cancion(String nom, String autor, String nomAlbum, double durada) {
        this.titulo_Cancion = nom;
        this.autor = autor;
        this.album = nomAlbum;
        this.durada_segons = durada;
    }

    //getters & setters
    public String getNom() {
        return titulo_Cancion;
    }

    public String getAutor() {
        return autor;
    }

    public String getNomAlbum() {
        return album;
    }

    public double getDurada() {
        return durada_segons;
    }

    //Solo podemos modificar estos valores
    public void setNomAlbum(String nomAlbum) {
        this.album = nomAlbum;
    }

    public void setDurada(double durada) {
        this.durada_segons = durada;
    }

    //dos canciones son iguales si tienen el mismo titulo y autor           
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
        final Cancion other = (Cancion) obj;
        if (!Objects.equals(this.titulo_Cancion.toLowerCase(), other.titulo_Cancion.toLowerCase())) {
            return false;
        }
        return Objects.equals(this.autor, other.autor);
    }

    @Override
    public String toString() {
        return "titulo_Cancion: " + titulo_Cancion + ", autor: " + autor + ", album: " + album + ", durada en segons: " + durada_segons;
    }
    
    
    
    
}
