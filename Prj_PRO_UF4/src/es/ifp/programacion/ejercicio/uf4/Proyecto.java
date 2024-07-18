package es.ifp.programacion.ejercicio.uf4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Proyecto {

	//Atributos 
	private String identificadorPro;
	private String nombrePro; 
	private String descPro;
	private Date fechaIni;
	private Cliente cliente1;
	private Jefe jefe1;
	
   //Constructores 
	
	/**
	 * Constructor con todos los parametros de la clase Proyecto
	 * @param identificadorPro = String con el identificador de Proyecto
	 * @param nombrePro = String con el nombre del proyecto
	 * @param descPro = String con la descripción del proyecto 
	 * @param fechaIni = clase de tipo fecha que me servirá para definir una fecha inicial
	 * @param cliente1 = clase de tipo cliente que me servirá para definir el cliente
	 * @param jefe1 = clase de tipo jefe que me servirá para definir el jefe 
	 */
	public Proyecto (String identificadorPro, String nombrePro, String descPro , Date fechaIni, Cliente cliente1, Jefe jefe1){
		this.identificadorPro=identificadorPro;
		this.nombrePro=nombrePro; 
		this.fechaIni=fechaIni;
		this.cliente1=cliente1;
		this.jefe1 = jefe1;
		this.descPro=descPro;
		}

	
	//Métodos 
	
	/**
	 * Metodo get del Identificador del proyecto
	 * @return String identificadorPro
	 */
	public String getIdentificadorPro() {
		return identificadorPro;
	}

	/**
	 * Metodo setIdentificadorPro que cambia el string identificadorPro
	 * @param identificadorPro 
	 */
	public void setIdentificadorPro(String identificadorPro) {
		this.identificadorPro = identificadorPro;
	}

	/**
	 * Metodo get del nombre del proyecto
	 * @return string nombrePro
	 */
	public String getNombrePro() {
		return nombrePro;
	}

	/**
	 * Metodo setNombrepro que cambia el string nombrePro
	 * @param nombrePro
	 */
	public void setNombrePro(String nombrePro) {
		this.nombrePro = nombrePro;
	}

	/**
	 * metodo get de la fecha inicial
	 * @return date fechaIni
	 */
	public Date getFechaIni() {
		return fechaIni;
	}

	/**
	 * Metodo setFechaIni que cambia el objeto de tipo Date 
	 * @param fechaIni
	 */
	public void setFechaIni(Date fechaIni) {
		this.fechaIni = fechaIni;
	}

	/**
	 * @return the cliente1
	 */
	public Cliente getCliente1() {
		return cliente1;
	}

	/**
	 * Metodo setCliente que cambia el string cliente1
	 * @param  cliente1
	 */
	public void setCliente(Cliente cliente1) {
		this.cliente1 = cliente1;
	}

	/**
	 * @return  jefe1 en un String   
	 */
	public Jefe getJefe() {
		return jefe1;
	}

	/**
	 * Metodo setJefe que cambia el string jefe1  
	 * @param jefe1
	 */
	public void setJefe(Jefe jefe1) {
		this.jefe1 = jefe1;
	}

	/**
	 * Metodo get de la descripción del proyecto
	 * @return String identificadorPro
	 */
	public String getdescPro() {
		return descPro;
	}

	/**
	 * Metodo set del descPro, cambia string descPro 
	 * @param descPro 
	 */
	public void setdescPro(String descPro) {
		this.descPro = descPro;
	}
	
	/**
	 * Metodo para obtener rol de cada persona involucrada en el proyecto 
	 * @return String con los roles de cada persona involucrada 
	 */
	
	public String getRoles() {
		return "Rol de Cliente: " + cliente1.getRol() + "\nRol de Jefe: " + jefe1.getRol(); 
	}
	
	
	
	/**
	 *Metodo toString que se sobreescribe para mostrar info por consola 
	 *Clase simpledate format para poder poner una fecha inicial 
	 */
	public String toString() { 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return  "====================PROYECTO==========================" + "\n" +
				"Identificador de Proyecto=" + identificadorPro + "\n" +
                "Nombre de Proyecto=" + nombrePro + "\n" +
                "Descripción=" + descPro + "\n" +
                "Fecha de inicio=" + dateFormat.format(fechaIni) + "\n" +
                cliente1 + "\n" +
                jefe1;
	}
	
	
	
	
	
}
