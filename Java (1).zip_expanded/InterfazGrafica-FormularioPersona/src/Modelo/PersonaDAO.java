/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author alessandro
 */
public class PersonaDAO implements IPersona {

    ArrayList<Persona> lista;

    public PersonaDAO() {
        lista = new ArrayList<>();
    }

    public void addPersona(Persona p) { //metodo para agregar persona a la lista
        lista.add(p);
    }

    @Override
    public ArrayList<Persona> buscarPorNombre(String nombre) { //devuelve la lista de personas con el nombre que le pasamos
        ArrayList<Persona> encontradas = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().equals(nombre)) {
                encontradas.add(lista.get(i));
            }
        }
        return encontradas;
    }

    @Override
    public void eliminarPersona(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String listarTodo() {
        String salida = "";
        for (Persona persona : lista) {
            salida = salida + persona+"\n";
        }
        return salida;
    }
}
