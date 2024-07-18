package es.ifp.programacion.ejercicio.uf5;
//JRE 19
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;



public class ProgramaPrincipal {

	public static void main(String[] args) {
		try {
			
			//Creo una fecha inicial 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
			Date fechaIni = dateFormat.parse("2022-01-01");
			
			//creacion de multiples jefes y clientes con mis contructores
			List<Cliente> clientes = new ArrayList<>();
			clientes.add(new Cliente("00001", "Juan", "Perez", "DDDDDDNNNIIII")); 
			clientes.add(new Cliente("00002", "Roberto", "Carmona", "DDDDDDNNNNIII2"));
			
			List <Jefe> jefes = new ArrayList<>();
			jefes.add(new Jefe("Roberto","Carlos", "Y0000000A", 55));
			jefes.add(new Jefe("Carles", "Bobinsky", "Y0000000B", 44));
			
		    //Creacion de proyecto con multiples clientes y jefes 
			
			Proyecto proyecto = new Proyecto ("P1", "Nombre de Proyecto", "Es un proyecto nuevo", fechaIni, clientes, jefes);
			
			//Informacion de proyecto 
			System.out.println(proyecto);
			
			// Clientes y jefes 
			
			proyecto.recorreClientes();
			proyecto.recorreJefes();
			
			
			
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
	}
