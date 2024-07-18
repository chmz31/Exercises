package es.ifp.programacion.poo.introduccion;

/**
 * Definición de la clase Persona
 * Una persona se compone de nombre, apellidos y edad 
 * 
 * 
 * 
 * Nuevo requisito:
 * Además tiene una dirección física: Calle, número, problación y CP.
 * 
 */

public class Persona { 
	
	//Atributos de objetos 
	
	private String nombre; 
	private String apellidos; 
	private int edad; 
	private String correoElectronico;
	
	//Por composición creo un atributo para la dirección
	//de la persona
	private Direccion direccionPersona;
	
	
	

	
	//Atributo de clase 
	public static String nacionalidad = "España"; 
	
	//Constructores 
	/**
	 * Constructor por Defecto
	 */
	public Persona(){
		nombre="";
		apellidos="";
	    correoElectronico="";
		edad=0;
	}
	/**
	 * Constructor con 3 parámetros: 
	 * @param nom
	 * @param ape
	 * @param ed
	 */
	public Persona(String nom, String ape, int ed){
		nombre = nom; 
		apellidos = ape;
		edad = ed; 
	}
	
	/**
	 * Constructor con todos los parametros
	 * @param nom nombre 
	 * @param ape apellido 
	 * @param edad edad 
	 * @param correo correo electronico de la persona
	 */
	public Persona(String nom, String ape, int ed, String correo){
		this.nombre = nom; 
		this.apellidos = ape;
		this.edad = ed;
		this.correoElectronico = correo; 
	}
	
	/**
	 * Método get del atributo nombre que retorna el nombre 
	 * de la persona
	 * @return String con el nombre de la persona 
	 */
	public String getNombre() {
		return this.nombre;
	} 
	/**
	 * Método get del atributo apellidos que retonar apellidos 
	 * de la persona
	 * @return String con apellidos de la persona
	 */
	public String getApellidos() {
		return this.apellidos;
	}
	
	/**
	 * Método get del atributo edad que retorna la edad de la persona
	 * @return entero edad de la persona
	 */
	public int getEdad() {
		return this.edad;
	}
	/**
	 * Método get del atributo correoElectronico 
	 * @return un string con el correo de la persona
	 */
	public String getCorreo() {
		return this.correoElectronico;
	}
	
	/**
	 * Método set del atributo nombre que cambia el nombre de la persona
	 * @param nuevoNombre nuevo valor String a asignar a la persona
	 */
	public void setNombre (String nuevoNombre) {
		this.nombre=nuevoNombre;
	}
	/**
	 * Método set del atributo apellido que cambia el apellido de la persona
	 * @param nuevoNombre nuevo valor String a asignar a la persona
	 */
	public void setApellidos (String nuevoApellido) {
		this.apellidos=nuevoApellido;
	}
	/**
	 * Método set del atributo edad que cambia la edad de la persona
	 * @param nuevoNombre nuevo  valor int a asignar a la persona
	 */
	public void setEdad (int nuevaEdad) {
		this.edad=nuevaEdad;
	}
	/**
	 * Método set del atributo correoElectronico que cambia el correo de la persona
	 * @param nuevoNombre nuevo valor String a asignar a la persona
	 */
	public void setCorreo (String nuevoCorreo) {
		this.correoElectronico=nuevoCorreo;
	}
	
	/**
	 * public void cambiarCorreoElectronic (String correoElectronico) {
	 
		this.correoElectronico=correoElectronico; 
	}
	 
	public void mirar () {
		System.out.println(this.nombre+" esta mirando");
		System.out.println("Nacionalidad"+""+nacionalidad);
	}
	
	public void mirar (String paisaje) {
		System.out.println(this.nombre+"esta mirando"+paisaje);
	}
	//Métodos de la clase 
	/**
	 * Acción de mirar de la persona
	 */
//	public void mirar() {
//		metodoPrivado();
//	}
	/**
	 * 
	 */
//	public void cambiarApellido () {
//		apellidos = "Santana Santana";
		
//	}
/**
 * 
 */
//	private void metodoPrivado() {
//		System.out.println("Estás en la clase Persona cuyo nombre es:"+""+nombre);
//	}
	
}
