/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.examenuf4;

/**
 *
 * @author alumne
 */
public class Quadrat implements IFigura2D {

    private double radi;
    private double lado;

    public Quadrat(double radi, double lado) { //constructor sobrecargado con el radio y el lado
        this.radi = radi;
        this.lado = lado;
    }

    //No creamos setters y getters ya que no los vamos a utilizar
    
    @Override
    public double calcularArea() { //metodo que devuelve el area
        return (this.radi * this.radi);
    }

    @Override
    public double calcularPerimetre() { //metodo que devuelve el perimetro
        return (4 * this.lado);
    }

}
