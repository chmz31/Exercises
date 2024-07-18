/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.examenuf4;

/**
 *
 * @author alumne
 */
public class Cercle implements IFigura2D {

    private double radi;
    private double diametre;

    public Cercle(double radi, double diametre) { //constructor sobrecargado con el radio y el diametro
        this.radi = radi;
        this.diametre = diametre;
    }

     //No creamos setters y getters ya que no los vamos a utilizar
    
    @Override
    public double calcularArea() { //metodo que devuelve el area
        return (2 * Math.PI * this.radi);
    }

    @Override
    public double calcularPerimetre() { //metodo que devuelve el permietro
        return (Math.PI * this.diametre);
    }

}
