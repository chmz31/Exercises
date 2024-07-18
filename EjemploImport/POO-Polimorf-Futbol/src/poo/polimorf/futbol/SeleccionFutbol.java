/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.polimorf.futbol;

/**
 *
 * @author alumne
 */
abstract class SeleccionFutbol {

    protected String id;
    protected String nombre;
    protected String pais;
    protected int any;

    public SeleccionFutbol(String id, String nombre, String pais, int any) { //constructor sobrecargado con todos los atributos
        this.id = id;
        this.nombre = nombre;
        this.pais = pais;
        this.any = any;
    }

    public void viajar() { //imprime viajar
        System.out.println("Viajar");
    }
    
    public void concentrarse(){
        System.out.println("Concentrarse");
    }
    
    public void partidoFurbo(){
        System.out.println("Asiste al partido de futbol");
    }
    
    abstract void entrenamiento();

}
