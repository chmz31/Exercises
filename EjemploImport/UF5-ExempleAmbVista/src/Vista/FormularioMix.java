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
import javax.swing.JTextField;

/**
 *
 * @author alumne
 */
public class FormularioMix extends JFrame {

    public FormularioMix(String titulo) {
        super(titulo);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setElements();
    }

    private void setElements() {
        //PanelFecha
        JPanel pFecha = new JPanel();
        pFecha.setLayout(new FlowLayout());
        pFecha.add(new JTextField(2));
        pFecha.add(new JLabel("/"));
        pFecha.add(new JTextField(2));
        pFecha.add(new JLabel("/"));
        pFecha.add(new JTextField(4));
        //panelDatos
        JPanel pDatos = new JPanel();
        pDatos.setLayout(new GridLayout(3, 2));
        pDatos.add(new JLabel("Nombre: "));
        pDatos.add(new JTextField(20));
        pDatos.add(new JLabel("DNI: "));
        pDatos.add(new JTextField(9));
        pDatos.add(new JLabel("Fecha: "));
        pDatos.add(pFecha);
        //panelBotones
        JPanel pBotones = new JPanel();
        pBotones.setLayout(new FlowLayout());
        pBotones.add(new JButton("Aceptar"));
        pBotones.add(new JButton("Cancelar"));
        //seteamos container
        Container cp = getContentPane();
        cp.add(pDatos,BorderLayout.CENTER);
        cp.add(pBotones,BorderLayout.PAGE_END);
    }

}
