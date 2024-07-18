/*
 * Exercici2: Fes un programa que simuli el llençament d'una moneda 50 vegades. 
 * Conta quantes cares i cuantes creus han sortit. Realiza la funció: 
 * boolean tiradaMoneda();
 */
package exercicirandom2;

import java.util.Random;

/**
 *
 * @author mon
 */
public class ExerciciRandom2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int MAX_TIRADAS = 100;
        int contaCaras =0;
        int contaCruz=0;
        
        System.out.println("TIRADA DE MONEDA");

        //boolean cara = tiraMoneda();
        for (int i = 0; i < MAX_TIRADAS; i++) {
            if (tiraMoneda()) {
                System.out.print("Cara ");
                contaCaras++;
                
            } else {
                System.out.print("Cruz ");
                contaCruz++;
            }
        }
        System.out.println("\nHan salido: " + contaCaras + "caras y " + contaCruz + "cruces" );
    }

    //retorna true o false. True para cara, false para cruz
    public static boolean tiraMoneda() {
        Random r1 = new Random();
        return r1.nextBoolean();
    }

}
