/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author rsesen
 */
public class DaoCole implements IPersonas {

    ArrayList<Persona> cole;

    public DaoCole() {
        cole = new ArrayList<>();
    }

    @Override
    public void anyadirPersona(Persona p) {
        if (!cole.contains(p)) {
            cole.add(p);
        }
    }

    @Override
    public ArrayList<Persona> buscarPorNombre(String nombre) {
        ArrayList<Persona> encontradas = new ArrayList<>();
        for (Persona aux : cole) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                encontradas.add(aux);
            }
        }
        return encontradas;
    }

    @Override
    public void eliminarPersona(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String listadoPersonas() {
        String res = "";
        for (Persona p : cole) {
            res += p.toString();
            res += "\t";
        }
        return res;
    }

}
