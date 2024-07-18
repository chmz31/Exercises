/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.herenciasupermercado;

/**
 *
 * @author alumne
 */
public class ArticuloVestir extends Articulo {
    private double talla;

    public ArticuloVestir(double talla, String nombre, String fabricante, double precio, String codiEAN) {
        super(nombre, fabricante, precio, codiEAN);
        this.talla = talla;
    }
    
    @Override
    public double getPVP(){
    if (this.talla >= 20 && this.talla <= 30){
    return 0.9 * this.precio;
    }else if (this.talla > 30 && this.talla <= 40){
    return 0.8 * this.precio;
    }else {
    return this.precio;
    }
    }
}
