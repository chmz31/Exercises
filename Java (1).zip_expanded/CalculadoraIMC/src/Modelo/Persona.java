/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Exceptions.ValorInvalidoException;

/**
 *
 * @author alessandro
 */
public class Persona implements IPersona {

    private String nombre;
    private double altura, peso;

    public Persona(String nombre, double altura, double peso) { //constructor sobrecargado con todos los atributos
        try {
            this.nombre = nombre;
            setAltura(altura);
            setPeso(peso);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    //Setters & getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) throws ValorInvalidoException {
        if (altura <= 0) { //error si la altura es menor que 0
            throw new ValorInvalidoException("La altura no puede ser menor que 0m");
        } else {
            this.altura = altura;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) throws ValorInvalidoException {
        if (peso < 10.00) {
            throw new ValorInvalidoException("El peso no puede ser menor a 10Kg");
        } else {
            this.peso = peso;
        }
    }

    @Override
    public double calcularIndiceIMC() { //devuelve el IMC de esta persona
        return Math.round(this.peso / Math.pow(altura, 2));
        //nota he decidido redondear porque no me gustaba ver numeros con demasiados decimales, el enunciado no menciona nada al respecto
    }

    @Override
    public String interpretarIndiceIMC(double indiceIMC) { //metodo que devuelve un String en funcion de la clasificacion del IMC
        if (indiceIMC <= 16) {
            return "Delgadez Severa";
        } else if (indiceIMC > 16 && indiceIMC < 17) {
            return "Delgadez Moderada";
        } else if (indiceIMC >= 17 && indiceIMC <= 18.49) {
            return "Delgadez Leve";
        } else if (indiceIMC >= 18.5 && indiceIMC < 25) {
            return "Normal";
        } else if (indiceIMC >= 25 && indiceIMC < 30) {
            return "Preobeso";
        } else if (indiceIMC >= 30 && indiceIMC < 35) {
            return "Obesidad Leve";
        } else if (indiceIMC >= 35 && indiceIMC < 40) {
            return "Obesidad Moderada";
        } else if (indiceIMC >= 40) {
            return "Obesidad Severa";
        }
        return null; //si no se cumple ningun caso
    }
}
