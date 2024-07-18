/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Scanner;

/**
 *
 * @author alessandro
 */
public class Menu {

    public int showMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Insertar NeverLand");
        System.out.println("2. Mostrar todos los paises");
        System.out.println("3. Insertar nuevo pais");
        System.out.println("4. Show country esperanza de vida");
        System.out.println("0. Salir");
        System.out.print("Opcion: ");
        return scan.nextInt();
    }
}
