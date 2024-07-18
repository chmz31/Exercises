/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cromosdragonball;

import Exceptions.NumberOutofAlbumException;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author alessandro
 */
public class AlbumDAO {

    HashMap<Integer, Cromo> album;
    int numero_maxim_album;

    public AlbumDAO(int num) { //constructor donde le pasamos el numero_maxim_album
        album = new HashMap<>();
        this.numero_maxim_album = num;
    }

    public void addCromo(Cromo cromo) throws NumberOutofAlbumException { //agrega un cromo al album
        if (cromo.getNumero() > this.numero_maxim_album) {
            throw new NumberOutofAlbumException("Imposible añadir cromo, excede el numero maximo de la coleccion " + numero_maxim_album);
        } else {
            album.put(cromo.getNumero(), cromo);
        }
    }

    public void listarCromos() { //lista todos los cromos del album
        Iterator it = album.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry<Integer, Cromo> entry = (HashMap.Entry) it.next();
            System.out.println(entry.getValue());
        }
        System.out.println(" ");
    }

    public boolean contieneCromo(Cromo c) { //devuelve si existe el cromo en el album
        return (this.album.containsValue(c));
    }

    public boolean contieneCromo(int num) { //devuelve si existe el cromo en el album
        return (this.album.containsKey(num));
    }

    public void eliminarCromo(int numero) { //elimina el cromo con el ID que le pasemos
        Iterator it = album.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry<Integer, Cromo> entry = (HashMap.Entry) it.next();
            if (entry.getKey() == numero) {
                album.remove(entry.getKey(), entry.getValue());
            }
        }
    }
}
