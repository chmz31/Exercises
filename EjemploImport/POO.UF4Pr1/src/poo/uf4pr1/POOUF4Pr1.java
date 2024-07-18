/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.uf4pr1;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class POOUF4Pr1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicializamos variables y scanner
        DAO_AparellElectric utils = new DAO_AparellElectric();
        Scanner scan = new Scanner(System.in);
        int opcion;
        boolean salir = false;
        do {
            //mostramos menu y pedimos opcion cada vez
            System.out.println("Escull opcio: \n1. Alta aparell\n2. Baixa aparell\n3. Encendre/Apagar\n4. Llistar aparells i el seu consum total\n5. Llistar consum aparells encesos\n6. Buscar i mostrar aparell per nom\n7. Sortir\nOpcio: ");
            opcion = scan.nextInt();
            scan.nextLine(); // limpiar buffer
            switch (opcion) {
                case 1:
                    utils.altaAparell();
                    break;
                case 2:
                    utils.baixaAparell();
                    break;
                case 3:
                    System.out.println("Dime id del aparato para encender/apagar: ");
                    utils.encendre_apagar_Aparell(scan.nextInt());
                    break;
                case 4:
                    utils.listar_aparells_consum();
                    break;
                case 5:
                    utils.llistar_consum_encesos();
                    break;
                case 6:
                    utils.buscar_aparell_nom();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("No se ha introducido una opcion valida");
                    break;
            }
        } while (opcion != 7);
    }

}
