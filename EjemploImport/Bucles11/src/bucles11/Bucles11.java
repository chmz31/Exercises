/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles11;

/**
 *
 * @author alumne
 */
public class Bucles11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicializamos las variables
        //Tenemos dos contadores, uno cuenta los Impares y el otro los pares, ambos van sumando cada paso al anterior.
        int contador, suma1 = 0, suma2 = 0;
        for (contador = 101; contador <= 200; contador = contador + 2) {
            suma1 = contador + suma1;
        }
        //mostramos los contadores en pantalla
        System.out.println("Suma Impares entre 100 y 200: " + suma1);
        for (contador = 100; contador <= 200; contador = contador + 2) {
            suma2 = contador + suma2;
        }
        System.out.println("Suma pares entre 100 y 200: " + suma2);
    }
}
