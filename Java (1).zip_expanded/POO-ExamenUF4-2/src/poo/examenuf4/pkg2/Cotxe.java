/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.examenuf4.pkg2;

/**
 *
 * @author alumne
 */
public class Cotxe extends Vehicle {

    protected String chasis;
    protected String marcaRuedas;

    public Cotxe(String Chasis, String marcaRuedas, String marca, String model, String motor, int nEixos) { //constructor sobrecargado con todos los atributos
        super(marca, model, motor, 4, nEixos); //nuestros coches siempre tendran 4 ruedas
        this.chasis = Chasis;
        this.marcaRuedas = marcaRuedas;
    }

    @Override
    public void endavant() {
        System.out.println("El cotxe accelera");
    }

    @Override
    public void aturar() {
        System.out.println("El cotxe derrapa");
    }

    @Override
    public void girar() {
        System.out.println("El cotxe gira");
    }

    @Override
    public String toString() {
        return "Coche " + super.toString();
    }

}
