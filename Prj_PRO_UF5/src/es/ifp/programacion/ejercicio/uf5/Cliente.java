package es.ifp.programacion.ejercicio.uf5;

public class Cliente extends Persona {
	//Atributos de objeto
	
		private String codigoCliente;
		
		//Constructores 
		
		/**
		 * Constructor con todos los parametros para la clase Cliente
		 * @param nombre = String con el nombre del cliente 
		 * @param apellidos = String con el apellido del cliente 
		 * @param dni = string con el dni
		 * @param codigoCliente = String con el codigo del cliente 
		 */
		
		public Cliente (String nombre, String apellidos, String dni, String codigoCliente ) {
			super (nombre, apellidos, dni); 
			this.codigoCliente=codigoCliente;
			
		}

		//Metodos
		
		
	
		
		/**
		 * Metodo Get del codigo del cliente 
		 * @return String codigoCliente
		 */
		public String getCodigoCliente() {
			return codigoCliente;
		}

		/**
		 * Metodo set del codigoCliente, cambia el string codigoCliente
		 * @param codigoCliente  
		 */
		public void setCodigoCliente(String codigoCliente) {
			this.codigoCliente = codigoCliente;
		}
		
		/**
		 * Metodo de sobreescritura que me enseña datos de cliente por consola  *
		 */
		
		public String toString() {
			return  "\n" +
					"====================================================" + "\n"+
					"Codigo de cliente: " + codigoCliente + "\n" +
	                 super.toString(); 
		}
		
}
