/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pawpatrol;

/**
 *
 * @author alumne
 */
public class Piloto extends Perro {

    public Piloto() {
        this.nombre = "Skye";
        this.energia = 1000;
        this.hidratacion = 100;
    }

    public void volar() {
        System.out.println(this.nombre + " pilota su avion");
        this.setEnergia(this.energia - 50);
        this.setHidratacion(this.hidratacion - 5);
    }

    @Override
    public void beber() {
        System.out.println(this.nombre + " bebe");
        this.energia += 50;
        if (this.energia > 1000) {
            this.energia = 1000;
        }
    }

    @Override
    public String toString() {
        return "Piloto: " + super.toString();
    }

}
