/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.herenciasupermercado;

/**
 *
 * @author alumne
 */
public class POOHerenciaSupermercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArticuloAlimentarioRefrigerado ar1 = new ArticuloAlimentarioRefrigerado(5.0,"17/05/2018","Yogurt","Danone",100.0,"1234567890123");//creamos un articulo alimnetario refrigerado
        System.out.println("PVP article congelat: "+ar1.getPVP()+" €");
        ArticuloVestir av1 = new ArticuloVestir(26, "Tejanos","H&M",100.0,"12345678002"); //creamos un articulo prenda de vestir
        System.out.println("PVP articulo vestir: "+av1.getPVP()+" €");

    }

}
