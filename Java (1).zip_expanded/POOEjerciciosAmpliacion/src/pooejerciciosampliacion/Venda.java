/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooejerciciosampliacion;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Venda {

    private int a;

    private int[] codi;
    private int[] preu;
    private String[] descripcio;
    private String dniClient;
    private String nomClient;
    private int[] quantitat;

    public Venda(int a) { 
        this.codi = new int[a];
        this.preu = new int[a];
        this.descripcio = new String[a];
        this.quantitat = new int[a];
    }

    public void setA(int a) {
        this.a = a;
    }

    public int[] getCodi() {
        return codi;
    }

    public void setCodi(int[] codi) {
        this.codi = codi;
    }

    public int[] getPreu() {
        return preu;
    }

    public void setPreu(int[] preu) {
        this.preu = preu;
    }

    public String[] getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String[] descripcio) {
        this.descripcio = descripcio;
    }

    public String getDniClient() {
        return dniClient;
    }

    public void setDniClient(String dniClient) {
        this.dniClient = dniClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public int[] getQuantitat() {
        return quantitat;
    }

    public void setQuantitat(int[] quantitat) {
        this.quantitat = quantitat;
    }

    @Override
    public String toString() {
        return "Venta a cliente " +nomClient +" , con dni: " +dniClient+"\nPrecio neto: "+calcularPrecioNeto()+"€\nPrecio final: "+calcularPrecioFinal()+"€\n"+listarArticulos();
        
    }
    
    

    public void rellenarArticulos() { //pide la informacion sobre la venda
        Random r1 = new Random();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < this.codi.length; i++) {
            this.codi[i] = r1.nextInt(1000);
            System.out.println("Introduce precio para articulo " + (i + 1) + ": ");
            this.preu[i] = scan.nextInt();
            System.out.println("Cuantos articulos " + (i + 1) + " vas a comprar?");
            this.quantitat[i] = scan.nextInt();
            scan.nextLine(); // limpiar buffer
            System.out.println("Describe brevemente el articulo "+(i+1));
            this.descripcio[i] = scan.nextLine();
        }
        
        System.out.print("Introduce tu nombre: ");
        this.nomClient = scan.nextLine();
        System.out.println("Introduce tu DNI: ");
        this.dniClient = scan.nextLine();
    }
    
    public int calcularPrecioNeto(){
    int precioNeto = 0;
        for (int i = 0; i < this.preu.length; i++) {
            precioNeto = precioNeto + (this.preu[i] * this.quantitat[i]);
        }
        return precioNeto;
    }
    
    public int calcularPrecioFinal(){
    return calcularPrecioNeto() + (calcularPrecioNeto() * 21 / 100);
    }
    
    public String listarArticulos(){ //imprime una lista de articulos para esta venda
        String lista = "Llista: ";
        for (int i = 0; i < this.codi.length; i++) {
            lista += "\ncodi "+this.codi[i]+" preu: "+this.preu[i]+"€ quantitat "+this.quantitat[i] +" totalArticle: "+(this.preu[i]*this.quantitat[i]+"€");
        }
        return lista;
    }
    
}
