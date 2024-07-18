/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alessandro
 */
public class Doctor {

    private String idDoctor;
    private String nom;
    private String especialitat;

    public Doctor(String idDoctor, String nom, String especialitat) { //constructor sobrecargado con todos los atributos
        this.idDoctor = idDoctor;
        this.nom = nom;
        this.especialitat = especialitat;
    }

    //Getters & Setters
    public String getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(String idDoctor) {
        this.idDoctor = idDoctor;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEspecialitat() {
        return especialitat;
    }

    public void setEspecialitat(String especialitat) {
        this.especialitat = especialitat;
    }

    @Override
    public String toString() { //metodo que nos devuelve el String que mostramos al llamar a un objeto de clase Doctor
        return "Doctor[ " + "idDoctor=" + idDoctor + ", nom=" + nom + ", especialitat=" + especialitat + " ]";
    }

}
