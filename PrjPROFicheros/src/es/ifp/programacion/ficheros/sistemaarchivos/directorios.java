package es.ifp.programacion.ficheros.sistemaarchivos;


import java.io.File;

public class directorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		File dir = new File("miDirectorio"); 
		boolean creado;
		if (dir.exists()) {
			System.out.println("El directorio "+dir+"existe.");
			
		}
		else {
			System.out.println("El directorio "+dir+"NO existe.");
			creado = dir.mkdir();
			System.out.println("¿El directorio ha sido creado?"+creado);
		
		}
		if(dir.canRead())
			System.out.println("El directorio se puede leer");
		else 
			System.out.println("El directorio no se puede leer");
		
		
		if (dir.canWrite())
			System.out.println("El directorio se puede escribir");
		else 
			System.out.println("El directorio no se puede escribir");
		
	}

}
