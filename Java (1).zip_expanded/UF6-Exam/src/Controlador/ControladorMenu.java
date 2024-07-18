/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Paciente;
import Persistencia.DAOPaciente;
import Vista.Vista;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alessandro
 */
public class ControladorMenu {

    Vista vista;
    DAOPaciente modelo;

    public ControladorMenu(DAOPaciente modelo) { //Constructor del objeto de clase ControladorMenu
        this.vista = new Vista();
        this.modelo = modelo;
        pedirMenu();
    }

    public void pedirMenu() { //metodo para captar la opcion escojida del menu
        Scanner scan = new Scanner(System.in);
        while (true) {
            vista.mostrarMenu();
            vista.imprimePantalla("Dime opcion: ");
            try {
                int opcion = scan.nextInt();
                scan.nextLine(); // LIMPIAR BUFFER
                accionesMenu(opcion);
            } catch (InputMismatchException e) {
                System.out.println("Error al introducir los datos: " + e.getMessage());
            }
        }
    }

    public void accionesMenu(int opcion) { //metodo que controla las funciones del menu
        Scanner scan = new Scanner(System.in);
        switch (opcion) {
            case 1: //case buscar pacientes por nombre
                Vista.imprimePantalla("Dime nombre paciente: ");
                String nombre = scan.nextLine();
                modelo.buscarPacientesNombre(nombre);
                break;
            case 2: //case agregar paciente
                Paciente aux = modelo.pedirDatosPaciente();
                modelo.agregarPaciente(aux);
                break;
            case 3: //case baja paciente
                Vista.imprimePantalla("Dime id paciente a eliminar: ");
                int id = scan.nextInt();
                modelo.darBajaPaciente(id);
                break;
            case 4: //case listar todos los pacientes
                modelo.listarPacientes();
                break;
            case 0:
                System.exit(0);
        }
    }

}
