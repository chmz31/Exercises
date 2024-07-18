/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.centreanimals;

import java.util.Objects;

/**
 *
 * @author alumne
 */
public class Animal {
    public String nom;
    public int exemplars;

    public Animal(String nom) {
        this.nom = nom;
        this.exemplars = 1;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getExemplars() {
        return exemplars;
    }

    public void afegirExemplars() {
        this.exemplars += 1;
    }
    
     public void reduirExemplars() {
        this.exemplars -= 1;
    }

    //miramos que dos ejemplares tengan el mismo nombre para comprobar si son iguales
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
        final Animal other = (Animal) obj;
        return Objects.equals(this.nom, other.nom);
    }

    @Override
    public String toString() {
        return "Animal: "+nom+" exemplars: " + exemplars;
    }
    
}
