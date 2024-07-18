/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Paciente;

/**
 *
 * @author alessandro
 */
public class Vista {

    public static void imprimePantalla(String texto) { //metodo que imprime por pantalla el texto que le pasamos
        System.out.print(texto);
    }

    public static void imprimePaciente(Paciente p) { //metodo que imprime por pantalla un paciente que le pasamos
        System.out.println(p);
    }

    public void mostrarMenu() {
        System.out.println("---Menu Hospital---");
        System.out.println("0. Salir");
        System.out.println("1. Buscar paciente por nombre: ");
        System.out.println("2. Agregar paciente al hospital: ");
        System.out.println("3. Dar de baja paciente: ");
        System.out.println("4. Listar pacientes: ");
    }
}
