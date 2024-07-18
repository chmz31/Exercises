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
import javax.swing.JTextArea;

/**
 *
 * @author alessandro
 */

public class PanelListar extends JPanel {

    public JTextArea textarea;
    public static JButton botonlistar;

    public PanelListar() {
        initElements();
    }

    public void initElements() {
        setLayout(new BorderLayout());
        JLabel titulo = new JLabel("Listar datos: ");
        botonlistar = new JButton("Listar");
        textarea = new JTextArea(50, 50);
        updateTArea("yes");
        textarea.setEditable(false);
        //adds
        add(titulo, BorderLayout.NORTH);
        add(textarea, BorderLayout.CENTER);
        add(botonlistar, BorderLayout.SOUTH);

    }

    public void updateTArea(String text) {
        this.textarea.setText(text);
    }

}
