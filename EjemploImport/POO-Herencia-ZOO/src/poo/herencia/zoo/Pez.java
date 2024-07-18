/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.herencia.zoo;

/**
 *
 * @author alumne
 */
public class Pez extends Animal{

    public Pez(int edad, float peso, String nombre) {
        super(edad, peso, nombre);
    }
    
    public void nadar(){
        System.out.println("Sigue nadando...");
    }
}
