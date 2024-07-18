/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.abstractafiguras;

/**
 *
 * @author alumne
 */
public class Rectangulo extends Figura{
    private int ladoA;
    private int ladoB;

    public Rectangulo() { //constructor por defecto
    }

    public Rectangulo(int ladoA, int ladoB) { //constructor sobrecargado
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }
    
    @Override
     public int area(){ //calcula el area de la figura
     return ladoA * ladoB;
    }
}
