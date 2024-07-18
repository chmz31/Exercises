/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Model.DaoCole;
import Vista.PanelListar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alessandro
 */
class ControladorListar implements ActionListener {

    public DaoCole colegio;
    public PanelListar ventana;

    public ControladorListar(DaoCole colegio, PanelListar ventana) {
        this.colegio = colegio;
        this.ventana = ventana;
    }

    private void iniciarListener() {
        ventana.botonlistar.addActionListener(this);
        ventana.textarea.setText("A");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ventana.botonlistar == ae.getSource()) {
            ventana.updateTArea(colegio.listadoPersonas());
        }
    }

}
