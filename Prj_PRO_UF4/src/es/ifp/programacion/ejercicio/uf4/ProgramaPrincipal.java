package es.ifp.programacion.ejercicio.uf4;
//JRE 19
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
/**
 * Para solucionar este problema, he creado 3 clases a parte del programa inicial y una interfaz
 * una es la clase persona, de la que se heredan los nombres, apellidos, y dni en las clases 
 * Jefe y Cliente, y gracias a la implementación de la interfaz IRol, se implementa un método en 
 * las clases Persona (Metodo implementado que devuelve ""), Jefe (metodo implementado que devuelve rol "JP"
 * y Cliente (metodo implementado que duelve "CLI", en mi clase Proyecto he creado los constructores necesarios 
 * para usar en mi ProgramaPrincipal, para crear el objeto proyecto con sus respectivos atributos necesarios, 
 * Y finalmente, en mi ProgramaPrincipal, he creado los objetos necesarios usando sus respectivos constructores, 
 * he usado la clase SimpleDateFormat para darle formato y poder crear mi objeto fechaIni, para poder asignarle una 
 * fecha inicial al Proyecto, al crear el SimpleDateFormat y parsear un String con la clase Date, necesito crear un bloque
 * Try que lo contenga, seguido de un catch con la excepción, además en mi programa principal hago una llamada a el método
 * .getRoles contenido en la clase Proyecto para enseñar por pantalla los roles del cliente y usuario, y finalmente, la 
 * salida de información por pantalla.
 * 
 * He decidido utilizr las clases SimpleDateFormat y Date juntas para parsear y formatar la información de fecha
 * SimpleDateFormat me permite formatar y parsear fechas usando un formato especifico, en este caso, usando "yyyy-MM-dd"
 * que representa "año-mes-dia" como en el uso inglés.
 * el dateFormat.parse("2022-01-01") se utiliza para transformar un string, en este caso, lo que está dentro del parentesís,
 * que además coincide con el formato especifico descrito en dateFormat.parse, el string se "transforma" en un objeto "fecha" 
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		try {
		
		//Creo una fecha inicial 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
		Date fechaIni = dateFormat.parse("2022-01-01");
		
		//creacion de objetos con mis constructores 
		Cliente cliente1 = new Cliente("Carlos", "Sanchez", "AAAAAAA", "1234"); 
		Jefe jefe1 = new Jefe("Juan", "Jimenez", "AAAABBBBB", 44);
		Proyecto pro1 = new Proyecto ("P1", "ProyectoNuevo", "Es un proyecto nuevo", fechaIni,cliente1,jefe1);
		
		//Salida de informacion del proyecto
		System.out.println(pro1);
		
		//Roles de las personas involucradas en el proyecto 
		System.out.println("\nRoles:");
		System.out.println(pro1.getRoles());
		
		
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}