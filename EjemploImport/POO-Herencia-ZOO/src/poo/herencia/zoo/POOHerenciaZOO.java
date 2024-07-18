/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.herencia.zoo;

/**
 *
 * @author alumne
 */
public class POOHerenciaZOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Zoo z1 = new Zoo(2);
        Zoo z2 = new Zoo(7);
        
        z1.zoo[0] = new Jirafa(1, (float) 12.2, "Jirafa");
        z1.zoo[1] = new Jirafa(1, (float) 12.2, "Jirafa");
        
        z2.zoo[0] = new Leon(1, (float) 12.2, "Leon");
        z2.zoo[1] = new Leon(1, (float) 14.3, "Leon");
        z2.zoo[2] = new Leon(1, (float) 12.2, "Leon");
        z2.zoo[3] = new Leon(1, (float) 14.3, "Leon");
        z2.zoo[4] = new Delfin(1, (float) 14.3, "Delfin");
        z2.zoo[5] = new Delfin(1, (float) 14.3, "Delfin");
        z2.zoo[6] = new Delfin(1, (float) 14.3, "Delfin");
        
        System.out.println("Animales en el zoo1: ");
        for (int i = 0; i < z1.zoo.length; i++) {
            System.out.println(z1.zoo[i]);
        }
        System.out.println("Animales en el  zoo2: ");
         for (int i = 0; i < z2.zoo.length; i++) {
            System.out.println(z2.zoo[i]);
        }
    }

}
