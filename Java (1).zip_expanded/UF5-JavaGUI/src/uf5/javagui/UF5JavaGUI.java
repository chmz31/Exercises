/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf5.javagui;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author alumne
 */
public class UF5JavaGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Titulo de ventana");
        ventana.setSize(800, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        //AÑADIR HOLA MUNDO
        JLabel label = new JLabel("Hola Mundo");
        ventana.getContentPane().add(label);
    }

}
