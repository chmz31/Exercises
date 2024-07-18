/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumnosgraficapp;

import Controlador.Controlador;
import Controlador.ControladorMenu;
import Model.DaoCole;
import Vista.VentanaApp;

/**
 *
 * @author rsesen
 */
public class AlumnosGraficApp {
public static DaoCole colegio = new DaoCole();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControladorMenu controller = new ControladorMenu(new VentanaApp(), colegio);
    }
    
}
