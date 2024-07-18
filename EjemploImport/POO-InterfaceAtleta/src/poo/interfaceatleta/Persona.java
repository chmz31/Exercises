/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.interfaceatleta;

/**
 *
 * @author alumne
 */
 abstract class Persona implements INadador, ICorredor{
    protected String nombre;
    protected int edad;
    
    public abstract void irClase();

    @Override
    public String toString() {
        return "Soy una persona mi nombre es: " + nombre + " mi edad es: " + edad;
    }
    
}
