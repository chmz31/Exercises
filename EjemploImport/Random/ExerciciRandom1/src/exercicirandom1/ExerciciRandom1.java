/*
 * Exercici1: Realitza un programa que simuli el llençament de dos daus. Usar una 
 * función que retorne un número al azar entre 1 y 6: int tiradaDado();
 */
package exercicirandom1;

import java.util.Random;

/**
 *
 * @author mon
 */
public class ExerciciRandom1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int NUM_TIRADAS = 10;
        System.out.println("TIRADA DE DOS DADOS");

        //int dado1 = tiradaDado();
        //int dado2 = tiradaDado();
        //System.out.println("Tirada de dados: " + dado1 + "-" + dado2);
        for (int i = 0; i < NUM_TIRADAS; i++) {
            System.out.println("Tirada " + i + ":" + tiradaDado());
        }

    }

    /**
     * simula tirada de dado
     *
     * @return numero de 1 a 6
     */
    public static int tiradaDado() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

}
