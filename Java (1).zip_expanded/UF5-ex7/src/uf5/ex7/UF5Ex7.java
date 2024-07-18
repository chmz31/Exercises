/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf5.ex7;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class UF5Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GatoDAO gatera = new GatoDAO();
        Scanner scan = new Scanner(System.in);
        do {
            gatera.addGato();
        } while (gatera.nGatos < 5);
    }
}
