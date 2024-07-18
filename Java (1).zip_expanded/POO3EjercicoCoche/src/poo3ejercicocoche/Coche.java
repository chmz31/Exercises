/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo3ejercicocoche;

/**
 *
 * @author alumne
 */
public class Coche {
    private int num_ruedas;
    private String marca;

    public Coche() {
    }

    public Coche(int num_ruedas) {
        this.num_ruedas = num_ruedas;
    }

    public Coche(String marca) {
        this.marca = marca;
    }

    public Coche(int num_ruedas, String marca) {
        this.num_ruedas = num_ruedas;
        this.marca = marca;
    }

    public int getNum_ruedas() {
        return num_ruedas;
    }

    public void setNum_ruedas(int num_ruedas) {
        this.num_ruedas = num_ruedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "El coche " + "tiene " + num_ruedas + " ruedas y es de la marca " + marca;
    }
    
    
}
