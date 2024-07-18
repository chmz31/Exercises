/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.examenuf4.pkg2;

/**
 *
 * @author alumne
 */
public class Bicicleta extends Vehicle {

    protected String tipus;
    protected boolean seientAdjustable;

    public Bicicleta(String tipus, boolean seientAdjustable, String marca, String model, String motor, int nEixos) {
        super(marca, model, motor, 2, nEixos); //las bicicletas siempre tendran 2 ruedas
        this.tipus = tipus;
        this.seientAdjustable = seientAdjustable;
    }

    @Override
    public void endavant() {
        System.out.println("La bicileta va endavant");
    }

    @Override
    public void aturar() {
        System.out.println("La bicicleta s'atura");
    }

    @Override
    public void girar() {
        System.out.println("La bicicleta gira");
    }

    @Override
    public String toString() {
        return "Bicicleta " + super.toString();
    }
}
