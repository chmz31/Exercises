/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pawpatrol;

/**
 *
 * @author alumne
 */
public class Manitas extends Perro {

    public Manitas() {
        this.nombre = "Rocky";
        this.energia = 100;
        this.hidratacion = 100;
    }

    public void arreglar() { //el perro arregla algo y gasta los recursos necesarios
        System.out.println(this.nombre + " arregla");
        this.setEnergia(this.energia - 5);
        this.setHidratacion(this.hidratacion - 5);
    }

    @Override
    public String toString() {
        return "Manitas: " + super.toString();
    }
}
