/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.polimorfismetrabajadorempleadoconsultor;

import java.util.Objects;

/**
 *
 * @author alumne
 */
public class Trabajador {
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected String fecha_nacimiento;
    protected String fecha_contrato;
    protected String NSS;

    public Trabajador(String nombre, String NSS) { //Constructor sobrecargado con nombre y NSS
        this.nombre = nombre;
        this.NSS = NSS;
    }
    
    public double calcularPaga(){
    return 0.0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Trabajador other = (Trabajador) obj;
        return Objects.equals(this.NSS, other.NSS);
    }

    @Override
    public String toString() {
        return "NSS: " + NSS;
    }
    
    
    
    
}
