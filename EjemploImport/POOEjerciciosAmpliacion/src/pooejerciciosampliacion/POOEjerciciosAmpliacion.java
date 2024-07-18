/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooejerciciosampliacion;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class POOEjerciciosAmpliacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //aqui tendremos el programa principal
        Scanner scan = new Scanner(System.in);
        Temperatura temperatura = new Temperatura();
        int opcion = 0;
        do {
            System.out.println("Introduce opcion:\n1. Calcular temperatura\n2. Comprobar rectangulos\n3. Venda test\n4. Banco test \n0. Salir");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Introduce la temperatura: ");
                    temperatura.setTemp(scan.nextDouble());
                    System.out.println("Tu temperatura en Celsius: " + temperatura.getTemp() + ", En Fahrenheit: " + temperatura.celsiusToFahrenheit());
                    System.out.println("Tu temperatura en Fahrenheit: " + temperatura.getTemp() + ", En Celsius " + temperatura.fahrenheitToCelsius());
                    break;
                case 2:
                    rectangleTest();
                    break;
                case 3:
                    vendaTest();
                    break;
                case 4:
                    bancoTest();
                    break;
                case 0:
                    System.out.println("Saliendo");

            }
        } while (opcion != 0);
    }

    public static void rectangleTest() { //prueba de comparar dos rectangulos iguales
        Rectangle rect1 = new Rectangle(2, 4);
        Rectangle rect2 = new Rectangle(2, 4);
        Rectangle.sonIguales(rect1, rect2);
    }

    private static void vendaTest() { //Simulamos una venta, con vaores introducidos por teclado.
        Scanner scan = new Scanner(System.in);
        System.out.println("Cuantos articulos vas a comprar?");
        Venda venda = new Venda(scan.nextInt());
        venda.rellenarArticulos();
        System.out.println(venda);
    }

    private static void bancoTest() { //simulamos un ingreso, un pago y una transferencia
        Scanner scan = new Scanner(System.in);
        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria();
        cuenta1.setSaldo(300); //tendremos un saldo inicial de 300 euros en ambas cuentas
        cuenta2.setSaldo(300);
        //saldo actual y pedimos cantidad ingreso
        System.out.println("Actualmente tienes: " + cuenta1.getSaldo() + " saldo, cuanto quieres ingresar?");
        cuenta1.ingresarSaldo(scan.nextInt());
        System.out.println("Nuevo saldo: " + cuenta1.getSaldo());
        //simulamos un pago
        System.out.println("Cuanto quieres reintegrar de tu deuda? ");
        cuenta1.reintegro(scan.nextInt());
        System.out.println("Nuevo saldo: " + cuenta1.getSaldo());
        //simulamos una transferencia
        System.out.println("Tu cuenta: "+cuenta1);
        System.out.println("Cuentas disponibles para transferencia: "+cuenta2);
        System.out.println("Escoge cantidad transferencia: ");
        cuenta1.transferencia(cuenta2, scan.nextInt());
        System.out.println("Nuevo saldo: "+cuenta1.getSaldo()+" saldo cuenta objetivo: "+cuenta2.getSaldo());
    }
}
