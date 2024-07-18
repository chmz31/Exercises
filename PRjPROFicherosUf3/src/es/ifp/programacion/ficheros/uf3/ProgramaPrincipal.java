package es.ifp.programacion.ficheros.uf3;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String opcion; 
		do {
	    	  muestraMenu();
	    	  opcion = sc.nextLine(); 
	    	  switch (opcion) { 
	    	  case "A":
	    		  creaFichero();
	    		  break;
	    	  case "B":
	    		  escribeFichero();
	    		  break;
	    	  case "C":
	    		  leerFichero();
	    		  break;
	    	  case "D":
	    		  borraFichero();
	    		  break;
	    	  case "S":
	    	  case "E":
	    		  System.out.println("El programa ha finalizado");
	    		  break;
	    	  default:
	    		  System.out.println("Opcion incorrecta");
	    		  
	    	  
	    	  }
		

	} while (!opcion.matches("S|E")); 
		
	}
	
	/**
	 * Menú
	 */
	public static void muestraMenu() { 
     System.out.println("A) Crear fichero de texto.");
     System.out.println("B) Introducir información en el fichero.");
     System.out.println("C) Leer el fichero de texto.");
     System.out.println("D) Eliminar el fichero de texto.");
     System.out.println("E) Salir (S)");		
	}
	/**
	 * Método para crear fichero
	 */
	public static void creaFichero() { 
		Scanner sc = new Scanner (System.in);
		File f = null; 
		String ruta;
		boolean result; 
		System.out.println("Introduzca la ruta donde quiere crear el fichero:");
		ruta = sc.nextLine();
		f = new File(ruta);
		try {
			if (!f.exists()) {
				result = f.createNewFile();
				if (result = true)
					System.out.println("El fichero ha sido creado con éxito");		
			} 
			else 
				System.out.println("El fichero ya existe");
		} catch (IOException ioe) {
			ioe.printStackTrace();
			System.out.println("El fichero no ha podido ser creado");
		}
	}
	/**
	 * Método para escribir en el fichero
	 */
	public static void escribeFichero() { 
		FileWriter fw = null;
		BufferedWriter bw = null; 
		Scanner sc = new Scanner (System.in);
		String ruta;
		String cadena;
		String opcion; 
		File f = null;
		String tmp; 
		boolean opcionEscritura;
		
		System.out.println("=======================");
		System.out.println("Elija su opción de escritura");
		System.out.println("=======================");
		System.out.println("Sobreescribir (S)");
		System.out.println("Añadir cadena de texto (A)");
		opcion = sc.nextLine();
		
		if (opcion.equals("A"))
			opcionEscritura = true;
		else 
			if (opcion.equals("S"))
				opcionEscritura = false; 
			else {
				System.out.println("Opcion de escritura incorrecta");
				opcionEscritura = true; 
			}
		
		System.out.println("Introduzca el fichero sobre el que quiere escribir");
		ruta = sc.nextLine();
		
		System.out.println("Introduzca la cadena a escribir en el fichero");
		cadena = sc.nextLine(); 
		
		
		try {
			f = new File (ruta); 
			
			if (f.exists()) {
				
			fw = new FileWriter(f, opcionEscritura);
			bw = new BufferedWriter (fw); 
			
			bw.write(cadena);
			
			
			//cerrar antes el BufferedWriter
			bw.close();
			fw.close();
			}	
			else {
				System.out.println("El fichero no existe, ¿Desea crearlo?: (S/N)");
				tmp = sc.nextLine(); 
				if (tmp.equals("S")) {
					creaFichero(); 
					fw = new FileWriter(f, opcionEscritura);
					bw = new BufferedWriter (fw); 
					
					bw.write(cadena+"\n");
					//cerrar antes el BufferedWriter
					bw.close();
					fw.close();
				} 
				else {
					System.out.println("Fichero no creado");
				}
			}
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
	
	/**
	 * Método para leer el fichero
	 */
	public static void leerFichero() { 
		FileReader fr = null; 
		BufferedReader br = null; 
		String linea =" "; 
		String totalLineas = " "; 
		Scanner sc = new Scanner (System.in);
		String ruta; 
		File f = null;
		
		System.out.println("Introduzca el fichero a leer:");
		ruta = sc.nextLine();
		try { 
			f = new File (ruta);
			
			if (f.exists()) {
			fr = new FileReader(f); 
			br = new BufferedReader(fr); 
			
			linea = br.readLine();
			while (linea != null) { 
				totalLineas = totalLineas+"\n"+linea; 
				linea = br.readLine(); 
			}
			
			} 
			else 
				System.out.println("El fichero no existe");
			
			fr.close();
			br.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		System.out.println("El contenido del fichero es:");
		System.out.println(totalLineas);
	}
	/**
	 * Método para borrar el fichero
	 */
	public static void borraFichero() { 
		System.out.println("Opcion de borrar fichero");
		Scanner sc = new Scanner (System.in);
		File f = null; 
		String ruta; 
		String check; 
		boolean result; 
		do { //Bucle para confirmar si está seguro de eliminar el fichero
		System.out.println("Introduzca la ruta del fichero que desea borrar:");
		ruta = sc.nextLine();
		System.out.println("¿Seguro que desea eliminar el fichero?"+" "+ruta);
		System.out.println("Introduzca S para confirmar");
		check = sc.nextLine(); 
		} while (!check.equals("S"));  
		
		f = new File (ruta); 
		
		if (f.exists()) {
			result = f.delete();if (result=true)
				System.out.println("El fichero ha sido borrado correctamente");
		}
		else 
			System.out.println("El fichero no existe");
}		
}
