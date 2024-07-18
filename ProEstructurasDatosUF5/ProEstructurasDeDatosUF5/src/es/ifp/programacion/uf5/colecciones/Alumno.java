package es.ifp.programacion.uf5.colecciones;

/**
 * Clase Alumno
 * @author juan
 *
 */

public class Alumno  {
	
	private String id;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String matricula;
	
	
	public Alumno(String id, String nombre, String apellidos, String telefono, String matricula) {
		this.setNombre(nombre);
		this.setId(id);
		this.setApellidos(apellidos);
		this.setTelefono(telefono);
		this.matricula = matricula;
	}

	
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	@Override
	public String toString() {
		return "Datos del alumno:\n"+
				"Nombre:"+this.nombre+"\n"+
				"Apellidos:"+this.apellidos+"n"+
				"Id:"+this.id+"\n"+
				"Teléfono:"+this.telefono+"\n"+
				"Matrícula:"+this.matricula;
	}
	
	

}
