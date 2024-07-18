/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.polimorfismetrabajadorempleadoconsultor;

/**
 *
 * @author alumne
 */
public class Consultor extends Trabajador{
    private int horas;
    private double tarifa;

    public Consultor(double tarifa, int horas, String nombre, String NSS) { //constructor sobrecargado + tarifa
        super(nombre, NSS);
        this.tarifa = tarifa;
        this.horas = horas;
    }
    
    public double calcularPaga(){
    return this.horas * this.tarifa;
    }

    @Override
    public String toString() {
        return "Consultor: " + super.toString();
    }
    
    
    
}
