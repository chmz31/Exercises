package es.ifp.programacion.ficheros.operaciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String fichero = "file.txt";
		String lineasFichero; 
		
		escribirFicheroTexto (fichero, "Mi primera escritura con fw", false); 
		escribirFicheroTexto (fichero, "Mi primera escritura con fw", true); 
        
		lineasFichero = leerFicheroTexto(fichero); 
		System.out.println(lineasFichero);
		
	}
		
	

	/**
	 * Método que escribe en un fichero de textos una cadena pasada como parametro
	 * @param rutaFichero ruta del fichero a escribir
	 * @param cadena String a escribir en el fichero
	 * @param tipo si es true se añade al final, sino se sobreescribe
	 */
	public static void escribirFicheroTexto(String rutaFichero, String cadena, boolean tipo) { 
		File fichero = null; 
		
		//Clases para escribir 
		FileWriter fw = null; 
		PrintWriter pw = null; 
		BufferedWriter bw = null; 
		
		
		//Escritura en archivo de texto 
				//pw.println("Primera linea");
				//pw.print("Segunda linea");
				//pw.print("Otra cadena en la segunda linea"); 
				
		//Escritura en archivos de texto 
				try {
				    fichero = new File(rutaFichero); 
					fw = new FileWriter(fichero, tipo); 
					//pw = new PrintWriter(fw);
					bw = new BufferedWriter(fw); 
				}
				catch(IOException ioe) {
					System.out.println("Excepción al crear el FileWriter");
					ioe.printStackTrace();
				} 
		
				try {
				bw.write(cadena);
				bw.write("\n");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				
				//Cierro flujos 
				try { 
					bw.close();
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		
		
		
	}
	
	public static String leerFicheroTexto(String rutaFichero) {
	
		File fichero = null;
		FileReader fr = null; 
		BufferedReader br = null; 
		String linea = null; 
		String totalLineas = ""; 
		
		//Lectura de archivos de texto 
		
		try {
			fichero = new File(rutaFichero);
			fr = new FileReader(fichero); 
			br = new BufferedReader(fr); 
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} 
		
		try {
			
			linea = br.readLine();
			while (linea != null) { 
				totalLineas = totalLineas+"\n"+linea; 
				linea = br.readLine();
			}
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		try {
		fr.close();
		br.close();
		} catch (IOException io) {
			io.printStackTrace();
		
	
	
	
	}	
		return totalLineas; 
		
	}
}
