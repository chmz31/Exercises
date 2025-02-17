package es.ifp.programacion.ejercicio.uf6;

public class Employee { 
	
	/**
	 * Declaración de atributos
	 */
	private int empleadoid , salario;
	private String nombre , apellidos;
	
	/**
	 * Constructor por defecto
	 */
	
	public Employee (){
		
		this.empleadoid=0;
		this.nombre="";
		this.apellidos=""; 
		this.salario=0;
		
		
	}
 /**
  * Constructor con todos los atributos de clase  
  * @param empleadoid = Int con el número de id del empleado
  * @param salario = int con el número de salario del empleado
  * @param nombre = String con el nombre del empleado
  * @param apellidos = String con el apellido del empleado
  */
	public Employee(int empleadoid, String nombre, String apellidos, int salario) {
		
		this.empleadoid = empleadoid;
		this.nombre = nombre;
		this.apellidos = apellidos; 
		this.salario = salario;
		
		
	}

	/** 
	 * método get del atributo empleado
	 * @return the empleadoId en un int
	 */
	public int getEmpleadoid() {
		return empleadoid;
	}

	/**
	 * método get del atributo Salario
	 * @return the salario en un int 
	 */
	public int getSalario() {
		return salario;
	}

	/**
	 * método set del atributo salario
	 * @param salario the salario to set
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}

	/**
	 * método get del atributo nombre
	 * @return the nombre en un string 
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * método set del atributo nombre
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * método get del atributo apellidos
	 * @return the apellidos en un string 
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * método set del atributo apellidos
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	/**
	 * Sobreescribo el método to string
	 */
	@Override 
	public String toString() {
		return "============================================"+"\n"+
				"ID EMPLEADO: " + this.getEmpleadoid()+"\n"+
				"Nombre: "+this.getNombre()+"\n"+
				"Apellidos: "+this.getApellidos()+"\n"+
				"Salario: "+this.getSalario()+"\n"+
			   "===========================================";
	}
	
	
}
