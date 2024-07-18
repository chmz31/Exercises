/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf3.examen.pkg2;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author alumne
 */
public class Hospital implements Serializable {

    //variables del objeto
    private String nom;
    private int numLlits;
    private boolean complet;

    public Hospital(String nom, int numLlits, boolean complet) { //costructor sobrecargado con todas las variables
        this.nom = nom;
        this.numLlits = numLlits;
        this.complet = complet;
    }
    //getters que utilizamos
    public boolean isComplet() {
        return complet;
    }

    public String getNom() {
        return nom;
    }

    //dos hospitales son iguales si tienen el mismo nombre
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
        final Hospital other = (Hospital) obj;
        return Objects.equals(this.nom, other.nom);
    }

    //formato en el que queremos que aparezcan los objetos cuando los mostramos
    @Override
    public String toString() {
        return "Hospital: " + nom + ", Numero de camas: " + numLlits + ", Complet? " + complet;
    }

}
