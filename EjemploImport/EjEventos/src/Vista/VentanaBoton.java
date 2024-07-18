/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author alumne
 */
public class VentanaBoton extends JFrame {

    public JButton boton;
    public JButton boton_reset;
    public JLabel texto;

    public VentanaBoton(String titulo) {
        super(titulo);
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setElements();
        setVisible(true);
    }

    private void setElements() {
        JPanel principal = new JPanel();
        principal.setLayout(new FlowLayout());
        JPanel contador = new JPanel();
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(2,2));
        boton = new JButton("Pulsame");
        boton_reset = new JButton("Reiniciar");
        texto = new JLabel("Pulsaciones:0");
        principal.add(boton);
        principal.add(boton_reset);
        contador.add(texto);
        cp.add(principal);
        cp.add(contador);
        
    }

}
