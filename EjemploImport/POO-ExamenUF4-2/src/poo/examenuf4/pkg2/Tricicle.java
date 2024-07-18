/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.examenuf4.pkg2;

/**
 *
 * @author alumne
 */
public class Tricicle extends Vehicle {

    protected String color;
    protected int sillas;

    public Tricicle(String color, int sillas, String marca, String model, String motor, int nEixos) { //constructor sobrecargado con todos los atributos
        super(marca, model, motor, 3, 1); //los triciclos siempre tendran 3 ruedas y 1 eje
        this.color = color;
        this.sillas = sillas;
    }

    //Metodos sobreescritos
    @Override
    public void endavant() {
        System.out.println("El triciclo avanza");
    }

    @Override
    public void aturar() {
        System.out.println("El triciclo deja de pedalear");
    }

    @Override
    public void girar() {
        System.out.println("el triciclo gira");
    }

    @Override
    public String toString() {
        return "Tricicle " + super.toString();
    }
}
