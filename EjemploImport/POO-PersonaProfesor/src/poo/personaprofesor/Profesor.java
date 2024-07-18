/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.personaprofesor;

/**
 *
 * @author alumne
 */
public class Profesor extends Persona{
    private String departamento;

    public Profesor() {
    }

    public Profesor(String departamento, String nombre, int edad) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    @Override
    public void printarDatos(){
        System.out.println("Hola Profesor");
    }
}
