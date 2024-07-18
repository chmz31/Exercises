/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Model.DaoCole;
import Model.Persona;
import Vista.PanelAnyadir;
import Vista.VentanaApp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rsesen
 */
public class Controlador implements ActionListener {

    PanelAnyadir ventana;
    DaoCole cole;

    public Controlador(PanelAnyadir ventana, DaoCole cole) {
        this.ventana = ventana;
        this.cole = cole;
        iniciarListener();
    }

    private void iniciarListener() {
        ventana.btReset.addActionListener(this);
        ventana.btGuardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (ventana.btReset == e.getSource()) {
            ventana.tfnombre.setText("");
            ventana.tfapellidos.setText("");
            ventana.tfedad.setText("");
        }

        if (ventana.btGuardar == e.getSource()) {
            guardarDatos();
        }
        if (ventana.btListar == e.getSource()) {
            listarDatos();
        }
    }

    private void guardarDatos() {
        Persona p = null;
        try {
            String nombre = ventana.tfnombre.getText();
            String apellidos = ventana.tfapellidos.getText();
            int edad = Integer.valueOf(ventana.tfedad.getText());
            String ciclo = (String) ventana.combo.getSelectedItem();
            p = new Persona(nombre, apellidos, edad, ciclo);
            imprimirDatosEnPantalla(p);
            cole.anyadirPersona(p);

        } catch (Exception e) {
            ventana.resultado.setText(e.getMessage());
        }

    }

    private void imprimirDatosEnPantalla(Persona p) {
        ventana.resultado.setText(p.toString());
    }

    private void listarDatos() {
        ventana.resultado.setText(cole.listadoPersonas());
    }

}
