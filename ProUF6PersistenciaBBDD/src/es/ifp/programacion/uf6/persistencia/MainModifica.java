package es.ifp.programacion.uf6.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class MainModifica {

	public static void main(String[] args) {
		Connection conexion = null; 
		ResultSet rs = null; 
	    int filasModificadas; 
		try { 
			
		//1.- Establecer la conexión con la BBDD 
		conexion = DriverManager.getConnection("jdbc:mysql://localhost/testDB?serverTimezone=Europe/Madrid" , "root","");
		
		//2.- Definir la consulta 
		
		String sql = "UPDATE usuarios SET apellido1=? WHERE idUsuario=?"; 
		
		//3.- Preparamos la consulta 
		PreparedStatement ps = conexion.prepareStatement(sql); 
		
		ps.setString(1, "Bolaños");
		ps.setInt(2, 1); 
		
		//4.- Ejecutamos la consulta 
		filasModificadas = ps.executeUpdate(); 
		System.out.println("Número de registros modificados: "+filasModificadas); 
		
		//5.- Ejecutamos consulta para ver todos los datos de la tabla 
		String sql2 = "SELECT * from usuarios ";
		
		rs = ps.executeQuery(sql2);
		
		//6.- Recorremos el resultset 
		while (rs.next()) 
		System.out.println("Nombre: "+rs.getString("nombre")+", apellidos: "+rs.getString("apellido1")+","+rs.getString("apellido2")+", idUsuario: "+rs.getInt("idUsuario"));
			
		} 
		catch (Exception e) {
			System.out.println("Error al actualizar y obtener datos de la BBDD"); 
			e.printStackTrace();
			} 
		finally {
			try {
			rs.close();
			conexion.close();
			} catch (Exception e) {
				System.out.println("Error al cerrar recursos de la BBDD");
				}
			
		}
		
		
		
		
		
		
		
		
	}

}
