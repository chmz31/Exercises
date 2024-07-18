/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.centreanimals;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class CentroDAO implements ICentre {

    //creamos el array list
    ArrayList<Animal> centro;

    public CentroDAO() {
        //inicializamos un array list para cada CentroDAO creado en el main
        centro = new ArrayList<>();
    }

    public void afegirAnimal() { //agrega un nuevo animal a la lista
        Scanner scan = new Scanner(System.in);
        System.out.println("¿ave o reptil?");
        String especie = scan.nextLine();
        System.out.println("Dime nombre: ");
        String nom = scan.nextLine();
        switch (especie.toLowerCase()) {
            case "ave":
                if (centro.contains(new Au(nom)) == false) {
                    System.out.println("Dime color: ");
                    String color = scan.nextLine();
                    centro.add(new Au(color, nom));
                } else {
                    System.out.println("Este animal ya existe");
                }
                break;
            case "reptil":
                if (centro.contains(new Reptil(nom)) == false) {
                    System.out.println("Dime medio: ");
                    String medio = scan.nextLine();
                    System.out.println("Dime medida: ");
                    double medida = scan.nextDouble();
                    centro.add(new Reptil(medio, medida, nom));
                } else {
                    System.out.println("Este animal ya existe");
                }
        }

    }

    @Override
    public void entrada() { //entra un nuevo ejemplar de un animal ya existente
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime nombre de especie a entrar: ");
        String nombre = scan.nextLine();
        for (int i = 0; i < centro.size(); i++) {
            if (centro.get(i).getNom().equals(nombre)) {
                centro.get(i).afegirExemplars();
                System.out.println(centro.get(i));
            }
        }
    }

    @Override
    public void sortida() { //sale un ejemplear de un animal ya existente
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime nombre de especie a salir: ");
        String nombre = scan.nextLine();
        for (int i = 0; i < centro.size(); i++) {
            if (centro.get(i).getNom().equals(nombre)) {
                if (centro.get(i).getExemplars() - 1 > 0) {
                    centro.get(i).reduirExemplars();
                    System.out.println(centro.get(i));
                } else {
                    System.out.println("Se ha eliminado el ejemplar: " + centro.get(i).getNom());
                    centro.remove(i);
                }
            }
        }
    }

    public void modificarAnimal() { //modifica las propiedades unicas de un animal
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime nombre del animal: ");
        String nom = scan.nextLine();
        for (Animal animal : centro) {
            if (animal.getNom().equals(nom)) {
                if (animal instanceof Au) {
                    System.out.println("Dime nuevo color: ");
                    String color = scan.nextLine();
                    ((Au) animal).setColor(color);
                } else if (animal instanceof Reptil) {
                    System.out.println("Que quieres cambiar?\n1.Medi  2.Mida");
                    int opcion = scan.nextInt();
                    scan.nextLine(); //limpiar buffer
                    switch (opcion) {
                        case 1:
                            System.out.println("Dime nuevo medio: ");
                            String medio = scan.nextLine();
                            ((Reptil) animal).setMedi(medio);
                            break;
                        case 2:
                            System.out.println("Dime nueva medida: ");
                            Double mida = scan.nextDouble();
                            ((Reptil) animal).setMida(mida);
                            break;
                        default:
                            System.out.println("Lo siento no existe esa opcion");
                    }

                }
            }
        }
    }

    public void listarAnimales() {
        for (Animal a : centro) {
            System.out.println(a);
        }
    }

}
