/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author alessandro
 */
public class PanelModificar extends JPanel {

    public JTextField tfnombre, tfnombremod, tfapellido, tfedad;
    public JButton btBuscar, btModificar;
    public JComboBox combo;

    public PanelModificar() {
        initElements();
    }

    private void initElements() {
        //Panel1: Central (Main)
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        //SubPanel1 (Buscar Persona)
        JPanel panel1_1 = new JPanel();
        JLabel lb_name = new JLabel("Nombre: ");
        tfnombre = new JTextField(10);
        btBuscar = new JButton("Buscar");
        panel1_1.add(lb_name);
        panel1_1.add(tfnombre);
        panel1_1.add(btBuscar);
        panel1.add(panel1_1);

        //Panel2: Datos modificar
        JPanel panel2 = new JPanel();
        JLabel lbnamemod = new JLabel("Nombre: ");
        tfnombremod = new JTextField(8);
        JLabel lbapellido = new JLabel("Apellidos: ");
        tfapellido = new JTextField(8);
        JLabel lbedad = new JLabel("Edad: ");
        tfedad = new JTextField(8);
        panel2.add(lbnamemod);
        panel2.add(tfnombremod);
        panel2.add(lbapellido);
        panel2.add(tfapellido);
        panel2.add(lbedad);
        panel2.add(tfedad);

        //Panel3 ComboBox
        JPanel panel3 = new JPanel();
        JLabel lbciclo = new JLabel("\nCiclo: ");
        combo = new JComboBox();
        combo.addItem("ASIX");
        combo.addItem("DAM");
        combo.addItem("DAW");
        panel3.add(lbciclo);
        panel3.add(combo);

        //Pabel4 boton modif
        JPanel panel4 = new JPanel();
        btModificar = new JButton("Modificar");
        panel4.add(btModificar);

        //adds
        setLayout(new GridLayout(4, 1));
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
    }

}
