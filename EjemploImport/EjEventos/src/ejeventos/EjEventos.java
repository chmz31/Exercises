/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejeventos;

import Controlador.MiControlador;
import Vista.VentanaBoton;

/**
 *
 * @author alumne
 */
public class EjEventos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaBoton v = new VentanaBoton("Ventana");
        MiControlador controlador = new MiControlador(v);
    }
    
}
