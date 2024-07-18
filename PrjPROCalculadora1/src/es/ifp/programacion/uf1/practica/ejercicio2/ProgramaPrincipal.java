package es.ifp.programacion.uf1.practica.ejercicio2;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
	
		//Variables 
		float resul; 
		float num2;
		float num1;
		Scanner Scan = new Scanner(System.in);
		char opcion;
		boolean salir=false;
		
		System.out.println("============ CALCULADORA :: GESTIÓN DE AGUAS, SL ============");
		
		do {
			System.out.println("Introduzca una opción del menú:");
			System.out.println("1. Sumar (+)");
			System.out.println("2. Restar (-)");
			System.out.println("3. Multiplicar (*)");
			System.out.println("4. Dividir (/)");
			System.out.println("5. Factorial (!)");
			System.out.println("0. Salir (S o s)"); 
			opcion = Scan.nextLine().charAt(0); 
			
			switch (opcion) {
			case '+':
			case '1':
				 System.out.println("Introduzca el primer número:");
				 num1 = Scan.nextFloat();
				 System.out.println("Introduzca el segundo número");
				 num2 = Scan.nextFloat(); 
				 resul = Suma (num1, num2);
				 System.out.println("===================================");
				 System.out.println("La suma de"+" "+num1+" "+ "y"+" "+num2+" "+"es"+" "+resul);
				 System.out.println("===================================");
				 break; 
			case '-':
			case '2':
				 System.out.println("Introduzca el primer número:");
				 num1 = Scan.nextFloat();
				 System.out.println("Introduzca el segundo número");
				 num2 = Scan.nextFloat(); 
				 resul = Resta (num1, num2);
				 System.out.println("===================================");
				 System.out.println("La resta de"+" "+num1+" "+ "y"+" "+num2+" "+"es"+" "+resul);
				 System.out.println("===================================");
				 break; 
			case '*':
			case '3':
				 System.out.println("Introduzca el primer número:");
				 num1 = Scan.nextFloat();
				 System.out.println("Introduzca el segundo número");
				 num2 = Scan.nextFloat(); 
				 resul = Multiplicar (num1, num2);
				 System.out.println("===================================");
				 System.out.println("La multiplicación de"+" "+num1+" "+ "y"+" "+num2+" "+"es"+" "+resul);
				 System.out.println("===================================");
				 break;
			case '/':
			case '4':
				 System.out.println("Introduzca el primer número:");
				 num1 = Scan.nextFloat();
				 System.out.println("Introduzca el segundo número");
				 num2 = Scan.nextFloat(); 
				 resul = Dividir (num1, num2);
				 System.out.println("===================================");
				 System.out.println("La Divición de"+" "+num1+" "+ "y"+" "+num2+" "+"es"+" "+resul);
				 System.out.println("===================================");
				 break; 
			case '!':
			case '5':
				 System.out.println("Introduzca un número entero >= 0:");
				 resul = factorial (Scan.nextInt());
				 System.out.println("===================================");
				 System.out.println("El factorial de N es"+" "+resul);
				 System.out.println("===================================");
				 break; 
				 
			case 's':
			case '0':
				System.out.println("El programa ha finalizado");
				salir = true; 
			    break;
			default: 
				System.out.println("Opción Incorrecta");		 
			
			
			
		} 

	} while (salir = false);

	} 
	public static float Suma (float dato1, float dato2) {
			float resultado;
		     resultado = dato1+dato2;
		    return resultado;
	}
	 public static float Resta (float dato1, float dato2) {
			float resultado;
		     resultado = dato1-dato2;
		    return resultado;
     }
	 public static float Multiplicar (float dato1, float dato2) {
			float resultado;
		     resultado = dato1*dato2;
		    return resultado;
  }
	 public static float Dividir (float dato1, float dato2) {
			float resultado;
		     resultado = dato1/dato2;
		    return resultado;
}
	 public static int factorial(int dato1) {
	        int fact = 1;
	        for (int i = 1; i <= dato1; i++) {
	            fact = fact * i;
	        }
	        return fact;
	    }
}



	
		
	

