/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.VentanaBoton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author alumne
 */
public class MiControlador implements ActionListener {

    VentanaBoton vista;

    public MiControlador(VentanaBoton vista) {
        this.vista = vista;
        iniciarListener(); //Indicamos que objetos escuchar
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String aux = vista.texto.getText();
        int pos = aux.lastIndexOf(":");
        int num = Integer.valueOf(aux.substring(pos + 1));
        vista.texto.setText("Pulsaciones:" + (num + 1));
        if (ae.getSource() == vista.boton_reset){
         vista.texto.setText("Pulsaciones:0");
        }
        
    }

    private void iniciarListener() {
        vista.boton.addActionListener(this);
        vista.boton_reset.addActionListener(this);

    }

}
