package es.ifp.programacion.ficheros.sistemaarchivos;


import java.io.File; 
import java.io.IOException;


public class main {

	public static void main(String[] args) {
		boolean fichCreado;
		
		File fichero = new File("file.txt"); 
		
		if (fichero.exists()) {
			System.out.println("El fichero existe");
		}
		else {
			System.out.println("El fichero no existe"); 
			System.out.println("Se crea el fichero file.txt");
			
			try { 
				
				fichCreado = fichero.createNewFile();
			
			}
			catch(IOException ioe) {
			System.out.println("Error al crear el fichero");
			
		} 
			finally {
				System.out.println("Se ejecuta siempre el finally");
			}
	 
		}
		System.out.println("Nombre del fichero con getName():"+fichero.getName());
		System.out.println("Directorio padre con getParent():"+fichero.getParent());
		System.out.println("La ruta absoluta del fichero con getAbsolutePath():"+fichero.getAbsolutePath());
		System.out.println("La longitud del fichero con length():"+fichero.length());
		System.out.println("¿Es un directorio? con isDirectory():"+fichero.isDirectory());
		System.out.println("¿Es un fichero? con isFile():"+fichero.isFile());
		System.out.println("¿Se puede ejecutar el fichero? con canExecute():"+fichero.canExecute());
		System.out.println("¿Es un fichero oculto? con isHidden():"+fichero.isHidden());
	
	
	
	
	
	
	
	
	
	
	}
	
	

}
