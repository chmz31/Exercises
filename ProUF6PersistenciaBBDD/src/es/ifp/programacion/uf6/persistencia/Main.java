package es.ifp.programacion.uf6.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

public class Main {

	public static void main(String[] args) { 
		Connection conexion=null;
		ResultSet rs=null; 
		
		
		try {
			
			//1.- Establecer la conexión con la BBDD. 	
		 conexion = DriverManager.getConnection("jdbc:mysql://localhost/testDB?serverTimezone=Europe/Madrid" , "root","");
		
			//2.- Preparamos la consulta 
		
		Statement sentencia = conexion.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
			//3.- Indicar la consulta SQL 
		String sql = "Select idUsuario, nombre, apellido1, apellido2 from usuarios";
		
			//4.- Ejecutamos la consulta 
	     rs = sentencia.executeQuery(sql); 
		
			//5.- Nos situamos en el último registro 
		rs.last();
		System.out.println("Número de filas obtenidas: "+rs.getRow()); 
		 
			//6.- Nos situamos en el primer registro 
		rs.beforeFirst();
		
		int idUsuario;
		String nombre, ape1, ape2;
			//7.- Recorremos el resultado de la consulta y visualizamos los datos por la consola 
		while (rs.next()) {
			
		idUsuario = rs.getInt(1); 
		nombre = rs.getString(2);
		ape1 = rs.getString(3);
		ape2 = rs.getString(4); 
	    
		System.out.print(" IdUsuario: "+idUsuario);
		System.out.print(" Nombre: "+nombre);
		System.out.print(" Apellido 1: "+ape1);
		System.out.print(" Apellido 2: "+ape2);
		}
		System.out.println("\n");
		
		
		} catch (SQLException e){
			e.printStackTrace();
		}
		
		finally { 
			 try { 
				 
				//cerrar los recursos  
				conexion.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
		}
		
		
	}

}
