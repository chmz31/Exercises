package es.ifp.programacion.poo.introduccion;

public class ConductorCamion extends Conductor implements IConductorCamion{ 
	
	
	private String licenciaCamion; 
	
	//Constructores 
	
	public ConductorCamion(String nombre, String apellidos, int edad, String correo, String numCarnetConducir, String licenciaCamion) {
		super (nombre, apellidos, edad, correo, numCarnetConducir);
		
	}
	
	
	//metodos 
	
	public String getCarnet () { 
		return licenciaCamion;
	}
	
	
	
	

}
