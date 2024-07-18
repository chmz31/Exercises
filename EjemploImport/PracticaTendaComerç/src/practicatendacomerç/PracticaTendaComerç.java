/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicatendacomerç;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PracticaTendaComerç {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //inicializamos las variables que necesitamos
        Scanner scan = new Scanner(System.in); // inicializamos el scanner tambien ya que lo usaremos para pedir inputs por teclado
        String nombre, apellido, dni;
        int tamaño, descuento = 3;
        double total, totalDescontado;
        System.out.print("Dime tu nombre: ");
        nombre = scan.nextLine();
        System.out.print("Dime tu apellido: ");
        apellido = scan.nextLine();
        System.out.print("Dime tu DNI: ");
        dni = scan.nextLine();
        System.out.print("Dime cuantos productos vas a comprar: ");
        tamaño = scan.nextInt(); //guardamos el tamaño del carrito para utilizarlo y crear un array de esa longitud
        double[] compra = new double[tamaño]; //inicializamos el array ahora y no antes porque no conociamos el tamaño anteriormente
        rellenarPrecios(compra); //rellenamos el vector pidiendo que introduzcan datos
        System.out.println("Tu codigo es: " + codigo(nombre, apellido, dni)); //"Creamos" el codigo concatenando los caracteres que nos interesan
        mostrarPrecios(compra); // mostramos todos los precios introducidos por el usuario
        total = suma(compra); //calulamos el total de la suma de los precios
        System.out.println("Total: " + total + "€");

        //revisamos todas las condiciones para aplicar descuentos
        if (total > 100) {
            descuento = descuento + 5;
        }

        if (maxPrecio(compra) > 66.0) {
            descuento = descuento + 6;
        }

        if (difMax(compra) > 50) {
            descuento = descuento + 10;
        }
        //Ahora que ya sabemos cuanto descontamos mostramos el porcentaje y calculamos
        System.out.println("Tu descuento: " + descuento + "%");
        totalDescontado = total - (total * descuento / 100); //calculamos el total con descuentos
        System.out.printf("Total con descuento aplicado: %.2f€", totalDescontado); //mostramos precio final
        //nota, he usado printf porque introduciendo los mismos valores que el enunciado era imposible obtener 110.77 sin usar BigDecimal o parecidos
 
    }

    public static void rellenarPrecios(double[] precios) { //con esta funcion rellenamos el array de precios, es totalmente opcional pero ayuda a mantener el codigo ordenado.
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < precios.length; i++) {
            System.out.print("Introduce precio de producto " + (i + 1) + ": ");
            precios[i] = scan.nextDouble();
        }
    }
    
    public static void mostrarPrecios(double[] precios){ //con esta funcion mostramos los precios por pantalla
    for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio de producto " + (i + 1) + ": "+precios[i]);

        }
    }

    public static double suma(double[] precios) {
        //esta funcion sumara los contenidos del vector precios y lo retornara
        double suma = 0;
        for (int i = 0; i < precios.length; i++) {
            suma = suma + precios[i];
        }
        return suma;
    }

    public static boolean existeMayorQue(double[] precios, double x) { //LUNES
        //esta funcion recorre el vector en busqueda de un nombre mayor que X
        boolean vuelta = false;
        for (int i = 0; i < precios.length; i++) {
            if (precios[i] > x) {
                vuelta = true;
            }
        }   
        return vuelta;
    }

    public static double difMax(double[] precios) {
        //funcion que devuelve la diferencia entre el precio del producto mas barato y del mas caro
        double max = precios[0], min = precios[0]; //utilizamos valores del array para asegurarnos que no utilize valores externos
        for (int i = 0; i < precios.length; i++) {
            if (precios[i] > max) {
                max = precios[i];
            } else if (precios[i] < min) {
                min = precios[i];
            }
        }
        double dif = max - min;
        return dif;
    }

    public static double maxPrecio(double[] precios) {
        //utilizamos esta funcion que busca el maximo para saber si es mayor que 66 a la hora de aplicar descuento, reutilizamos parte del codigo de difMax pero su funcion es distinta
        double max = precios[0];
        for (int i = 0; i < precios.length; i++) {
            if (precios[i] > max) {
                max = precios[i];

            }
        }
        return max;
    }

    public static String codigo(String nombre, String apellido, String dni) {
        //Funcion que retorna el codigo personal en funcion del nombre apellido y dni
        return (nombre.substring(0, 2).toUpperCase() + apellido.substring(0, 2).toUpperCase() + dni.substring(4, 8));
    }
}