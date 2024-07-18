/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooejerciciosampliacion;

/**
 *
 * @author alumne
 */
public class Rectangle {

    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Rectangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public static void sonIguales(Rectangle rect1, Rectangle rect2) { //METODO QUE COMPRUEBA SI DOS RECTANGULOS SON IGUALES, AL SER STATIC LO PODEMOS LLAMAR DESDE RECTANGLE. sin necesidad de objetos creados
        if (rect1.base == rect2.base && rect1.altura == rect2.altura) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }
    }

}
