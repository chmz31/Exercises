/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.uf4pr1;

/**
 *
 * @author alumne
 */
public class Aparellelectric {

    private int identificador;
    private String nom_aparell;
    private double consum_electric;
    private double potencia;
    private String estat;

    public Aparellelectric(int identificador, String nom_aparell, double potencia) { //constructor sobrecargado con identificador nombre y potencia
        this.identificador = identificador;
        this.nom_aparell = nom_aparell;
        if (potencia < 1000 && potencia > 0) {
            this.potencia = potencia;
        } else if (potencia > 1000 || potencia < 0) {
            this.potencia = 20;
        }
        this.estat = "apagat";
        this.consum_electric = 0.0;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNom_aparell() {
        return nom_aparell;
    }

    public void setNom_aparell(String nom_aparell) {
        this.nom_aparell = nom_aparell;
    }

    public double getConsum_electric() {
        return consum_electric;
    }

    public void setConsum_electric(double consum_electric) {
        this.consum_electric = consum_electric;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
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
        final Aparellelectric other = (Aparellelectric) obj;
        return this.identificador == other.identificador;
    }

    @Override
    public String toString() {
        return "Aparato con identificador: " + identificador + ", nombre del aparato: " + nom_aparell + ", de consumo: " + consum_electric + ", de potencia: " + potencia + ", con estado: " + estat;
    }

}
