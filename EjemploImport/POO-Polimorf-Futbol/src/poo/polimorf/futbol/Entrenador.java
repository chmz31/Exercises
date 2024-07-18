/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.polimorf.futbol;

/**
 *
 * @author alumne
 */
public class Entrenador extends SeleccionFutbol{
    private String idFederacion;

    public Entrenador(String idFederacion, String id, String nombre, String pais, int any) { //constructor sobrecargado con todos los atributos
        super(id, nombre, pais, any);
        this.idFederacion = idFederacion;
    }
    
    @Override
    public void entrenamiento() {
        System.out.println("Da un entrenamiento");
    }

    @Override
    public void partidoFurbo() {
        System.out.println("Dirige un partido");
    }

    public void planificarEntrenamiento(){
        System.out.println("Planifica un entrenamiento");
    }
}
