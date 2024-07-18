/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.ControladorMenu;
import alumnosgraficapp.AlumnosGraficApp;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author rsesen
 */
public class VentanaApp extends JFrame {

    public JMenuBar menuBar;
    public JMenuItem menuItem;
    public ControladorMenu menucontrol;
    //añado paneles
    public PanelAnyadir panel1;

    public VentanaApp() {
        super("Personas Grafics App");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        anyadirMenu();
        setResizable(false);
        setVisible(true);
    }

    public void anyadirMenu() {
        menucontrol = new ControladorMenu(this, AlumnosGraficApp.colegio);
        menuBar = new JMenuBar();
        JMenu menu;

        //file menu
        menu = new JMenu("Options");
        menuItem = new JMenuItem("Añadir");
        menuItem.setActionCommand("anyadir");
        menuItem.addActionListener(menucontrol);
        menu.add(menuItem);

        menuItem = new JMenuItem("Listar");
        menuItem.setActionCommand("listar");
        menuItem.addActionListener(menucontrol);
        menu.add(menuItem);
        menuBar.add(menu);

        //options menu
        menu = new JMenu("Help");
        menuItem = new JMenuItem("About");
        menuItem.setActionCommand("about");
        menuItem.addActionListener(menucontrol);
        menu.add(menuItem);
        menuBar.add(menu);

        //añado barra del menu
        setJMenuBar(menuBar);
    }

}
