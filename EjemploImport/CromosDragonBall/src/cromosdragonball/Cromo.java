/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cromosdragonball;

import Exceptions.DescipcionMinimaException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alessandro
 */
public class Cromo {

    private String descripcion;
    private int numero;

    public Cromo(String descripcion, int numero) {//constructor sobrecargado con todos los atributos
        try {
            this.numero = numero;
            setDescripcion(descripcion);
        } catch (Exception ex) {
            System.out.println("Error: "+ex.getMessage());
        }
    }

    public int getNumero() { //metodo que devuelve el numero del cromo
        return numero;
    }

    public void setDescripcion(String descripcion) throws DescipcionMinimaException { //metodo para cambiar el valor de la descripcion
        if (descripcion.length() < 3) {
            throw new DescipcionMinimaException("La descripcion no puede ser menor a 3 caracteres");
        } else {
            this.descripcion = descripcion;
        }
    }

    @Override
    public String toString() { //como queremos que se impriman los cromos al llamarlos
        return numero + " | Cromo " + descripcion;
    }

    @Override
    public boolean equals(Object obj) { //dos cromos son iguales si tiene el mismo numero
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cromo other = (Cromo) obj;
        return this.numero == other.numero;
    }

}
