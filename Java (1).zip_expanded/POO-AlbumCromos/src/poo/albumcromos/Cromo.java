/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.albumcromos;

/**
 *
 * @author alumne
 */
public class Cromo {
    private int num; //el numero del cromo
    private String nombre; //el nombre del futbolista
    private String equipo; //el nombre del equipo
    private int cantidad; //cantidad de cromos repetidos que tenemos.

    public Cromo(int num) { //constructor sobrecargado con el numero del cromo
        this.num = num;
        this.cantidad = 1;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void addCantidad(int cantidad) {
        this.cantidad += cantidad;
    }

    @Override
    public String toString() {
        return "num: " + num + ", nombre: " + nombre + ", equipo: " + equipo + ", cantidad: " + cantidad;
    }

    @Override
    public boolean equals(Object obj) {
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
        return this.num == other.num;
    }
    
    
}
