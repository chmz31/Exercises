/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.polimorf.futbol;

/**
 *
 * @author alumne
 */
public class Futbolista extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;

    public Futbolista(int dorsal, String demarcacion, String id, String nombre, String pais, int any) { //constructor sobrecargado con todos los artibutos
        super(id, nombre, pais, any);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public void entrenamiento() {
        System.out.println("Realiza un entrenamiento");
    }
    
    @Override
    public void partidoFurbo() {
        System.out.println("Juega un partido");
    }
    
    public void entrevista(){
        System.out.println("Da una entrevista");
    }

}
