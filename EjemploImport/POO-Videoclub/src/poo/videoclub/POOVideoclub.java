/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo.videoclub;

import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class POOVideoclub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        String objetivo;

        Pelicula pelicula1 = new Pelicula("LOTR"); //Creamos una nueva pelicula de titulo LOTR
        pelicula1.setGenero("Fantasia"); //establecemos el genero de nuestra pelicula
        Pelicula pelicula2 = new Pelicula("El bueno, el feo y el malo", "Western"); //Creamos una pelicula con nombre y de genero Western
        pelicula2.setDuracion("300 minutos"); //establecemos la duracion de nuestra pelicula

        //Buscamos si las dos peliculas son iguales
        System.out.println("Son iguales? " + pelicula1.equals(pelicula2));

        //Creamos un array list "Cartelera" y metemos las peliculas dentro
        ArrayList<Pelicula> Cartelera = new ArrayList<>();
        Cartelera.add(pelicula1);
        Cartelera.add(pelicula2);

        //Imprimimos las peliculas
        for (int i = 0; i < Cartelera.size(); i++) {
            System.out.println(Cartelera.get(i));
        }

        //Creamos una nueva pelicula buscar y la buscamos dentro del array
        Pelicula pelicula3 = new Pelicula("buscar");
        System.out.println("Contiene la cartelera la pelicula buscar? " + Cartelera.contains(pelicula3));
        System.out.println("Indice de la pelicula buscar: " + Cartelera.indexOf(pelicula3));

        //Borramos la pelicula buscar del arrayList si esta contenida en la lista
        if (Cartelera.contains(pelicula3) == true) {
            Cartelera.remove(Cartelera.indexOf(pelicula3));
        }

        //Comprobamos el numero de elementos de la lista
        System.out.println("La cartelera contiene: " + Cartelera.size() + " Peliculas");

        System.out.println("Imprimimos con for each");
        for (Pelicula p : Cartelera) { //imprimimos con for each
            System.out.println(p);
        }

        //System.out.println("1. añadir pelicula\n2. buscar pelicula\n3. eliminar pelicula\n4. mostrar cartelera\n5. modificar pelicula\n6. prestar pelicula");
        //case 1:
        Cartelera.add(new Pelicula());
        int ultima = Cartelera.size() - 1;
        System.out.println("Dime el id: ");
        Cartelera.get(ultima).setIdentificador(scan.nextInt());
        scan.nextLine(); // limpiamos el enter que sobra

        System.out.println("Dime el nombre de tu pelicula");
        Cartelera.get(ultima).setNombre(scan.nextLine());

        System.out.println("Dime el genero de tu pelicula");
        Cartelera.get(ultima).setGenero(scan.nextLine());

        System.out.println("Dime la duracion: ");
        Cartelera.get(ultima).setDuracion(scan.nextLine());

        System.out.println("Tu pelicula: " + Cartelera.get(ultima));
        //break;

        //case 2:
        System.out.println("Buscar por id o por titulo? \n1. id 2. titulO");
        int modo = scan.nextInt();
        scan.nextLine(); //captamos buffer
        switch (modo) {
            case 1:
                System.out.println("Dime el id de la pelicula que vas a borrar");
                int objetivoI = scan.nextInt();

                for (int i = 0; i < Cartelera.size(); i++) {
                    if (Cartelera.get(i).getIdentificador() == objetivoI) {
                        System.out.println("He borrado la pelicula: " + Cartelera.get(i));
                        Cartelera.remove(Cartelera.get(i));
                    }
                }
                break;
            case 2:
                System.out.println("Dime el titulo de la pelicula que vas a borrar");
                objetivo = scan.nextLine();
                
                for (int i = 0; i < Cartelera.size(); i++) {
                    if (Cartelera.get(i).getNombre().toLowerCase().equals(objetivo.toLowerCase())) {
                        System.out.println("He borrado la pelicula: " + Cartelera.get(i));
                        Cartelera.remove(Cartelera.get(i));
                    }
                }
                break;
        }
    }
}
