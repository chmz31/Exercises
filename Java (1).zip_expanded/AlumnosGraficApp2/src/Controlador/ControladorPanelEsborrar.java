/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Model.DaoCole;
import Model.Persona;
import Vista.PanelEsborrar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alessandro
 */
class ControladorPanelEsborrar implements ActionListener {

    PanelEsborrar vista;
    DaoCole modelo;

    public ControladorPanelEsborrar(PanelEsborrar ventana, DaoCole cole) {
        this.vista = ventana;
        this.modelo = cole;
        iniciarListener();
    }

    private void iniciarListener() {
        vista.btBorrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (vista.btBorrar == ae.getSource()) { //cuando pulsamos borrar buscamos las personas con ese nombre y las borramos
            Persona aux = buscarPersona(vista.tfnombre.getText());
            vista.lb_encotrado.setText("Encontrado: " + aux);
            modelo.eliminarPersona(vista.tfnombre.getText());
        }
    }

    public Persona buscarPersona(String nombre) {
        return modelo.buscarPersona(nombre);
    }

}
