package es.ifp.programacion.poo.introduccion;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Conductor conductorJose = new Conductor ("Jose", "Gutierrez", 33, "jose@foo.es","A234FF23");
		
		String ape = conductorJose.getApellidos();
		System.out.println("Apellidos:"+ape);
		
	

	}

}
