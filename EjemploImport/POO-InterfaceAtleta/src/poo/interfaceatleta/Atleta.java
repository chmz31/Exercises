/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.interfaceatleta;

/**
 *
 * @author alumne
 */
public class Atleta extends Persona {

    private String disciplina;
    private int dorsal;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Atleta() { //constructor por defecto
    }

    public Atleta(String nombre, int edad) { //constructo sobrecargado con nombre y edad
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public void irClase() {
        System.out.println("Soy un atleta, mi nombre es: " + this.nombre + " y voy a clase");
    }

    @Override
    public void nadar() {
        System.out.println("Soy un atleta, mi nombre es: " + this.nombre + " y estoy nadando");
    }

    @Override
    public void correr() {
        System.out.println("Soy un atleta, mi nombre es: " + this.nombre + " y estoy corriendo");
    }

    @Override
    public void saltar() {
        System.out.println("Soy un atleta, mi nombre es: " + this.nombre + " y estoy saltando");
    }
}
