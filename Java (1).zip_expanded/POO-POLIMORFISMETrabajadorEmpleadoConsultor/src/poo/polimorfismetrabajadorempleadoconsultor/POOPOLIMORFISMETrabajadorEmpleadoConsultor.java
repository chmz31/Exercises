/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.polimorfismetrabajadorempleadoconsultor;

/**
 *
 * @author alumne
 */
public class POOPOLIMORFISMETrabajadorEmpleadoConsultor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Trabajador [] trabajadores = new Trabajador[2];
        trabajadores[0] = new Empleado(24000, "Jose", "123");
        trabajadores[1] = new Consultor(50, 10, "Juan", "456");
        
        for (int i = 0; i < trabajadores.length; i++) {
            System.out.println(trabajadores[i]);
            System.out.println("Paga: "+Math.round(trabajadores[i].calcularPaga()));
        }
    }
    
}
