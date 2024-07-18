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
    public JMenuItem menuItemAnyadir, menuItemListar, menuItemAbout, menuItemEsborrar, menuItemModificar, menuItemBuscar;

    public VentanaGeneral() {
        super("Personas Grafics App");
        setSize(600, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        anyadirMenu();
        setResizable(false);
        setVisible(true);
    }

    public void anyadirMenu() {

        menuBar = new JMenuBar();
        JMenu menu;

        //file menu
        menu = new JMenu("Options");
        menuItemAnyadir = new JMenuItem("Añadir");
        menuItemAnyadir.setActionCommand("anyadir");
        menu.add(menuItemAnyadir);

        menuItemListar = new JMenuItem("Listar");
        menuItemListar.setActionCommand("listar");
        menu.add(menuItemListar);

        menuItemEsborrar = new JMenuItem("Esborrar");
        menuItemEsborrar.setActionCommand("esborrar");
        menu.add(menuItemEsborrar);
        
        menuItemModificar = new JMenuItem("Modificar");
        menuItemModificar.setActionCommand("modificar");
        menu.add(menuItemModificar);
        
        menuItemBuscar = new JMenuItem("Buscar");
        menuItemBuscar.setActionCommand("buscar");
        menu.add(menuItemBuscar);
        menuBar.add(menu);

        //options menu
        menu = new JMenu("Help");
        menuItemAbout = new JMenuItem("About");
        menuItemAbout.setActionCommand("about");
        menu.add(menuItemAbout);
        menuBar.add(menu);

        //añado barra del menu
        setJMenuBar(menuBar);
    }
}
