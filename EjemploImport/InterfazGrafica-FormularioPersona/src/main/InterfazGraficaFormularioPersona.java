/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Modelo.PersonaDAO;
import controlador.MiControlador;
import vista.AnyadirPanel;
import vista.VentanaFormulario;

/**
 *
 * @author alumne
 */
public class InterfazGraficaFormularioPersona {

    /**
     * @param args the command line arguments
     */
    public static AnyadirPanel ap = new AnyadirPanel();
    public static PersonaDAO dao = new PersonaDAO();

    public static void main(String[] args) {
        MiControlador controlador = new MiControlador(ap, dao);
    }

}
