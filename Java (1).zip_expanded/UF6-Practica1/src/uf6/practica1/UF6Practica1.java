/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf6.practica1;

import Controlador.ControladorMenu;
import Persistencia.DAOPelicula;

/**
 *
 * @author alessandro
 */
public class UF6Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UF6Practica1 app = new UF6Practica1();
        app.run();
    }

    private void run() {
        DAOPelicula dao = new DAOPelicula();
        ControladorMenu controlador = new ControladorMenu(dao);
    }

}
