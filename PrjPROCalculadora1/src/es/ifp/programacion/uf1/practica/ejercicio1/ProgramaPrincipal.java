package es.ifp.programacion.uf1.practica.ejercicio1;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		//Variables 
		float num1; 
		float num2; 
		float suma;
		float resta;
		float multi;
		float divi;
		float modul;
		char opcion;
		boolean salir=false; 
		Scanner Scan = new Scanner(System.in);
		
		
		System.out.println("============ CALCULADORA :: GESTIÓN DE AGUAS, SL ============");
		
		do {
			System.out.println("Introduzca una opción del menú:");
			System.out.println("1. Sumar (+)");
			System.out.println("2. Restar (-)");
			System.out.println("3. Multiplicar (*)");
			System.out.println("4. Dividir (/)");
			System.out.println("5. Resto (%)");
			System.out.println("0. Salir (S o s)"); 
			opcion = Scan.nextLine().charAt(0); 
			
			
			switch (opcion) {
			case '+':
			case '1':
				 System.out.println("Introduzca el primer número:");
				 num1 = Scan.nextFloat();
				 System.out.println("Introduzca el segundo número");
				 num2 = Scan.nextFloat(); 
				 suma = num1+num2;
				 System.out.println("===================================");
				 System.out.println("La suma de"+" "+num1+" "+ "y"+" "+num2+" "+"es"+" "+suma);
				 System.out.println("===================================");
				 break;
			case '-':
			case '2':
				System.out.println("Introduzca el primer número:");
				 num1 = Scan.nextFloat();
				 System.out.println("Introduzca el segundo número");
				 num2 = Scan.nextFloat(); 
				 resta = num1-num2;
				 System.out.println("===================================");
				 System.out.println("La resta de"+" "+num1+" "+ "y"+" "+num2+" "+"es"+" "+resta);
				 System.out.println("===================================");
				 break;
			case '*':
			case '3': 
				System.out.println("Introduzca el primer número:");
				 num1 = Scan.nextFloat();
				 System.out.println("Introduzca el segundo número");
				 num2 = Scan.nextFloat(); 
				 multi = num1*num2;
				 System.out.println("===================================");
				 System.out.println("La multiplicación de"+" "+num1+" "+ "y"+" "+num2+" "+"es"+" "+multi);
				 System.out.println("===================================");
				 break;
			case '/':
			case '4':
				System.out.println("Introduzca el primer número:");
				 num1 = Scan.nextFloat();
				 System.out.println("Introduzca el segundo número");
				 num2 = Scan.nextFloat(); 
				 divi=num1/num2;
				 System.out.println("===================================");
				 System.out.println("La división de"+" "+num1+" "+ "y"+" "+num2+" "+"es"+" "+divi);
				 System.out.println("===================================");
				 break;
			case '%':
			case '5': 
				System.out.println("Introduzca el primer número:");
				 num1 = Scan.nextFloat();
				 System.out.println("Introduzca el segundo número");
				 num2 = Scan.nextFloat(); 
				 modul=num1%num2;
				 System.out.println("===================================");
				 System.out.println("el resto de"+" "+num1+" "+ "y"+" "+num2+" "+"es"+" "+modul);
				 System.out.println("===================================");
				 break; 
			case 's':
			case '0':
				System.out.println("El programa ha finalizado");
				salir = true; 
			    break;
			default: 
				System.out.println("Opción Incorrecta");
				 
			} Scan.nextLine(); //limpiar buffer
			
		} while (salir = false );
		
		
		
		
		
		
		
		
		

	
		
		
		
		
		

	}

}
