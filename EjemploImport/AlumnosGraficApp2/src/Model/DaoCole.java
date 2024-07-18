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
    public Persona buscarPorNombre(String nombre) {
        Persona encontrada = null;
        for (Persona aux : cole) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                encontrada = aux;
            }
        }
        return encontrada;
    }

    @Override
    public void eliminarPersona(Persona p) {
        cole.remove(p); //eliminamos la persona que le pasamos
    }

    @Override
    public void eliminarPersona(String nombre) {
        for (int i = 0; i < cole.size(); i++) {
            if (cole.get(i).nombre.equals(nombre)) {
                cole.remove(cole.get(i)); //eliminamos la persona con el nombre que le pasamos
            }
        }
    }

    /**
     * Devuelve la lista de personas en un string con cada persona en una linea
     *
     * @return
     */
    @Override
    public String listadoPersonas() {
        String res = "";
        for (Persona p : cole) {
            res += p.toString();
            res += "\n";
        }
        return res;
    }

    public Persona buscarPersona(String nom) { // Devuelve la persona con el nombre que le pasamos
        for (int i = 0; i < cole.size(); i++) {
            if (cole.get(i).nombre.equals(nom)) {
                return cole.get(i);
            }
        }
        return null;
    }

}
