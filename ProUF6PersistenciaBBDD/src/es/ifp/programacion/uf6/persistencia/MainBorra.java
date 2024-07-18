package es.ifp.programacion.uf6.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class MainBorra {

	public static void main(String[] args) {
        final String dbURL = "jdbc:mysql://localhost/testDB?serverTimezone=Europe/Madrid"; 
		Connection conexion = null;
		ResultSet rs = null; 
		PreparedStatement ps = null; 
		int numFilas; 
		String sql, sql2; 
		
		try {
			conexion = DriverManager.getConnection(dbURL , "root","");
			sql = "DELETE FROM USUARIOS WHERE idUsuario=?";
			ps = conexion.prepareStatement(sql);
			ps.setInt(1, 1);
			
			numFilas = ps.executeUpdate();
			System.out.println("Número de filas eliminadas: "+numFilas);

			sql2 = "Select * from usuarios";
			
			ps = conexion.prepareStatement(sql2);
			rs= ps.executeQuery();
			
			while (rs.next()) 
				System.out.println("Nombre: "+rs.getString("nombre")+", apellidos: "+rs.getString("apellido1")+","+rs.getString("apellido2")+", idUsuario: "+rs.getInt("idUsuario"));
			
		} catch (SQLException sqle) { 
			
		} finally {
			try {
			rs.close();
			conexion.close();
		} catch (Exception e) {
			System.out.println("Error al cerrar recursos");
		}
		}		
		
		
		

	}

}
