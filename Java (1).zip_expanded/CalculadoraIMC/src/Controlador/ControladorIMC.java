/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Persona;
import Vista.PanelIMC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alessandro
 */
public class ControladorIMC implements ActionListener {
    
    PanelIMC ventana;
    
    public ControladorIMC(PanelIMC ventana) {
        this.ventana = ventana;
        iniciarListener();
    }
    
    private void iniciarListener() {
        ventana.bt_calcular.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ventana.bt_calcular == ae.getSource()) {
            String nombre = ventana.tf_name.getText();
            double altura = Double.valueOf(ventana.tf_altura.getText());
            double peso = Double.valueOf(ventana.tf_peso.getText());
            Persona p = new Persona(nombre, altura, peso);
            ventana.lb_imc.setText("IMC: " + p.calcularIndiceIMC());
            ventana.lb_clase.setText("Clase: " + p.interpretarIndiceIMC(p.calcularIndiceIMC()));
        }
    }
    
}
