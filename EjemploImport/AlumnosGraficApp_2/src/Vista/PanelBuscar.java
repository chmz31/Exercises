/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author alessandro
 */
public class PanelBuscar extends JPanel {

    public JButton boton;
    public JLabel texto;

    public PanelBuscar() {
        initElements();
    }

    private void initElements() {
        //Panel 1: Norte
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        texto = new JLabel("Persona a buscar: ");
        boton = new JButton("boton");
        panel1.add(texto);
        panel1.add(boton);
        //add paneles
        add(panel1, BorderLayout.NORTH);
    }
}
