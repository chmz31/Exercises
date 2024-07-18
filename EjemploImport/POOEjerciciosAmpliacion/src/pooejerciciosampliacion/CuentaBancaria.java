/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooejerciciosampliacion;

/**
 *
 * @author alumne
 */
public class CuentaBancaria {
    //variables del objeto
    private String titular;
    private int saldo;
    private String tipoInteres;
    
    //Getters & Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(String tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
    
    public void ingresarSaldo(int cantidad){ //metodo que Aumenta el saldo en el valor que le pasamos
    this.saldo+=cantidad;
    }
    
    public void reintegro(int cantidad){//metodo que Reduce el saldo en el valor que le pasamos
    this.saldo-=cantidad;
    }
    
    public void transferencia(CuentaBancaria objetivo, int cantidad){ //establecemos una cuenta objetivo y la cantidad a enviar y transferimos el saldo entre cuentas
    this.saldo-=cantidad;
    objetivo.saldo+=cantidad;
    }

    @Override
    public String toString() {
        return "titular: " + titular + ", saldo: " + saldo;
    }
    
    
}
