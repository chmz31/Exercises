/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles9;
//Realiza un programa que calcule y escriba la suma y el producto de los 10 primeros números
//naturales.

/**
 *
 * @author alumne
 */
public class Bucles9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Suma y producto de los 10 primeros numeros naturales:\n");
        int contador;
        int suma = 0;
        int multi = 1;
        int num = 10;
        for (int i = num; i >= 1; i--) {
            suma = suma + i;
            multi = multi * i;
        }
        System.out.println("Suma= " + suma);
        System.out.println("Producto= " + multi);
    }

}
