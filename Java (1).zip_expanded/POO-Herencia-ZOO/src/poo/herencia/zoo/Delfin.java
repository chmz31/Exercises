/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.herencia.zoo;

/**
 *
 * @author alumne
 */
public class Delfin extends Pez{

    public Delfin(int edad, float peso, String nombre) {
        super(edad, peso, nombre);
    }
    
    public void hacerPirueta(){
        System.out.println("DO A BARREL ROLL");
    }
}
