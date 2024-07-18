/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.examenuf4;

/**
 *
 * @author alumne
 */
public class Esfera implements IFigura3D {

    private double radi;

    public Esfera(double radi) { //constructor sobrecargado con el radio
        this.radi = radi;
    }

    @Override
    public double calcularVolum() { //funcion que devuelve el volumen de una esfera
        return ( 4 * (Math.PI * Math.pow(this.radi, 3) / 3));
    }

}
