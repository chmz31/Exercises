package es.ifp.programacion.ficheros.operaciones;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opcion;
		
		
      do {
    	  muestraMenu();
    	  opcion = sc.nextLine(); 
    	  
    	  if (opcion.equals("CD")) {
    		  crearDirectorio();
    	  }
    	  else 
    		  if (opcion.equals("BD")) {
    			  borrarDirectorio();
    		  }
    		  else 
    			  if (opcion.equals("CF")) {
    				  crearFichero();
    			  }
    			  else 
    				  if (opcion.equals("BF")) { 
    					  borrarFichero();
    				  }
    				  else 
    					  if (opcion.equals("EF")) {
    						  escribirFichero();
    					  }	
    					  else 
    						  if (opcion.equals("LF")) {
    							  leerFichero();
    						  }
    						  else 
    							  if (opcion.equals("S")) {
    								  
    							  }
    							  else 
    								  System.out.println("Opción incorrecta");
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
      } while (!opcion.equals("S")); 
		System.out.println("Fin de la ejecución del programa"); 
		
	}

	
	/**
	 * Procedimiento que muestra las opciones de menú del programa
	 */
	public static void muestraMenu () {
		System.out.println("===========================");
		System.out.println("    Gestión de ficheros    ");
        System.out.println("===========================");	
        System.out.println("Crear un directorio (CD)");
        System.out.println("Borrar un directorio (BD)");
        System.out.println("Crear un fichero (CF)");
        System.out.println("Borrar un fichero (BF)");
        System.out.println("Escribir un fichero (EF)");
        System.out.println("Leer de un fichero (LF)");
        System.out.println("Salir del programa (S)");
        System.out.println("===========================");
        System.out.println("Introduzca opción");
	
	}
	/**
	 * Crea un directorio
	 */
	public static void crearDirectorio () {
		Scanner sc = new Scanner (System.in);
		String ruta;
		File f = null;
		boolean result; 
		
		//System.out.println("Opción de crear directorio");
		System.out.println("Introduzca la ruta del directorio a crear:");
		ruta = sc.nextLine();
		
		f = new File (ruta);
		f.mkdir();
		result = f.mkdir(); 
		
		if (result = true)
			System.out.println("Directorio creado correctamente");
		else 
			System.out.println("Directorio no creado");
		
	}
	/**
	 * Borra un directorio
	 */
	public static void borrarDirectorio () {
		Scanner sc = new Scanner (System.in); 
		String ruta; 
		File f = null; 
		boolean result; 
		//boolean confirm;
		
		//System.out.println("Opción de borrar Directorio");
		System.out.println("Introduzca la ruta del directorio que desea borrar:");
		ruta = sc.nextLine(); 
		f = new File(ruta); 
		//System.out.println("¿Está seguro/a de borrar el directorio?"+" "+ruta); 
		f.delete();
		result = f.delete();
		if (result = true) 
			System.out.println("Directorio borrado correctamente");
		else 
			System.out.println("El directorio no ha podido ser borrado");
	}
	
	/**
	 * Crea un Fichero
	 */
	public static void crearFichero () {
		Scanner sc = new Scanner (System.in);
		File f = null; 
		String ruta;
		boolean result; 
		//System.out.println("Opción de crear Fichero");
		System.out.println("Introduzca la ruta donde quiere crear el fichero:");
		ruta = sc.nextLine();
		f = new File(ruta);
		try {
			result = f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se pudo crear el fichero");
		}
		if (result = true)
			System.out.println("Fichero creado correctamente");
		
			
		
	}
	/**
	 * Escribe en un fichero
	 */
	public static void escribirFichero () {
		//System.out.println("Opción de escribir Fichero");
		FileWriter fw = null;
		BufferedWriter bw = null; 
		Scanner sc = new Scanner (System.in);
		String ruta;
		String cadena;
		
		System.out.println("Introduzca el fichero sobre el que quiere escribir");
		ruta = sc.nextLine();
		
		System.out.println("Introduzca la cadena a escribir en el fichero");
		cadena = sc.nextLine();
		
		try {
			fw = new FileWriter(ruta);
			bw = new BufferedWriter (fw); 
			
			bw.write(cadena);
			
			
			//cerrar antes el BufferedWriter
			bw.close();
			fw.close();
			
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	
	}
	/**
	 * Leer un fichero
	 */
	public static void leerFichero () {
		//System.out.println("Opción de leer Fichero");
		FileReader fr = null; 
		BufferedReader br = null; 
		String linea =" "; 
		String totalLineas = " "; 
		Scanner sc = new Scanner (System.in);
		String ruta; 
		
		System.out.println("Introduzca el fichero a leer:");
		ruta = sc.nextLine();
		try {
			fr = new FileReader(ruta); 
			br = new BufferedReader(fr); 
			
			linea = br.readLine();
			while (linea != null) { 
				totalLineas = totalLineas+"\n"+linea; 
				linea = br.readLine();
			}
		
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
	 * Borra un fichero
	 */
	public static void borrarFichero () { 
		Scanner sc = new Scanner (System.in);
		File f = null; 
		String ruta;
		boolean result; 
		System.out.println("Introduzca la ruta del fichero que desea borrar:");
		ruta = sc.nextLine(); 
		f = new File (ruta); 
		result = f.delete();
		if (result = true)
			System.out.println("El fichero ha sido borrado correctamente");
		else 
			System.out.println("El ficho no ha podido ser borrado");
		
		//System.out.println("Opción de borrar Fichero");
	}	
	
	
	
	
	
	
	
	
	
}
