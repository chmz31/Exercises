/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.herenciasupermercado;

/**
 *
 * @author alumne
 */
public class ArticuloAlimentario extends Articulo {

    private String data;

    public ArticuloAlimentario(String data, String nombre, String fabricante, double precio, String codiEAN) {
        super(nombre, fabricante, precio, codiEAN);
        this.data = data;
    }

    @Override
    public double getPVP() {
        return this.precio + ((this.precio * 4) / 100);
    }
}
