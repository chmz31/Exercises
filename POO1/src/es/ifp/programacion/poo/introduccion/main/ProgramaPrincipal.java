package es.ifp.programacion.poo.introduccion.main;

import es.ifp.programacion.poo.introduccion.Persona;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables (son de tipo primitivo o básico 
	/**	int num;
		Integer objNum;
		boolean cierto;
		Boolean objCierto;
		
		objNum = new Integer(3);
		objCierto = new Boolean(false) ;
	
	
	*/
		
		
		
		//Creamos objeto de tipo persona llamado Juan 
		Persona juan = new Persona("Juan","Sanchez",55); 
		//creamos un objeto de tipo Persona llamado ana
		Persona ana = new Persona ("Ana","Lamas",54); 
		
		ana.mirar();
		
		juan.mirar();
		System.out.println("Nacionalidad:"+Persona.nacionalidad); 
		
		ana.mirar("la montaña");
		
	}

}
