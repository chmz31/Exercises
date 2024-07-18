/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Model.DaoCole;
import Vista.PanelAnyadir;
import Vista.PanelBuscar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alessandro
 */
class ControladorPanelBuscar implements ActionListener {

    private PanelBuscar vista;
    private DaoCole modelo;

    public ControladorPanelBuscar(PanelBuscar vista, DaoCole cole) {
        this.vista = vista;
        this.modelo = cole;
        iniciarListener();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
     if (vista.boton == ae.getSource()) {
     vista.texto.setText("Hola");
     }
    }

    private void iniciarListener() {
        vista.boton.addActionListener(this);
    }

}
