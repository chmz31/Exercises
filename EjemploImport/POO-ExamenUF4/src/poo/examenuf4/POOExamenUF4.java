/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.examenuf4;

/**
 *
 * @author alumne
 */
public class POOExamenUF4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instanciacion de objetos con todos los atributos
        Quadrat q1 = new Quadrat(4,8);
        Cercle ce1 = new Cercle(8,24);
        Cub cu1 = new Cub(8);
        Esfera e1 = new Esfera(3);
        
        //calculos figuras 2d
        System.out.println("Area de un cuadrado con 4 de radio y 8 de lado: "+q1.calcularArea());
        System.out.println("Perimetro: "+q1.calcularPerimetre());
        System.out.println("Area de un ciruclo con 8 de radio y 24 de diametro: "+Math.round(ce1.calcularArea())+" (Redondeado)");
        System.out.println("Perimetro: "+Math.round(ce1.calcularPerimetre())+" (Redondeado)");
        
        //calculos figuras 3d
        System.out.println("Volumen de un cubo con lado 8: "+cu1.calcularVolum());
        System.out.println("Volumen de una esfera de radio 3: "+Math.round(e1.calcularVolum())+" (Redondeado)");
        
    }
    
}
