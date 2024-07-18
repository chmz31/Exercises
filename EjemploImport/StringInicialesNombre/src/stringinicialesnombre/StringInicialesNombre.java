/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringinicialesnombre;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class StringInicialesNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = scan.nextLine();
        System.out.print("Introduce tu 1r apellido: ");
        String apellido1 = scan.nextLine();
        System.out.print("Introduce tu 2n apellido: ");
        String apellido2 = scan.nextLine();
        System.out.println("Tu nombre completo es: "+nombre+" "+apellido1+" "+apellido2);
        String apodo = nombre.substring(0, 3)+apellido1.substring(0, 3)+apellido2.substring(0, 3);
        System.out.println("Tu usuario es: "+apodo.toUpperCase());
    }
    
}
