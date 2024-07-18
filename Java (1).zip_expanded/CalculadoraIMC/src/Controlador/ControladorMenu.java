/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.PanelBienvenida;
import Vista.PanelIMC;
import Vista.VentanaGeneral;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rsesen
 */
public class ControladorMenu implements ActionListener {

    VentanaGeneral ventana;

    public ControladorMenu(VentanaGeneral ventana) {
        this.ventana = ventana;
        mostrarPanelBienvenido();
        iniciarListener();
    }

    public void iniciarListener() {
        ventana.menuItemBienvenido.addActionListener(this);
        ventana.menuItemIMC.addActionListener(this);
        ventana.menuItemSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        switch (action) {
            case "bienvenido":
                mostrarPanelBienvenido();
                break;

            case "IMC":
                mostrarPanelIMC();
                break;

            case "salir":
                Salir();
                break;
        }
    }

    private void mostrarPanelBienvenido() { //funcion que se encarga de mostrar el panel de bienvenida
        PanelBienvenida bienvenida = new PanelBienvenida();
        ventana.setContentPane(bienvenida);
        ventana.validate();
    }

    private void mostrarPanelIMC() { //funcion que se encarga de mostrar el panel de calcular imc
        PanelIMC imc = new PanelIMC();
        ventana.setContentPane(imc);
        ControladorIMC controlador = new ControladorIMC(imc);
        ventana.validate();
    }

    private void Salir() {
        System.exit(0);
    }

}
