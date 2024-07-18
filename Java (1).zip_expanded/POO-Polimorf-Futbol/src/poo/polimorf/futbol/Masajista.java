/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.polimorf.futbol;

/**
 *
 * @author alumne
 */
public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private int anysExperiencia;

    public Masajista(String titulacion, int anysExperiencia, String id, String nombre, String pais, int any) { //constructor sobrecargado con todos los atributos
        super(id, nombre, pais, any);
        this.titulacion = titulacion;
        this.anysExperiencia = anysExperiencia;
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Da asistencia al entrenamiento");
    }
    
    public void darMasaje(){
        System.out.println("Da un masaje");
    }

    
    
}
