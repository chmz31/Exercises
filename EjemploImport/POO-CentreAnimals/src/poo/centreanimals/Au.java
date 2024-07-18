/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.centreanimals;

/**
 *
 * @author alumne
 */
public class Au extends Animal {
    public String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Au(String nom) { //constructor sobrecargado con el nombre
        super(nom);
    }
    
    public Au(String color, String nom) { //constructor sobrecargado
        super(nom);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+ " color: " + color;
    }
}
