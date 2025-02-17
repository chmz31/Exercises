package es.ifp.programacion.ejercicio.uf5;

public class Persona{
	
	//Declaración de Atributos de objeto
	
	private String nombre;
	private String apellidos;
	private String dni;
	
	//Constructores 
	
	/**
	 * Construcor por defecto 
	 */
	public Persona (){
		this.nombre = "";
		this.apellidos = "";
		this.dni = "";
	}

	/**
	 * Constructor con todos los parametros de atributo 
	 * @param nombre String con el nombre de la persona 
	 * @param ape String con el apellido de la persona 
	 * @param dni string con el dni de la persona 
	 */
	public Persona (String nombre, String ape, String dni){
		this.nombre=nombre; 
		this.apellidos=ape;
		this.dni=dni;
	
	}
   
	//Metodos 
	
	/**
	 * Metodo get que me devuelve los apellidos 
	 * @return string con apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Metodo get que me devuelve el dni
	 * @return String con dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Metodo get que me devuelve el nombre 
	 * @return string con nombre
	 */
	public String getNombre() {
		return nombre;
	}
	 
	
	/**
	 * Implemento metodo de la interfaz IRol
	 */
	public String getRol() {
		return "";
	}
	
	/**
	 * Metodo que me sobreescribe para mostrar por consola 
	 */
	public String toString() {
	        return  "nombre=" + nombre + "\n" +
	                "apellidos=" + apellidos + "\n" +
	                "DNI=" + dni + "\n" +
	                "===================================================="; 
	}	

}
