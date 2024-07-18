/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.polimorf.futbol;

import java.util.ArrayList;

/**
 *
 * @author alumne
 */
public class POOPolimorfFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
        //creamos los integrantes (inicializamos objetos)
        Entrenador ent = new Entrenador("12345", "1", "Julen", "España", 1965);
        Futbolista fut = new Futbolista(8, "Centrocampista", "2", "Andres", "España", 1984);
        Masajista mas = new Masajista("DAM", 1, "3", "Manolo", "España", 1966);
        //añadimos los integrantes al AL
        integrantes.add(ent);
        integrantes.add(fut);
        integrantes.add(mas);
        
        //todos se concentran
        for (int i = 0; i < integrantes.size(); i++) {
            integrantes.get(i).concentrarse();
        }

        //todos viajan
        for (int i = 0; i < integrantes.size(); i++) {
            integrantes.get(i).viajar();
        }

        //todos entrenan
        for (int i = 0; i < integrantes.size(); i++) {
            integrantes.get(i).entrenamiento();
        }

        //los entrenadores planifican entrenamiento 
        for (int i = 0; i < integrantes.size(); i++) {
            if (integrantes.get(i) instanceof Entrenador) {
                integrantes.get(i).entrenamiento();
            }
        }

        //futbolistas realizan entrevista
        for (SeleccionFutbol futbolista : integrantes) {
            if (futbolista instanceof Futbolista) {
                ((Futbolista) futbolista).entrevista();
            }
        }

        //masajista da masaje
        mas.darMasaje();
    }

}
