/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.examenuf4.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class DAOVehicle {

    //inicializamos un nuevo array list cada vez que creamos un objeto DAO
    ArrayList<Vehicle> garaje;

    public DAOVehicle() {
        garaje = new ArrayList<>();
    }

    public void altaVehicle() { //metodo que pide todos los datos y de da alta un vehiculo del tipo deseado
        boolean contiene = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Que quieres añadir?\n1) Triciclo 2) Bicicleta 3) Coche");
        int opcion = scan.nextInt();
        scan.nextLine(); // limpiar buffer

        //pedimos datos de vehiculo general
        System.out.println("Dime marca: ");
        String marca = scan.nextLine();

        System.out.println("Dime modelo: ");
        String model = scan.nextLine();

        System.out.println("Dime motor: ");
        String motor = scan.nextLine();

        System.out.println("Dime numero de ejes: ");
        int nEixos = scan.nextInt();
        scan.nextLine(); // limpiar buffer

        switch (opcion) {
            //pedimos datos especilizados en cada caso
            case 1: //triciclo: color y modelo
                System.out.println("Dime color: ");
                String color = scan.nextLine();
                System.out.println("Dime sillas: ");
                int sillas = scan.nextInt();
                scan.nextLine(); // limpiar buffer

                for (Vehicle vehicle : garaje) {
                    if (vehicle instanceof Tricicle) {
                        if (vehicle.equals(new Tricicle(color, sillas, marca, model, motor, nEixos))) {
                            contiene = true;
                        }
                    }
                }

                if (contiene == false) {
                    garaje.add(new Tricicle(color, sillas, marca, model, motor, nEixos));
                } else {
                    System.out.println("Este triciclo ya existe");
                }

                break;
            case 2: //bicicleta: tipus, seientAdjustable
                System.out.println("Dime tipo: ");
                String tipus = scan.nextLine();
                System.out.println("Sillin ajustable? true o false: ");
                boolean seientAdjustable = scan.nextBoolean();
                scan.nextLine(); // limpiar buffer

                for (Vehicle vehicle : garaje) {
                    if (vehicle instanceof Bicicleta) {
                        if (vehicle.equals(new Bicicleta(tipus, seientAdjustable, marca, model, motor, nEixos))) {  //si ya tenemos esta bicicleta en el sistema actualizamos el boolean
                            contiene = true;
                        }
                    }
                }
                if (contiene == false) {
                    garaje.add(new Bicicleta(tipus, seientAdjustable, marca, model, motor, nEixos));
                } else {
                    System.out.println("Esta bicicleta ya existe");
                }

                break;
            case 3: //cotxe: chasis, marcaRuedas
                System.out.println("Dime chasis: ");
                String chasis = scan.nextLine();
                System.out.println("Dime marca de las ruedas: ");
                String marcaRuedas = scan.nextLine();

                for (Vehicle vehicle : garaje) {
                    if (vehicle instanceof Cotxe) {
                        if (vehicle.equals(new Cotxe(chasis, marcaRuedas, marca, model, motor, nEixos))) { //si ya tenemos este coche en el sistema actualizamos el boolean
                            contiene = true;
                        }
                    }
                }

                if (contiene
                        == false) {
                    garaje.add(new Cotxe(chasis, marcaRuedas, marca, model, motor, nEixos));
                } else {
                    System.out.println("Este coche ya existe");
                }

                break;
            default:
                System.out.println("Esa opcion no es valida");
        }
    }

    public void baixaVehicle() { //metodo que comprueba los vehiculos para darlos de baja
        Scanner scan = new Scanner(System.in);
        //preguntamos que se va a eliminar, podemos tener un coche y una bicicleta de mismo modelo y marca y quizas solo queremos eliminar 1
        System.out.println("Que quieres eliminar: 1. Triciclo 2. Bicicleta 3. Coche");
        int opcion = scan.nextInt();
        scan.nextLine();

        //pedimos datos identificativos
        System.out.println("Dime marca");
        String marca = scan.nextLine();
        System.out.println("Dime modelo: ");
        String modelo = scan.nextLine();

        for (int i = 0; i < garaje.size(); i++) {
            Vehicle v = garaje.get(i);
             //recorremos el garaje en busca de vehiculos que cumplan el criterio
            if (v.getMarca().equals(marca) && v.getModel().equals(modelo)) {
                eliminar(v, opcion);
            }
        }
    }

    public void eliminar(Vehicle obj, int opcion) { //comprobamos si es del tipo que queremos eliminar
        switch (opcion) {
            case 1:
                if (obj instanceof Tricicle) {
                    System.out.println("Se va a eliminar el " + obj);
                    garaje.remove(obj);
                }
                break;
            case 2:
                if (obj instanceof Bicicleta) {
                    System.out.println("Se va a eliminar la " + obj);
                    garaje.remove(obj);
                }
                break;
            case 3:
                if (obj instanceof Cotxe) {
                    System.out.println("Se va a eliminar el " + obj);
                    garaje.remove(obj);
                }
                break;
        }
    }

    public void buscarMarca() { //este metodo devolvera todos los vehiculos de la marca deseada
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime marca: ");
        String marca = scan.nextLine();
        System.out.println("VEHICULOS CON MARCA " + marca + ": ");
        for (Vehicle vehicle : garaje) {
            if (vehicle.getMarca().equals(marca)) {
                System.out.println(vehicle);
            }
        }
    }
}
