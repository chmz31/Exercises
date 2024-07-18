package es.ifp.programacion.ejerciciospropuestos.bool;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
		//Variables 
		 
		int NUM1; 
		int NUM2; 
		boolean EsMayor; 
		boolean EsIgual; 
		boolean EsMenor;
		
		Scanner sc = new Scanner (System.in); 
		
		
		//Entrada de datos 
		
		System.out.println("***Entrada de datos***");
	    System.out.println("Escriba primer número"); 
	    NUM1 = sc.nextInt(); 
	    System.out.println("Escriba segundo número");
	    NUM2 = sc.nextInt();
	    
	    EsMayor = (NUM1 > NUM2); 
	    EsIgual = (NUM1 == NUM2); 
	    EsMenor = (NUM1 < NUM2);
	    
	    //Salida 
	    
	    System.out.println("Es mayor el número 1 al número 2?"+" "+EsMayor);
	    System.out.println("Es igual el número 1 al número 2?"+" "+EsIgual);
	    System.out.println("Es menor el número 1 al número 2?"+" "+EsMenor);
	    
	    
   
		
		
	}

}
