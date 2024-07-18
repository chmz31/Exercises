/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.herencia.zoo;

/**
 *
 * @author alumne
 */
public class Animal extends Servivo {

    public Animal(int edad, float peso, String nombre) {
        super(edad, peso, nombre);
    }

    public void comer() {
        System.out.println("Ñam");
    }

    public void dormir() {
        System.out.println("ZZZ");
    }

    @Override
    public String toString() {
        return "Animal: " + nombre;
    }
    
    
}
