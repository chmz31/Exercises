/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf5.personaexception;

import Excepciones.ValorNoIniciadoException;
import Excepciones.ValorInvalidoException;

/**
 *
 * @author alumne
 */
public class Persona {

    private String nombre;
    private int nacimiento;
    private String dni;
    private double sueldo;

    public Persona() {

    }

    public Persona(String nombre, int nacimiento, String dni, double sueldo) throws ValorInvalidoException {
        this.nombre = nombre;
        setNacimiento(nacimiento);
        this.dni = dni;
        setSueldo(sueldo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) throws ValorInvalidoException {
        if (nacimiento < 0) {
            throw new ValorInvalidoException("El any no puede ser negativo");
        } else {
            this.nacimiento = nacimiento;
        }
    }

    public String getDni() throws ValorNoIniciadoException {
        if (dni == null) {
            throw new ValorNoIniciadoException("El dni tiene que estar inicializado");
        } else {
            return dni;
        }
    }

    public void setDni(String dni) throws ValorNoIniciadoException {
        this.dni = dni;
    }

    public double getSueldo() throws ValorInvalidoException {
        return sueldo;
    }

    public void setSueldo(double sueldo) throws ValorInvalidoException {
        if (sueldo < 0) {
            throw new ValorInvalidoException("El sueldo no puede ser negativo");
        } else {
            this.sueldo = sueldo;
        }
    }
}
