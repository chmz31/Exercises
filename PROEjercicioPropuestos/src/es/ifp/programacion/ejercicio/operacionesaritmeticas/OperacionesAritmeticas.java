package es.ifp.programacion.ejercicio.operacionesaritmeticas;

import java.util.Scanner;

public class OperacionesAritmeticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables 
		
		int NUM1;
		int NUM2; 
		
		float NUM3; 
		float NUM4;
		
		float sum;
		float resta;
		float mult;
	        
		
		Scanner sc = new Scanner (System.in); 
       
        
		
		//Entrada de datos 
		
		System.out.println("Primer número entero");
		NUM1= sc.nextInt(); 
		System.out.println("Segundo número entero");
		NUM2= sc.nextInt();
		System.out.println("Primer número decimal");
		NUM3 = sc.nextFloat();
		System.out.println("Segundo número decimal");
		NUM4 = sc.nextFloat(); 
		
		sum = NUM1+ NUM2 + NUM3 + NUM4;   
		mult = NUM1 * NUM2 * NUM3 * NUM4;
		resta = NUM1 - NUM2 - NUM3 - NUM4; 
		NUM1++ ; NUM2++ ; NUM3++ ; NUM4++; 
		
		
		//Salida
	   System.out.println("la suma de los valores introducidos es"+" "+sum); 
	   System.out.println("la multiplicación de los valores introducidos es"+" "+mult);
       System.out.println("La resta de los valores introducidos es"+" "+resta);
	   System.out.printf("Los valores tras aumentar una unidad son:"+" "+NUM1+","+NUM2+","+NUM3+","+NUM4);
	   
		
		
		
		
		
	}

}
