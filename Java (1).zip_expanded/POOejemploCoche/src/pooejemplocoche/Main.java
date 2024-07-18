/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooejemplocoche;

/**
 *
 * @author alumne
 */
public class Main {

    public static void main(String[] args) {
        //Creamos una instancia de la clase coche, una variable
        Coche car1 = new Coche();
        //visualizamos sus atributos por defecto
        System.out.println("El coche1 es un: " + car1.marca + " de color: " + car1.color);

        //modificamos los atributos
        car1.marca = "seat";
        car1.color = "verde";
        System.out.println("El coche1 es un: " + car1.marca + " de color: " + car1.color);

        //creamos coche con el nuevo constructor
        Coche car2 = new Coche("porsche");
        System.out.println("El coche2 es un: " + car2.marca + " de color: " + car2.color);
    }
}
