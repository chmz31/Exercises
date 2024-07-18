package es.ifp.programacion.poo.introduccion;

public abstract class Conductor extends Persona {

	//Atributos de la clase 
	
	//Los atributos de la clase padre se heredan de la clase hija 
	//Es como si en la clase conductor tuviesemos también los atributos de la clase persona
	//Pero sin tener que definirlos 
	
	private String numCarnetConducir; 
	
	//Constructores 
	/**
	 * Constructor de la clase Conductor que invoca al constructor 
	 * de la clase padre Persona.
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 * @param correo
	 * @param numCarnetConducir
	 */
	public Conductor(String nombre, String apellidos, int edad, String correo, String numCarnetConducir) {
		
		//Con la palabra reservada super llamamos a un constructor 
		//de la clase padre
		super(nombre, apellidos, edad, correo);
		this.setNumCarnetConducir(numCarnetConducir); 
		
		
	}

	//metodos 
	
	 public abstract String getCarnet(); 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Método que retorna el carnet de conducir 
	 * @return the numCarnetConducir string con el carnet de conducir 
	 */
	public String getNumCarnetConducir() {
		return numCarnetConducir;
	}

	/**
	 * Método que modifica el carnet de conducir de una persona
	 * @param numCarnetConducir the numCarnetConducir to set modifica car
	 */
	public void setNumCarnetConducir(String numCarnetConducir) {
		this.numCarnetConducir = numCarnetConducir;
	}
	
	
	
}
