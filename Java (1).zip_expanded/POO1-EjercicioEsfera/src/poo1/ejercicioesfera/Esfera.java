/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo1.ejercicioesfera;

/**
 *
 * @author alumne
 */
public class Esfera {

    private double r;

    public Esfera() {
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double calculoVolumen() {
        return ((4 / 3) * Math.PI * Math.pow(r, 3));
    }
    
    public double calculoArea() {
        return (4 * Math.PI * Math.pow(r, 2));
    }

    @Override
    public String toString() {
        return "Esfera: " + "radio= " + r + " volumen: " + this.calculoVolumen()+ " area: "+this.calculoArea();
    }
}
