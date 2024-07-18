/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf6.exam;

import Controlador.ControladorMenu;
import Persistencia.DAOPaciente;

/**
 *
 * @author alessandro
 */
public class UF6Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UF6Exam app = new UF6Exam();
        app.run();
    }

    private void run() {
        //instanciamos los objetos
        DAOPaciente dao = new DAOPaciente();
        ControladorMenu controlador = new ControladorMenu(dao);
    }

}
