package es.ifp.programacion.poo.introduccion;
/**
 * Clase que refleja una dirección física compuesta 
 * de calle, número, problación y CP
 * Definimos un constructor y los 
 * métodos get-set correspondientes 
 */
public class Direccion {

	//Definición de atributos 
	private String calle; 
	private String numero; 
	private String poblacion;
	private String codigoPostal; 
	
	
	/**
	 * Constructor con todos los parámetros
	 * @param calle
	 * @param numero
	 * @param poblacion
	 * @param codigoPostal
	 */
	public Direccion(String calle, String numero,
			String poblacion, String codigoPostal) {
		this.calle=calle;
		this.numero=numero;
		this.poblacion=poblacion;
		this.codigoPostal=codigoPostal;
		
	}


	/**
	 * @return the calle
	 */
	public String getCalle() {
		return calle;
	}


	/**
	 * @param calle the calle to set
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}


	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}


	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}


	/**
	 * @return the poblacion
	 */
	public String getPoblacion() {
		return poblacion;
	}


	/**
	 * @param poblacion the poblacion to set
	 */
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}


	/**
	 * @return the codigoPostal
	 */
	public String getCodigoPostal() {
		return codigoPostal;
	}


	/**
	 * @param codigoPostal the codigoPostal to set
	 */
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	
	
}
