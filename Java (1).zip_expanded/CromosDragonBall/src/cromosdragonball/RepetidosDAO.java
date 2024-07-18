/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cromosdragonball;

import Exceptions.NumberOutofAlbumException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author alessandro
 */
public class RepetidosDAO {

    Collection<Cromo> repes;
    int numero_maxim_album;

    public RepetidosDAO(int num) {  //constructor donde le pasamos el numero_maxim_album
        repes = new HashSet<>();
        this.numero_maxim_album = num;
    }

    public void addCromo(Cromo cromo) throws NumberOutofAlbumException { //agrega el cromo que le pasamos
        if (cromo.getNumero() > this.numero_maxim_album) {
            throw new NumberOutofAlbumException("Imposible añadir cromo, excede el numero maximo de la coleccion " + numero_maxim_album);
        } else {
            repes.add(cromo);
        }
    }

    public boolean contieneComo(int numero) { //devuelve si existe el cromo en el album
        Iterator it = repes.iterator();
        while (it.hasNext()) {
            Cromo next = (Cromo) it.next();
            if (next.getNumero() == numero) {
                return true;
            }
        }
        return false;
    }

    public void eliminarCromo(int numero) { //eliminamos el cromo que le pasamos
        Iterator it = repes.iterator();
        while (it.hasNext()) {
            Cromo next = (Cromo) it.next();
            if (next.getNumero() == numero) {
                repes.remove(next);
            }
        }
    }

    public void listarCromos() { //Imprime la lista de cromos
        Iterator it = repes.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(" ");
    }

}
