/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Model.DaoCole;
import Model.Persona;
import Vista.PanelModificar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alessandro
 */
class ControladorPanelModificar implements ActionListener {

    PanelModificar ventana;
    DaoCole modelo;

    public ControladorPanelModificar(PanelModificar ventana, DaoCole modelo) {
        this.ventana = ventana;
        this.modelo = modelo;
        iniciarListener();
    }

    private void iniciarListener() {
        ventana.btBuscar.addActionListener(this);
        ventana.btModificar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ventana.btBuscar == ae.getSource()) { //cuando pulsamos borrar buscamos las personas con ese nombre y las borramos
            Persona aux = modelo.buscarPersona(ventana.tfnombre.getText());
            ventana.tfnombremod.setText(aux.getNombre());
            ventana.tfapellido.setText(aux.getApellidos());
            ventana.tfedad.setText(String.valueOf(aux.getEdad()));
            ventana.combo.setSelectedItem(aux.getCiclo());
        }
        if (ventana.btModificar == ae.getSource()) {
            Persona aux = modelo.buscarPersona(ventana.tfnombre.getText());
            aux.setNombre(ventana.tfnombremod.getText());
            aux.setApellidos(ventana.tfapellido.getText());
            aux.setEdad(Integer.valueOf(ventana.tfedad.getText()));
            aux.setCiclo(ventana.combo.getSelectedItem().toString());
        }
    }

}
