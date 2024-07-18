package es.ifp.programacion.uf5.colecciones;

import java.util.*;


public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Alumno> lList = new LinkedList<Alumno>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1.- Crear un alumno");
		System.out.println("2.- Obtener datos de un alumno por id");
		System.out.println("3.- Mostrar todos los alumnos");
		
		
		//Simulamos que los datos de entrada por teclado son estos.
		Alumno alumno = new Alumno("ALU003","Antonio", "Guti Sanz", "654332211", "MAT9837");
		lList.add(alumno);
		Alumno alumno2 = new Alumno("ALU333","Antonio2", "Guti3 Sanz3", "6543311", "MAT37");
		lList.add(alumno2);
		Alumno alumno3 = new Alumno("ALU444","Antonio3", "Guti2 Sanz2", "6332211", "M9837");
		lList.add(alumno3);
		
		System.out.println("Introduzca el id a buscar:");
		String id = sc.nextLine();
		
		Iterator<Alumno> it =  lList.iterator();
		
		Alumno tmp;
		
		while (it.hasNext()) {
			 tmp = it.next();
			 System.out.println(tmp.toString());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
