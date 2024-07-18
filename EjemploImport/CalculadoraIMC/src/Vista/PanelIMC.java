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
public class PanelIMC extends JPanel {

    public JLabel lb_name, lb_peso, lb_altura, lb_imc, lb_clase;
    public JTextField tf_name, tf_peso, tf_altura;
    public JButton bt_calcular;

    public PanelIMC() {
        initElements();
    }

    private void initElements() {
        setLayout(new GridLayout(2, 3));
        //Panel 1: Norte
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3, 2));
        lb_name = new JLabel("Nombre: ");
        tf_name = new JTextField(10);
        lb_altura = new JLabel("Altura: (m)");
        tf_altura = new JTextField(8);
        lb_peso = new JLabel("Peso: (kg)");
        tf_peso = new JTextField(8);

        panel1.add(lb_name);
        panel1.add(tf_name);
        panel1.add(lb_altura);
        panel1.add(tf_altura);
        panel1.add(lb_peso);
        panel1.add(tf_peso);

        //Panel 2: central
        JPanel panel2 = new JPanel();
        bt_calcular = new JButton("Calcular");
        panel2.add(bt_calcular);

        //Panel 3: sur
        JPanel panel3 = new JPanel();
        lb_imc = new JLabel("IMC: ");
        lb_clase = new JLabel("");
        panel3.add(lb_imc);
        panel3.add(lb_clase);

        //add general
        add(panel1);
        add(panel2);
        add(panel3, BorderLayout.SOUTH);

    }
}
