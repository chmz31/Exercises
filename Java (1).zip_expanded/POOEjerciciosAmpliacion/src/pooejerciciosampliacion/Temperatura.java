/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooejerciciosampliacion;

/**
 *
 * @author alumne
 */
public class Temperatura {
    private double temp;

    public Temperatura() {;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
    
    public double celsiusToFahrenheit(){ //funcion que calcula la conversion Cº a Fº
    return (temp * 9 / 5) + 32;
    }
    
    public double fahrenheitToCelsius(){ //funcion que calcula la conversion Fº a Cº
    return ((temp - 32) * 5 / 9);
    }
    
    
}
