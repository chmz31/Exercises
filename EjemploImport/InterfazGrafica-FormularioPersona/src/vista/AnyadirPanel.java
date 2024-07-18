package vista;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import controlador.MenuController;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author alessandro
 */
public class AnyadirPanel extends JPanel {

    public JButton bGuardar, bReset;
    public JTextField tfNombre, tfApellido, tfEdad;
    public JLabel lResult;
    public JMenu mFunciones;
    public JMenuItem miAnyadir, miListar;

    public AnyadirPanel() {
        initComponents();
    }

    private void initComponents() {
        //PanelTitulo
        JPanel pTitulo = new JPanel();
        pTitulo.setLayout(new FlowLayout());
        JLabel titulo = new JLabel("Introducir datos");
        pTitulo.add(titulo);
        //panelDatos
        JPanel pDatos = new JPanel();
        pDatos.setLayout(new GridLayout(2, 4));
        pDatos.add(new JLabel("Nombre: "));
        tfNombre = new JTextField(8);
        pDatos.add(tfNombre);
        pDatos.add(new JLabel("Apellido: "));
        tfApellido = new JTextField(8);
        pDatos.add(tfApellido);
        pDatos.add(new JLabel("Edad: "));
        tfEdad = new JTextField(8);
        pDatos.add(tfEdad);
        pDatos.add(new JLabel("Ciclo: "));
        JComboBox boxCiclos = new JComboBox();
        boxCiclos.addItem("DAM");
        boxCiclos.addItem("DAW");
        boxCiclos.addItem("ASIX");
        pDatos.add(boxCiclos);
        //panelBotones
        JPanel pBotones = new JPanel();
        pBotones.setLayout(new FlowLayout());
        bGuardar = new JButton("Guardar");
        pBotones.add(bGuardar);
        bReset = new JButton("Reset");
        pBotones.add(bReset);
        //panelResultado
        JPanel pResult = new JPanel();
        lResult = new JLabel("");
        pResult.add(lResult);

        //seteamos container
        add(pTitulo, BorderLayout.NORTH);
        add(pDatos, BorderLayout.CENTER);
        add(pBotones, BorderLayout.SOUTH);
        add(pResult, BorderLayout.EAST);
    }

}
