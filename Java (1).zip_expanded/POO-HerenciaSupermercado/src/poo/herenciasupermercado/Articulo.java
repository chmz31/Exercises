/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.herenciasupermercado;

/**
 *
 * @author alumne
 */
public class Articulo {

    protected String nombre;
    protected String fabricante;
    protected double precio;
    protected String codiEAN;

    public Articulo(String nombre, String fabricante, double precio, String codiEAN) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.precio = precio;
        this.codiEAN = codiEAN;
    }

    public double getPVP() {
        return this.precio + ((this.precio * 21) / 100);
    }
}
