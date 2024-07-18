/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author alessandro
 */
public class WelcomePanel extends JPanel {

    public WelcomePanel() {
        initComponents();
    }

    private void initComponents() {
       JLabel l1 = new JLabel("Welcome");
       setBackground(Color.gray);
       add(l1, BorderLayout.CENTER);
    }
    
}
