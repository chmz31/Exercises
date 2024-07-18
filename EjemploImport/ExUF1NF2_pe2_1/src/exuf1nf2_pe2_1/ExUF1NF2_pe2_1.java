/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exuf1nf2_pe2_1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ExUF1NF2_pe2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicializamos variables
        Scanner scan = new Scanner(System.in);
        int TAM = 10; //constante para el tamaño del vector
        int OBJETIVO = 10; // constante en la que definimos el objetivo para el mayor que buscado
        int[] vector = new int[TAM];
        int valor, nuevoValor;
        
        //programa principal
        rellenarVectorRandom(vector);
        imprimirVector(vector);
        System.out.println("Ahora dime un numero que quieras cambiar: ");
        valor = scan.nextInt();
        System.out.println("Ahora dime el numero por el que lo quieres cambiar: ");
        nuevoValor = scan.nextInt();
        cambioVector(vector, valor, nuevoValor);
        imprimirVector(vector);
        System.out.println("Cambiamos todos los valores mayores que "+OBJETIVO+" por el numero mas pequeno encontrado en el vector"); //no he puesto la enye a posta por lo comentado en clase
        cambioVector_MayorQue(vector, OBJETIVO); //especificamos el valor que queremos que cambie, en este caso segun el enunciado valores superiores a 10
        imprimirVector(vector);
        System.out.println("Invertimos el vector");
        invertirVector(vector);
        imprimirVector(vector);
    }
    
    public static void rellenarVectorRandom(int[] vector){
        //esta funcion recorre el vector y le asigna un valor aleatorio a cada posicion
        Random r = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = r.nextInt(20)+1;
        }
    }
    
    public static void imprimirVector(int[] vector){
        //esta funcion recorre y imprime el vector
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+"-");
        }
        System.out.println(""); //imprimimos un salto de linea al final
    }
    
    public static void cambioVector(int[] vector, int valor, int nuevoValor){
    //esta funcion pedira dos valores por teclado para cambiar las veces que encontramos el primer valor por el valor deseado
        for (int i = 0; i < vector.length; i++) {
            if(vector[i] == valor){
            vector[i] = nuevoValor;
            }
        }
    }
    
    public static void cambioVector_MayorQue(int[] vector, int objetivo){ //se establece la variable objetivo pese a que no se pide en el enunciado para que sea mas modular y facil modificar el codigo en caso de que fuera necesario
        int menor = vector[0];
        
        for (int i = 0; i < vector.length; i++) { //utilizamos este for para buscar el menor numero dentro del vector
           if (vector[i] < menor){
           menor = vector[i];
           } 
        }
        
        for (int i = 0; i < vector.length; i++) { //utilizamos este for para reemplazar los valores
            if(vector[i] > objetivo){
            vector[i] = menor;
            }
        }
    }
    
    public static void invertirVector(int[] vector){
    //esta funcion deberia invierte el vector
    int aux, aux2, pos = 0;
        for (int i = 9; i > 0; i--) {
            //captamos los dos valores que no interesan (principio y final)
            aux = vector[i];
            aux2 = vector[pos];
            //cambiamos los valores de posicion
            vector[pos] = aux;
            vector[i] = aux2;
            //avanzamos
            pos++;
        }
    }
}
