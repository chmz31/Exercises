/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2ejercicocilindro;

/**
 *
 * @author alumne
 */
public class Cilindro {

    private double radio;
    private double altura;
     
    public double getR() {
        return radio;
    }

    public void setR(double r) {
        this.radio = r;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Cilindro(double r, double altura) {
        this.radio = r;
        this.altura = altura;
    }
    
    public double calcularAreaLateral(double radio, double altura){
    return 2 * Math.PI * radio * altura;
    }
    
    public double calcularAreaBase(double radio){
    return Math.PI * Math.pow(radio, 2);
    }
    
    public double calcularAreaTotal(double radio, double altura){ 
    return (calcularAreaLateral(radio, altura)) + (2 * calcularAreaBase(radio));
    }
    
    public double calcularVolumen(double radio, double altura){
    return Math.PI * altura * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "Tu cilindro de radio: " + radio + " y altura: " + altura + "\ntiene una Area lateral de "+calcularAreaLateral(radio, altura)+"\ntiene una Area de la base de "+calcularAreaBase(radio)+"\ntiene una Area total de "+calcularAreaTotal(radio, altura)+
                "\ny un Volumen de: "+calcularVolumen(radio, altura);
        
    }
    
    
}
