/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.personaprofesor;

/**
 *
 * @author alumne
 */
public class POOPersonaProfesor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesor p1 = new Profesor("IT","Julian",23);
        Profesor p2 = new Profesor("Marketing","Antonio",46);
        p1.printarDatos();
        p2.printarDatos();
        System.out.println("Son iguales? "+p1.equals(p2));
    }
    
}
