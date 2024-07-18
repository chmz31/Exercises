/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author alessandro
 */
public class Country {
    private int id;
    private String name;
    private String capital;
    private double inhabitants;
    private double surface;
    private double pib;
    private double esp_vida;

    public Country() {//constructor vacio
    }

    public Country(int id) {//constructor sobrecargado con id
        this.id = id;
    }

    public Country(int id, String name, String capital, double inhabitants, double surface, double pib, double esp_vida) { //constructor sobrecargado con todos los metodos
        this.id = id;
        this.name = name;
        this.capital = capital;
        this.inhabitants = inhabitants;
        this.surface = surface;
        this.pib = pib;
        this.esp_vida = esp_vida;
    }
    
    
    //setters & getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public double getPib() {
        return pib;
    }

    public void setPib(double pib) {
        this.pib = pib;
    }

    public double getEsp_vida() {
        return esp_vida;
    }

    public void setEsp_vida(double esp_vida) {
        this.esp_vida = esp_vida;
    }

    @Override
    public String toString() {
        return "Country[ " + "id=" + id + ", name=" + name + ", capital=" + capital + ", surface=" + surface + ", pib=" + pib + ", esp_vida=" + esp_vida + " ]";

    }

    @Override
    public boolean equals(Object obj) { //SON IGUALES SI COINCIDEN EN ID
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Country other = (Country) obj;
        return this.id == other.id;
    }

}
