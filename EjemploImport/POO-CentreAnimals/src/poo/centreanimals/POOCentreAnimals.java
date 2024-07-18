/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.centreanimals;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class POOCentreAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Scanner scan = new Scanner(System.in);
        CentroDAO utils = new CentroDAO();
        do {
            System.out.print("Dime opcion: \n1. Afegir Animal 2.Entrada Animal 3. Salida Animal 4. Modificar Animal 5. Listar Animales 6. Salir\n");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    utils.afegirAnimal();
                    break;
                case 2:
                    utils.entrada();
                    break;
                case 3:
                    utils.sortida();
                    break;
                case 4:
                    utils.modificarAnimal();
                    break;
                case 5:
                    utils.listarAnimales();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Lo siento esa opcion no existe");
            }
        } while (opcion != 6);
    }
}
