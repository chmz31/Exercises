/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author alessandro
 */
public class PanelBienvenida extends JPanel {

    public JButton boton;
    public JLabel textoBienvenida;

    public PanelBienvenida() {
        initElements();
    }

    private void initElements() {
        setLayout(new BorderLayout());
        //Panel 1: Norte
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        textoBienvenida = new JLabel("Bienvenida a La Buena Salud");
        panel1.add(textoBienvenida);
        //add paneles
        add(panel1, BorderLayout.CENTER);
    }
}
