/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.examenuf4.pkg2;

import java.util.Objects;

/**
 *
 * @author alumne
 */
public abstract class Vehicle {

    protected String marca;
    protected String model;
    protected String motor;
    protected int nRodes;
    protected int nEixos;

    public Vehicle(String marca, String model, String motor, int nRodes, int nEixos) { //constructor sobrecargat
        this.marca = marca;
        this.model = model;
        this.motor = motor;
        this.nRodes = nRodes;
        this.nEixos = nEixos;
    }

    //metodes abstractes
    public abstract void endavant();

    public abstract void aturar();

    public abstract void girar();

    //getter model y marca
    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object obj) { //dos vehicles son iguals si tenen la mateixa marca y model
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehicle other = (Vehicle) obj;
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        return Objects.equals(this.model, other.model);
    }

    @Override
    public String toString() { //metode per a imprimir els vehicles
        return "marca: " + marca + " modelo: " + model;
    }

}
