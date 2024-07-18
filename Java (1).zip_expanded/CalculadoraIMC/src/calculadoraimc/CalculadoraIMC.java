/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraimc;

import Controlador.ControladorMenu;
import Vista.VentanaGeneral;

/**
 *
 * @author alessandro
 */
public class CalculadoraIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaGeneral ventana = new VentanaGeneral(); //iniciamos la app con la ventana general
        ControladorMenu controller = new ControladorMenu(ventana); //inciamos el controlador que controla nuestro menu desplegable
    }

}
