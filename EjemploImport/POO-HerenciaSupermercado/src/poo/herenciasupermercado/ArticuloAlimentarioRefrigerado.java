/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.herenciasupermercado;

/**
 *
 * @author alumne
 */
public class ArticuloAlimentarioRefrigerado extends ArticuloAlimentario {
    protected double temperaturaConservacio;

    public ArticuloAlimentarioRefrigerado(double temperaturaConservacio, String data, String nombre, String fabricante, double precio, String codiEAN) {
        super(data, nombre, fabricante, precio, codiEAN);
        this.temperaturaConservacio = temperaturaConservacio;
    }
    
}
