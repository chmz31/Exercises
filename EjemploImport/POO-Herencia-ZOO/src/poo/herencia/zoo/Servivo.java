/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.herencia.zoo;

/**
 *
 * @author alumne
 */
public class Servivo extends Ser {
    public int edad;

    public Servivo(int edad, float peso, String nombre) {
        super(peso, nombre);
        this.edad = edad;
    }
}
