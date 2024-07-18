/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.pawpatrol;

/**
 *
 * @author alumne
 */
public class POOPawPatrol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Piloto skye = new Piloto();
        Manitas rocky = new Manitas();
        
        System.out.println("Perro1: "+skye+"\nPerro2: "+rocky);
        skye.beber();
        skye.rescatar();
        rocky.comer();
        rocky.ladrar();
        rocky.arreglar();
        skye.volar();
        System.out.println("Perro1: "+skye+"\nPerro2: "+rocky);
    }

}
