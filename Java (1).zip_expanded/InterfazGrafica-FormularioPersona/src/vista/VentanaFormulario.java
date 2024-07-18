/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.MenuController;
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
 * @author alumne
 */
public class VentanaFormulario extends JFrame {

    public JMenu mFunciones;
    public JMenuItem miAnyadir, miListar;

    public MenuController mc;

    public VentanaFormulario(String titulo) {
        super(titulo);
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setElements();
        setResizable(false);
        this.setVisible(true);
    }

    private void setElements() {
        mc = new MenuController(this);
        JPanel pMenu = new JPanel();
        JMenuBar menuBar = new JMenuBar();
        mFunciones = new JMenu("Opciones");
        miAnyadir = new JMenuItem("Anyadir");
        miAnyadir.setActionCommand("Anyadir");
        miAnyadir.addActionListener(mc);
        mFunciones.add(miAnyadir);
        miListar = new JMenuItem("Listar");
        miListar.setActionCommand("Listar");
        miListar.addActionListener(mc);
        mFunciones.add(miListar);
        pMenu.add(mFunciones);
        menuBar.add(mFunciones);
        setJMenuBar(menuBar);
        //menuAbout
        JMenu mAbout = new JMenu("About");
        JMenuItem item = new JMenuItem("About");
        item.setActionCommand("About");
        item.addActionListener(mc);
        pMenu.add(mAbout);
        mAbout.add(item);
        menuBar.add(mAbout);
        setJMenuBar(menuBar);
        //seteamos container
        Container cp = getContentPane();
        cp.add(pMenu, BorderLayout.WEST);
    }
}
