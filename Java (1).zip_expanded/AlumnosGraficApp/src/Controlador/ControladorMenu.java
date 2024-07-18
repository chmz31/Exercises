/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Model.DaoCole;
import Vista.PanelAnyadir;
import Vista.PanelListar;
import Vista.VentanaApp;
import Vista.WellcomePanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author rsesen
 */
public class ControladorMenu implements ActionListener {
    private  DaoCole colegio;
    VentanaApp ventana;
    
    public ControladorMenu(VentanaApp ventana, DaoCole colegio){
        this.ventana = ventana;
        this.colegio = colegio;
        iniciarListener();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String action = e.getActionCommand();
        switch (action) {
            case "anyadir":
                mostrarAnyadirPanel();
                break;

            case "about":
                mostrarWellcomePanel();
                break;
                
            case "listar":
                mostrarListarPanel();
                break;
        }
    }

    private void mostrarWellcomePanel() {
        ventana.setContentPane(new WellcomePanel());
        ventana.validate();
    }
    private void mostrarAnyadirPanel(){
        PanelAnyadir afegir = new PanelAnyadir();
        Controlador control = new Controlador(afegir,colegio);
        ventana.setContentPane(afegir);
        ventana.validate();
        
    }

    private void mostrarListarPanel() {
        PanelListar listar = new PanelListar();
        ControladorListar control = new ControladorListar(colegio,listar);
        ventana.setContentPane(listar);
        ventana.validate();
    }

    private void iniciarListener() {
        this.ventana.menucontrol = this;
    }
    
}
