/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.uf4pr1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class DAO_AparellElectric {

    ArrayList<Aparellelectric> aparatos;

    public DAO_AparellElectric() {
        aparatos = new ArrayList<>();
    }

    public void altaAparell() { //da de alta un aparato en el sistema, y comprueba si no existe otro con el mismo identificador
        //pedmimos datos para el nuevo aparato
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime identificador de aparato: ");
        int identificador = scan.nextInt();
        scan.nextLine(); // limpiar enter del buffer
        System.out.println("Dime nombre del aparato: ");
        String nombre = scan.nextLine();
        System.out.println("Dime la potencia del aparato: ");
        double potencia = scan.nextDouble();
        if (potencia > 1000 || potencia < 0) { //en caso de introducir un valor invalido avisamos al usuario
            System.out.println("Potencia invalida, se establecera en 20");
        }

        //comprobamos que no haya otro aparato con el mismo identificador
        boolean existe = false;
        for (int i = 0; i < aparatos.size(); i++) {
            if (aparatos.get(i).getIdentificador() == identificador) {
                existe = true;
                System.out.println("Este identificador ya esta en uso, no se añadira el aparato");
            }
        }
        if (existe == false) { //si no encuentra ningun aparato con ese id añade uno nuevo
            this.aparatos.add(new Aparellelectric(identificador, nombre, potencia));
            System.out.println("Se ha añadido: " + new Aparellelectric(identificador, nombre, potencia));
        }
    }

    public void baixaAparell() { //da de baja un aparato del sistema con el identifcador que introduzcamos (variable unica para no equivocar mas de un obj con mismo nombre)
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime id del aparato que vas a eliminar: ");
        int id = scan.nextInt();

        for (int i = 0; i < aparatos.size(); i++) {
            Aparellelectric aparell = aparatos.get(i); //creamos un nuevo objeto y lo sobreescribimos para que sea mas facil hacer referencia a objeto actual
            if (aparell.getIdentificador() == id) {
                System.out.println("Se ha eliminado el aparato: " + aparell);
                aparatos.remove(aparell);
            }
        }

    }

    public void encendre_apagar_Aparell(int id) { //invierte el estado del aparato con el id que le pasamos
        for (int i = 0; i < aparatos.size(); i++) {
            Aparellelectric aparell = aparatos.get(i); //creamos un nuevo objeto y lo sobreescribimos para que sea mas facil hacer referencia a objeto actual

            if (aparell.getIdentificador() == id) {
                if (aparell.getEstat() == "apagat") {
                    aparell.setEstat("ences");
                    aparell.setConsum_electric(aparell.getConsum_electric() + (aparell.getPotencia() * incrementoAleatorio())); //aumentamos el consumo al encender
                    System.out.println("He encendido tu aparato " + aparell.getNom_aparell() + ", consumo actual: " + aparell.getConsum_electric() + "\n");
                } else if (aparell.getEstat() == "ences") {
                    aparell.setEstat("apagat");
                    System.out.println("He apagado tu aparato " + aparell.getNom_aparell() + "\n");
                }
            }

        }
    }

    public int incrementoAleatorio() { //devuelve un numero entre 25 y 100
        Random r = new Random();
        return r.nextInt(100 - 25) + 25;
    }

    public void listar_aparells_consum() { //lista todos los aparatos y su consumo total
        for (Aparellelectric aparato : aparatos) {
            System.out.println("Aparato: " + aparato.getNom_aparell() + ", Con identificador: " + aparato.getIdentificador() + ", Con consumo total de: " + aparato.getConsum_electric());
        }
    }

    public void llistar_consum_encesos() { //lista los aparatos encendidos con su consumo
        System.out.println("Aparatos encendidos: ");
        for (Aparellelectric aparato : aparatos) {
            if (aparato.getEstat() == "ences") {
                System.out.println("Aparato: " + aparato.getNom_aparell() + ", Con consumo de: " + aparato.getConsum_electric());
            }
        }
    }

    public void buscar_aparell_nom() { //muestra toda la informacion del aparato con nombre que introducimos
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime nombre del aparato o los aparatos que buscas: ");
        String nom = scan.nextLine();
        for (Aparellelectric aparato : aparatos) {
            if (aparato.getNom_aparell().toLowerCase().equals(nom.toLowerCase())) {
                System.out.println("Tus aparatos: \n" + aparato);
            }

        }
    }
}
