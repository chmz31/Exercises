/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import main.InterfazGraficaFormularioPersona;
import vista.AnyadirPanel;
import vista.VentanaFormulario;
import vista.WelcomePanel;

/**
 *
 * @author alessandro
 */
public class MenuController implements ActionListener {

    public VentanaFormulario vf;
    private AnyadirPanel ap;

    public MenuController(VentanaFormulario vf) {
        this.vf = vf;
    }

    public MenuController(AnyadirPanel ap) {
        this.ap = ap;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String action = ae.getActionCommand(); //accion del menu
        switch (action) {
            case "Anyadir":
                displayAnyadirPanel();
                break;
            case "Listar":
                break;
            case "About":
                displayWelcomePanel();
                break;
        }
    }

    private void displayWelcomePanel() {
        vf.setContentPane(new WelcomePanel());
        vf.validate();
    }

    private void displayAnyadirPanel() {
        AnyadirPanel ap2 = new AnyadirPanel();
        vf.setContentPane(ap2);
        vf.validate();
        MiControlador c = new MiControlador(ap2,InterfazGraficaFormularioPersona.dao); //implementar un nuevo controlador cada vez, pasandole el panel que mostraremos y el dao donde guardamos datos
    }

}
