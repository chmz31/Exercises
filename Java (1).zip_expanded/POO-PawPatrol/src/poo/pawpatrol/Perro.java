/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.pawpatrol;

/**
 *
 * @author alumne
 */
public class Perro {

    protected String nombre;
    protected int energia;
    protected int hidratacion;

    public Perro() {
    }

    public Perro(String nombre) {
        this.nombre = nombre;
        this.energia = 100;
        this.hidratacion = 100;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getHidratacion() {
        return hidratacion;
    }

    public void setHidratacion(int hidratacion) {
        this.hidratacion = hidratacion;
    }

    public void ladrar() {
        System.out.println(this.nombre + " ladra");
    }

    public void rescatar() {
        System.out.println(this.nombre + " rescata");
        this.energia -= 10;
        this.hidratacion -= 20;
    }

    public void comer() {
        System.out.println(this.nombre + " come");
        this.energia = 100;
    }

    public void beber() {
        System.out.println(this.nombre + " bebe");
        this.energia += 50;
        if (this.energia > 100) {
            this.energia = 100;
        }
    }

    @Override
    public String toString() {
        return nombre + " con energia: " + energia + " , con hidratacion: " + hidratacion;
    }
}
