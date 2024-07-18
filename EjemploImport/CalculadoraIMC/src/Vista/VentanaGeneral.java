/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author rsesen
 */
public class VentanaGeneral extends JFrame {

    public JMenuBar menuBar;
    public JMenuItem menuItemBienvenido, menuItemIMC, menuItemSalir;

    public VentanaGeneral() { //constructor de la ventana
        super("Buena Salud App");
        setSize(600, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Menu();
        setResizable(false);
        setVisible(true);
    }

    public void Menu() {

        menuBar = new JMenuBar();
        JMenu menu;

        //file menu
        menu = new JMenu("Paneles");
        menuItemBienvenido = new JMenuItem("Bienvenido");
        menuItemBienvenido.setActionCommand("bienvenido");
        menu.add(menuItemBienvenido);

        menuItemIMC = new JMenuItem("IMC");
        menuItemIMC.setActionCommand("IMC");
        menu.add(menuItemIMC);

        menuItemSalir = new JMenuItem("Salir");
        menuItemSalir.setActionCommand("salir");
        menu.add(menuItemSalir);
        menuBar.add(menu);

        //añado barra del menu
        setJMenuBar(menuBar);
    }
}
