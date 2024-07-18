/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf3.ejemploserializargaraje;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author alumne
 */
public class Coche implements Serializable {

    private String marca;
    private String matricula;
    private int nPuertas;

    public Coche(String marca, String matricula, int nPuertas) {
        this.marca = marca;
        this.matricula = matricula;
        this.nPuertas = nPuertas;
    }

    //getters & setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    public void setnPuertas(int nPuertas) {
        this.nPuertas = nPuertas;
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
        final Coche other = (Coche) obj;
        return Objects.equals(this.matricula, other.matricula);
    }

    @Override
    public String toString() {
        return "Coche: " + "marca: " + marca + ", matricula: " + matricula + ", nPuertas: " + nPuertas;
    }

}
