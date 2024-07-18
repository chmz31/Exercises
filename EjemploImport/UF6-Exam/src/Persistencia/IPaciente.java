/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.Paciente;

/**
 *
 * @author alessandro
 */
public interface IPaciente {

    public void buscarPacientesNombre(String nombre);

    public void agregarPaciente(Paciente p);

    public void darBajaPaciente(int id);

    public void listarPacientes();

    public Paciente pedirDatosPaciente();
}
