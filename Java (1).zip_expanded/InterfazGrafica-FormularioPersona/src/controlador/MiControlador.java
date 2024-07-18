/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import Modelo.Persona;
import Modelo.PersonaDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.AnyadirPanel;
import vista.VentanaFormulario;

/**
 *
 * @author alumne
 */
public class MiControlador implements ActionListener {

    public AnyadirPanel ap;
    PersonaDAO lista;

    public MiControlador(AnyadirPanel ap, PersonaDAO lista) {
        VentanaFormulario v = new VentanaFormulario("Mi ventana");
        this.ap = ap;
        this.lista = lista;
        iniciarListener();
    }

    private void iniciarListener() {
        ap.bReset.addActionListener(this);
        ap.bGuardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == ap.bReset) { //boton reset
            ap.tfNombre.setText("");
            ap.tfEdad.setText("");
            ap.tfApellido.setText("");
            ap.lResult.setText("");

        }
        if (ap.bGuardar == ae.getSource()) { //boton guardar
            guardarDatos();
        }
    }

    private void guardarDatos() {
        Persona aux;
        try {
            String nombre = ap.tfNombre.getText();
            String apellidos = ap.tfApellido.getText();
            int edad = Integer.valueOf(ap.tfEdad.getText());
            aux = new Persona(nombre, edad, apellidos);
            ap.lResult.setText("Resultado: " + aux);
            lista.addPersona(aux);
        } catch (Exception ex) {
            ap.lResult.setText("Error: " + ex.getMessage());
        }
    }

}
