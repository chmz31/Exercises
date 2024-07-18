/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.examenuf4;

/**
 *
 * @author alumne
 */
public class Cub implements IFigura3D{
    
    private double lado;

    public Cub(double lado) { //constructor sobrecargado con el lado
        this.lado = lado;
    }
    
    @Override
    public double calcularVolum() { //funcion que devuelve el volumen
        return (this.lado * this.lado * this.lado);
    }
    
}
