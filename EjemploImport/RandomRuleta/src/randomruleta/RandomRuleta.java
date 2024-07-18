/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomruleta;

import static java.lang.Math.random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class RandomRuleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //inicializamos las variables
       int dinero = 50, num_apostado, apuesta, resultado;
        System.out.println("Bienvenid@ a la ruleta, puedes apostar del 0 al 36, para apuestas normales o 37/38 para impares/pares");
       boolean continuar = true;
       do {
       System.out.print("A que numero quieres apostar: ");
       num_apostado=pedir_numero();
       apuesta=pedir_apuesta(dinero);
       dinero = dinero - apuesta;
       resultado = caida_bola();
       if (comprobar_resultado(resultado, apuesta)==true){
           //TODO sumar ganancias si acierta
       }
       System.out.println("ha tocado: "+resultado);
       System.out.println("Actualmente tienes: "+dinero);
       if (dinero <= 0) {
       continuar = false;
       }
       } while (continuar == true);
    }
    
    public static int pedir_numero(){
    int numero;    
    Scanner scan = new Scanner(System.in);
    numero = scan.nextInt();
    if (numero <1 || numero >38){
    System.out.print("A que numero quieres apostar: ");
    return pedir_numero();
    }
    return numero;
    }
    
    public static int caida_bola(){
    int tirada = (int) (Math.random()*36);
    return tirada;
    }
    
    public static int pedir_apuesta(int saldo){
    Scanner scan = new Scanner(System.in);
    System.out.print("Cuanto quieres apostar: ");
    int apuesta = scan.nextInt();
    if (saldo < apuesta) {
    return pedir_apuesta(saldo);    
    }
    return apuesta;
    }
    
    public static boolean comprobar_resultado(int bola, int num_apostado){
    boolean resultado = false;
    if (bola == num_apostado || bola%2==0 && num_apostado == 38 || bola%2!=0 && num_apostado==37) {
    resultado = true;
    }
    return resultado;
    }
    
    public static int ganancias(int dinero_apostado, int num_apostado){
    int ganancias = 0;
    if (num_apostado == 37 || num_apostado == 38){
    ganancias = dinero_apostado * 2;
    }else if (num_apostado > 0 && num_apostado < 37){
    ganancias = dinero_apostado * 35;
    }
    return ganancias;
    }
    
}
