/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author alumne
 */
public class Ventana extends JFrame {

    public Ventana() {
        super();
        setParameters();
    }

    public Ventana(String titulo) {
        super(titulo);
        setParameters();
    }

    private void setParameters() {
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setElements();
    }

    private void setElements() {
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JLabel label = new JLabel("Nombre:");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("Saludar");
        cp.add(label);
        cp.add(texto);
        cp.add(boton);
    }

}
