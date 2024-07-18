/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author alumne
 */
public class VentanaGridLayout extends JFrame {

    public VentanaGridLayout(String titulo) {
        super(titulo);
        setParameters();
    }

    private void setParameters() {
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setElements();
    }

    private void setElements() {
        Container cp = getContentPane();
        GridLayout gl = new GridLayout(4, 3); //pide filas,columnas
        cp.setLayout(gl);
        //botones numeros
        for (int i = 1; i <= 9; i++) {
            cp.add(new JButton(String.valueOf(i)));
        }
        //añadimos los 3 ultimos a mano
        cp.add(new JButton("0"));
        cp.add(new JButton("+"));
        cp.add(new JButton("-"));
        

    }

}
