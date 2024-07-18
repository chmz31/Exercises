package es.ifp.programacion.uf6.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainBorrado {

	public static void main(String[] args) {
		final String DBURL = "jdbc:postgresql://localhost:5432/testDB";
		Connection conexion = null; 
		Statement stmt = null;
		final String SQL_DELETE = "DELETE FROM usuarios WHERE \"idUsuario\" = 3";
		final String SQL_SELECT = "SELECT * FROM USUARIOS";
		int idUsuario;
		String nombre, ape1, ape2;
		ResultSet rs=null;
		int numFilas; 
	
		try {
			conexion = DriverManager.getConnection(DBURL, "postgres", "password");
			System.out.println("Conexión establecida correctamente");
			
			stmt = conexion.createStatement();
			numFilas = stmt.executeUpdate(SQL_DELETE);			
			System.out.println("Fila eliminada, Número de filas eliminadas: "+numFilas);
			System.out.println("Recuperamos los datos");
			
			rs = stmt.executeQuery(SQL_SELECT);
			
			while (rs.next()) {
				idUsuario = rs.getInt("idUsuario");
				nombre = rs.getString("nombre");
				ape1 = rs.getString("apellido1");
				ape2 = rs.getString("apellido2");
				
				System.out.println("==========================");
				System.out.println("ID: "+idUsuario);
				System.out.println("Nombre: "+nombre);
				System.out.println("Apellido 1: "+ape1);
				System.out.println("Apellido 2: "+ape2);
				System.out.println("==========================");
			}	
				
		
		
		
		
		
		
		} catch (SQLException e) {
			System.out.println(e.getMessage()); 
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
				conexion.close();
			} catch (Exception e) {
				System.out.println("Error al cerrar recursos");
				e.printStackTrace();
			}
		}
		

	}

}
