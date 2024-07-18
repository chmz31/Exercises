/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploherencia;

/**
 *
 * @author alumne
 */
public class EjemploHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno("DAM2","Juan");
        System.out.println(p1+"\n"+a1);
        System.out.println("Nuevo alumno: "+a2);
    }
    
}
