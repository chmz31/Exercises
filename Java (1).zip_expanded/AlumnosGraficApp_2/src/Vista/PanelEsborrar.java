/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author alessandro
 */
public class PanelEsborrar extends JPanel {

    public JTextField tfnombre;
    public JLabel lb_encotrado;
    public JButton btBorrar;

    public PanelEsborrar() {
        initElements();
    }

    private void initElements() {
        //Panel1: Central
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(2, 1));
        //subpanel 1
        JPanel panel1_1 = new JPanel();
        JLabel lb_name = new JLabel("Nombre: ");
        tfnombre = new JTextField(10);
        panel1_1.add(lb_name);
        panel1_1.add(tfnombre);
        //subpanel2
        JPanel panel1_2 = new JPanel();
        lb_encotrado = new JLabel("Encontrado: ");
        panel1_2.add(lb_encotrado);
        //adds panel general
        panel1.add(panel1_1);
        panel1.add(panel1_2);

        //Panel2: BajoNombre
        JPanel panel2 = new JPanel();
        btBorrar = new JButton("Borrar");
        panel2.add(btBorrar);
        //add paneles
        setLayout(new GridLayout(2, 1));
        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.SOUTH);
    }
}
