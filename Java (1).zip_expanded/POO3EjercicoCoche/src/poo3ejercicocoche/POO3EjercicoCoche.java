/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo3ejercicocoche;

/**
 *
 * @author alumne
 */
public class POO3EjercicoCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicializamos 4 coches con los diferentes constructores
        Coche car1 = new Coche();
        Coche car2 = new Coche(4);
        Coche car3 = new Coche("Seat");
        Coche car4 = new Coche(6, "BMW");
        
        System.out.println("Tus coches:\n"+car1+",\n"+car2+",\n"+car3+",\n"+car4);
    }
    
}
