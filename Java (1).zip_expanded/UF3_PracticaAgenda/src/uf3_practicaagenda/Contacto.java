/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf3_practicaagenda;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author alumne
 */
public class Contacto implements Serializable {

    private String nombre;
    private int telefono;
    private String email;
    private Date fecha_nacimiento;
    private String localidad;
    private String cp;

    //setters y getters que vamos a utilizar
    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public Contacto(String nombre, int telefono, String email, Date fecha_nacimiento, String localidad, String cp) { //constructor sobrecargado con todos los atributos
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.fecha_nacimiento = fecha_nacimiento;
        this.localidad = localidad;
        this.cp = cp;
    }

    @Override
    public boolean equals(Object obj) { //establecemos el telefono como condicion unica (no pueden haber 2 iguales)
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contacto other = (Contacto) obj;
        return this.telefono == other.telefono;
    }

    @Override
    public String toString() { //Devuelve lo que obtendremos al intentar imprimir el objeto
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY"); //establecemos el formato para mostrar la fecha
        return "Contacto: " + "Nombre: " + nombre + ", Telefono: " + telefono + ", E-mail: " + email + ", Fecha de Nacimiento: " + sdf.format(fecha_nacimiento) + ", Localidad: " + localidad + ", CP: " + cp;
    }

}
