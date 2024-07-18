/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.centreanimals;

/**
 *
 * @author alumne
 */
public class Reptil extends Animal {

    public String medi;
    public double mida;

    public String getMedi() {
        return medi;
    }

    public void setMedi(String medi) {
        this.medi = medi;
    }

    public double getMida() {
        return mida;
    }

    public void setMida(double mida) {
        this.mida = mida;
    }

    public Reptil(String nom) {
        super(nom);
    }

    public Reptil(String medi, double mida, String nom) {
        super(nom);
        this.medi = medi;
        this.mida = mida;
    }

    @Override
    public String toString() {
        return super.toString() + " medi: " + medi + " mida: " + mida;
    }
}
