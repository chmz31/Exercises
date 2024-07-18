/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author alumne
 */
public class VentanaBorderLayout extends JFrame {

    public VentanaBorderLayout(String titulo) {
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
        cp.setLayout(new BorderLayout());
        //iniciamos etiquetas
        JLabel[] etiquetas = new JLabel[5];
        etiquetas[0] = new JLabel("Etiqueta A");
        etiquetas[0].setHorizontalAlignment(SwingConstants.CENTER);
        etiquetas[1] = new JLabel("Etiqueta B");
        etiquetas[1].setHorizontalAlignment(SwingConstants.CENTER);
        etiquetas[1].setBackground(Color.RED);
        etiquetas[1].setOpaque(true);
        etiquetas[2] = new JLabel("Etiqueta C");
        etiquetas[2].setHorizontalAlignment(SwingConstants.CENTER);
        etiquetas[2].setBackground(Color.YELLOW);
        etiquetas[2].setOpaque(true);
        etiquetas[3] = new JLabel("Etiqueta D");
        etiquetas[3].setHorizontalAlignment(SwingConstants.CENTER);
        etiquetas[3].setBackground(Color.RED);
        etiquetas[3].setOpaque(true);
        etiquetas[4] = new JLabel("Etiqueta E");
        etiquetas[4].setHorizontalAlignment(SwingConstants.CENTER);
        etiquetas[4].setBackground(Color.BLUE);
        etiquetas[4].setForeground(Color.WHITE);
        etiquetas[4].setOpaque(true);

        //Añado componentes
        cp.add(etiquetas[0], BorderLayout.NORTH);
        cp.add(etiquetas[4], BorderLayout.SOUTH);
        cp.add(etiquetas[1], BorderLayout.EAST);
        cp.add(etiquetas[3], BorderLayout.WEST);
        cp.add(etiquetas[2], BorderLayout.CENTER);
    }

}
