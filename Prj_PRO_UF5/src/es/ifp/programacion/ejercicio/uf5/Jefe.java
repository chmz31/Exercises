package es.ifp.programacion.ejercicio.uf5;

public class Jefe extends Persona {

	//Declaracion de Atributos 
	
	private int numeroEmpleado;
	
	//Constructores 
	
	/**
	 * Constructor con todos los parametros para la clase Jefe
	 * @param nombre = String con el nombre del jefe 
	 * @param apellidos = string con los apellidos del jefe 
	 * @param dni = string con el dni del jefe 
	 * @param numeroEmpleado = int con el código de empleado que está en un rango entre 0 y 100
	 */
	
	public Jefe (String nombre, String apellidos, String dni, int numeroEmpleado){
		super (nombre, apellidos, dni); 
		//Me aseguro de que numeroEmpleado este entre 0 y 100
		this.numeroEmpleado = Math.max(0, Math.min(numeroEmpleado, 100)); 
		
	}

	//Metodos 
	
	
	
	/** Metodo get del numero del empleado
	 * @return numeroEmpleado en un int 
	 */
	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}

	/**
	 * Metodo setNumeroEmpleado del int numeroEmpleado, cambia el int por un numero del 0 al 100
	 * @param numeroEmpleado
	 */
	public void setNumeroEmpleado(int numeroEmpleado) {
	this.numeroEmpleado = Math.max(0, Math.min(numeroEmpleado, 100)); 	
	}
	
	/**
	 * Metodo para sobreescribir que me muestra por consola 
	 */
	public String toString() {
        return  "\n" +
        		"Numero de Empleado=" + numeroEmpleado +
                "\n" + super.toString();
	}
	
	
}
