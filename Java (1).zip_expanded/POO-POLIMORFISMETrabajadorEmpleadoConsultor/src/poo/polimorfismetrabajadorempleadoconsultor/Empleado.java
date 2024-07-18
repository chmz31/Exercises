/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.polimorfismetrabajadorempleadoconsultor;

/**
 *
 * @author alumne
 */
public class Empleado extends Trabajador {
    protected double sueldo;
    protected double impuestos;

    public Empleado(double sueldo, String nombre, String NSS) { //constructor sobrecargado + sueldo
        super(nombre, NSS);
        this.sueldo = sueldo;
    }
    
    public double calcularPaga(){
    return (this.sueldo - this.impuestos) / 14;
    }

    @Override
    public String toString() {
        return "Empleado: "+ super.toString();
    }
}
