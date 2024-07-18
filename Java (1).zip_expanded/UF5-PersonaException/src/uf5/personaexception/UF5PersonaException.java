/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf5.personaexception;

import Excepciones.ValorNoIniciadoException;
import Excepciones.ValorInvalidoException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class UF5PersonaException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Dime nombre: ");
            String nombre = scan.nextLine();
            System.out.print("Dime dni: ");
            String dni = scan.nextLine();
            System.out.print("Dime sueldo: ");
            double sueldo = scan.nextDouble();
            scan.nextLine();
            System.out.print("Dime año nacimiento: ");
            int nacimiento = scan.nextInt();
            scan.nextLine();
            Persona p = new Persona(nombre, nacimiento, dni, sueldo);
            System.out.println("Dni: " + p.getDni());
            //p.setDni(null);
            //System.out.println("DNI: " + p.getDni());
            System.out.println("Sueldo: " + p.getSueldo());
        } catch (ValorNoIniciadoException ex) {
            System.out.println(ex.getMessage());
        } catch (ValorInvalidoException ex) {
            System.out.println(ex.getMessage());
        } catch (InputMismatchException ex) { 
            System.out.println("Error de datos");
        }
        
    }

}
