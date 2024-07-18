package es.ifp.programacion.ejercicio.uf5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Iterator;

public class Proyecto {

	//Atributos 
	private String identificadorPro;
	private String nombrePro; 
	private String descPro;
	private Date fechaIni;
	private List<Cliente> clientes;
	private List<Jefe> jefes;
	
   //Constructores 
	
	
	/**
	 * Constructor con todos los parametros de la clase Proyecto
	 * @param identificadorPro = String con el identificador de Proyecto
	 * @param nombrePro = String con el nombre del proyecto
	 * @param descPro = String con la descripción del proyecto 
	 * @param fechaIni = clase de tipo fecha que me servirá para definir una fecha inicial
	 * @param clientes = lista de tipo Cliente
	 * @param jefes = lista de tipo Jefe
	 */
	public Proyecto (String identificadorPro, String nombrePro, String descPro , Date fechaIni, List<Cliente> clientes, List<Jefe> jefes){
		this.identificadorPro=identificadorPro;
		this.nombrePro=nombrePro; 
		this.fechaIni=fechaIni;
		this.clientes=clientes;
		this.jefes = jefes;
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
	 * @return lista de clientes 
	 */
	public List<Cliente> getClientes() {
		return clientes;
	}

	/**
	 * Metodo setCliente que cambia la lista clientes
	 * @param clientes
	 */
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	/**
	 * @return lista de jefes actual
	 */
	public List<Jefe> getJefe() {
		return jefes;
	}

	/**
	 * Metodo setJefe que cambia la lista set
	 * @param jefes
	 */
	public void setJefe(List<Jefe> jefes) {
		this.jefes = jefes;
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
	
	
	//Recorrido de la tabla Clientes usando un bucle for
   public void recorreClientes() {
	   System.out.println("Clientes:");
	   for (int i=0; i<clientes.size(); i++) {
		   System.out.println(clientes.get(i));
	   }
   }
	
	
	
	// Recorrido de la tabla Jefes usando un iterator
	public void recorreJefes() {
	   System.out.println("Jefes:");
	   for (Jefe jefe: jefes) {
		   System.out.println(jefe);
	   }
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
                clientes + "\n" +
                jefes;
	}
	
	
	
	
	
}