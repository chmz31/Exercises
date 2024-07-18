/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author alessandro
 */
public interface IPersona {

    void addPersona(Persona p);

    ArrayList<Persona> buscarPorNombre(String nombre);

    void eliminarPersona(Persona p);
}
