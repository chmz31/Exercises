/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf3.exbin2ex2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class UF3Exbin2ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String salto = "\n";
        Scanner scan = new Scanner(System.in);
        String nFichero = "files/datosbeca.bin";
        System.out.println("Dime nombre y apellido: ");
        String nombre = scan.nextLine();
        System.out.println("Indica sexo [H] o [M]");
        char sexo = scan.nextLine().charAt(0);
        System.out.println("Forma parte de una residencia familiar? [S]i/[N]o");
        char residencia = scan.nextLine().charAt(0);
        System.out.println("Dime Edad: ");
        int edad = scan.nextInt();
        scan.nextLine();
        System.out.println("Dime suspensos: ");
        int suspensos = scan.nextInt();
        scan.nextLine();
        System.out.println("Dime ingresos anuales: ");
        int ingresos = scan.nextInt();

        try {
            FileOutputStream fos = new FileOutputStream(nFichero);
            DataOutputStream dos = new DataOutputStream(fos);

            char[] input = nombre.toCharArray();
            dos.writeUTF("nombre: ");
            for (int i = 0; i < input.length; i++) {
                fos.write(input[i]);
            }
            fos.write(salto.charAt(0));
            input = String.valueOf(sexo).toCharArray();
            dos.writeUTF("sexo: ");
            for (int i = 0; i < input.length; i++) {
                fos.write(input[i]);
            }
            fos.write(salto.charAt(0));
            input = String.valueOf(residencia).toCharArray();
            dos.writeUTF("residencia familiar: : ");
            for (int i = 0; i < input.length; i++) {
                fos.write(input[i]);
            }
            fos.write(salto.charAt(0));
            input = String.valueOf(edad).toCharArray();
            dos.writeUTF("edad: ");
            for (int i = 0; i < input.length; i++) {
                fos.write(input[i]);
            }
            fos.write(salto.charAt(0));
            input = String.valueOf(suspensos).toCharArray();
            dos.writeUTF("nº suspensos: ");
            for (int i = 0; i < input.length; i++) {
                fos.write(input[i]);
            }
            fos.write(salto.charAt(0));
            input = String.valueOf(ingresos).toCharArray();
            dos.writeUTF("Ingresos anuales: ");
            for (int i = 0; i < input.length; i++) {
                fos.write(input[i]);
            }
            fos.close();
        } catch (Exception ex) {
            System.out.println("Error");
        }

    }

}
