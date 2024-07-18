package es.ifp.programacion.ejerciciospropuestos.variables;

import java.util.Scanner;

/**
 Crea un programa en Java en el cual se declaren variables o constantes para almacenar los siguientes datos:
- Nombre
- Apellidos: Conjunto de caracteres alfanuméricos
- DNI: Debe incluir la letra.
- Edad: Valor numérico.
- ¿Es mayor de edad? (Deberá definirse como un booleano)
- Peso, en kg (Deberá permitir decimales)
- Número de teléfono.
- Dirección postal:
Calle
Número.
Piso.
Letra: Solo podrá contener un caracter.
código postal.
Comportamiento del programa:
El programa solicitará a través de la consola cada uno de estos datos, exceptuando el dato de mayoría de edad.
El usuario los introducirá a través de teclado.
Los datos se asignarán a la variable/constante correspondiente.
Finalmente, el programa los mostrará por consola precidiendo cada dato con el título correspondiente.
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		//Variables 
		
		String nombre; 
		String apellidos; 
		String DNI; 
		int edad; 
		boolean esMayor;
		float peso; 
		String telefono; 
		String calle; 
		int numero_calle; 
		int piso;
		char letra; 
		String cp; 
		
		
		Scanner sc = new Scanner(System.in);
		
		//Instrucciones 
		
		//entrada de datos 
		
		System.out.println("**** Entrada de datos****");	
		
		System.out.println("1.- Introduzca su nombre:");
		nombre = sc.nextLine();	
		
		System.out.println("2.- Introduzca su apellido:");
		apellidos = sc.nextLine(); 
		
		System.out.println("3.- Introduzca su DNI");
		DNI = sc.nextLine(); 
		
		System.out.println("4.- Introduzca su edad");
		edad = sc.nextInt(); 
		sc.nextLine(); //limpiar buffer 
		
		esMayor = (edad >= 18); 
		
		if (esMayor) { System.out.println("Es mayor de edad"); 
		
		} else System.out.println("Es menor de edad");
		
		System.out.println("5.Introduzca su peso"); 
		peso = sc.nextFloat(); 
		
		sc.nextLine(); //limpiar buffer 
		
		System.out.println("6.- Introduzca su telefono");
		telefono = sc.nextLine(); 
		
		System.out.println("7.- Introudzca su calle");
		calle = sc.nextLine(); 
		
		System.out.println("8.- Introduzca su número de calle");
		numero_calle = sc.nextInt(); 
		
		System.out.println("9,- Introduzca su piso");
		piso = sc.nextInt();
		
		sc.nextLine(); //limpiar buffer 
		
		System.out.println("10.- Letra?");
		letra =  sc.nextLine().charAt(0); 
		
		
		System.out.println("11.- Introduzca su código postal");
		cp = sc.nextLine(); 
		
		
	
	
	
		
		
		

	}

}
