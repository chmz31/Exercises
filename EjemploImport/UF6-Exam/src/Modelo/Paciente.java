/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alessandro
 */
public class Paciente {

    private int idPaciente;
    private String nom;
    private String cognom;
    private int edat;
    private String idDoctor;

    public Paciente(int idPaciente, String nom, String cognom, int edat, String idDoctor) { //Constructor sobrecargado con todos los atributos
        this.idPaciente = idPaciente;
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
        this.idDoctor = idDoctor;
    }

    //Getters & Setters
    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(String idDoctor) {
        this.idDoctor = idDoctor;
    }

    @Override
    public String toString() { //metodo que nos devuelve el String que mostramos al llamar a un objeto de clase 
        return "Paciente [ " + "idPaciente=" + idPaciente + ", nom=" + nom + ", cognom=" + cognom + ", edat=" + edat + ", idDoctor=" + idDoctor + " ]";
    }

    @Override
    public boolean equals(Object obj) { //un paciente es igual a otro si tienen el mismo id
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paciente other = (Paciente) obj;
        return this.idPaciente == other.idPaciente;
    }

}
