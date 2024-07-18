/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.personamain;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class Persona {

    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() { //constructor por defecto
        this.nombre = "nombre";
        this.edad = 0;
        this.sexo = 'H';
        this.peso = 0.0;
        this.altura = 0.0;
        this.DNI = this.generaDNI();
    }

    public Persona(double peso, double altura) { //constructor sobrecargado con peso y altura
        this.peso = peso;
        this.altura = altura;
        this.nombre = "nombre";
        this.edad = 0;
        this.sexo = 'H';
        this.DNI = this.generaDNI();
    }

    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) { //constructor sobrecargado con todos los atributos
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.DNI = this.generaDNI();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public String toString() {
        return "nombre: " + nombre + " edad: " + edad + " DNI: " + DNI + " sexo: " + sexo + " peso: " + peso + "kg altura: " + altura+"m";
    }

    public int calcularIMC(double peso, double altura) { //calucla el IMC de la persona
        double IMC = peso / Math.pow(altura, 2);
        int devolver = 0;
        if (IMC < 20) {
            devolver = -1;
        } else if (IMC >= 20 && IMC <= 25) {
            devolver = 0;
        } else if (IMC > 25) {
            devolver = 1;
        }
        return devolver;
    }

    public boolean esMayorEdad(int edad) { //comprueba si la persona es mayor de edad
        boolean vuelta = false;
        if (edad >= 18) {
            vuelta = true;
        }
        return vuelta;
    }

    public void comprobarSexo(char sexo) { // comprueba el sexo de la persona y si es incorrecto lo pone en H
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = 'H';
        }
    }

    private String generaDNI() {
        Random r1 = new Random();
        int num = r1.nextInt(99999999) + 10000000;
        return Integer.toString(num);
    }
}
