/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.personamain;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class POOPersonaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Dime sexo: H) Hombre  M) Mujer");
        char sexo = scan.nextLine().charAt(0);
        System.out.println("Dime altura (metros): ");
        double altura = scan.nextDouble();
        System.out.println("Dime peso (kg): ");
        double peso = scan.nextDouble();
        System.out.println("Dime la edad: ");
        int edad = scan.nextInt();
        Persona p1 = new Persona(nombre, edad, "0", sexo, peso, altura);
        System.out.println(p1);
        Persona p2 = new Persona(peso, altura);
        System.out.println(p2);
        Persona p3 = new Persona();
        p3.setAltura(altura);
        p3.setEdad(edad);
        p3.setNombre(nombre);
        p3.setPeso(peso);
        p3.setSexo(sexo);
        System.out.println(p3);
        System.out.println("------------------\nCalculos personas");
        for (int i = 0; i <= 3; i++) {
            switch (i) {
                case 1:
                    System.out.print("Peso para persona 1 es: ");
                    sobrepeso(p1.calcularIMC(p1.getPeso(), p1.getAltura()));
                    System.out.println("Persona 1 es mayor de edad? "+p1.esMayorEdad(p1.getEdad()));
                    break;
                case 2:
                    System.out.print("Peso para persona 2 es: ");
                    sobrepeso(p2.calcularIMC(p2.getPeso(), p2.getAltura()));
                    System.out.println("Persona 2 es mayor de edad? "+p2.esMayorEdad(p2.getEdad()));
                    break;
                case 3:
                    System.out.print("Peso para persona 3 es: ");
                    sobrepeso(p3.calcularIMC(p3.getPeso(), p3.getAltura()));
                    System.out.println("Persona 3 es mayor de edad? "+p3.esMayorEdad(p3.getEdad()));
                    break;
            }

        }
    }

    public static void sobrepeso(int IMC) {
        if (IMC == -1) {
            System.out.println("Peso ideal");
        } else if (IMC == 0) {
            System.out.println("Peso medio");
        } else if (IMC == 1) {
            System.out.println("Sobrepeso");
        }
    }
}
