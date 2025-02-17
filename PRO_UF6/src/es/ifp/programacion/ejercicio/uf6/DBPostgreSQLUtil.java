package es.ifp.programacion.ejercicio.uf6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class DBPostgreSQLUtil { 
	
	//URL, Username y contraseña
	//Y variables
	private static final String URL = "jdbc:postgresql://localhost:5432/empresaDB";
	private static final String USER = "postgres";
	private static final String PASS = "password"; 
	private static  Connection conexion = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;  
	private static int numLin;
	private static PreparedStatement pstmt = null; 
	/**
	 * Se conecta a la BBDD empresadb creada en postgreSQL.
	 * @return true si la conexiÃ³n fue satisfactoria, false sino.
	 */
	public boolean connectToDB() { 
		
		try {
			conexion = DriverManager.getConnection(URL,USER,PASS);
			return true;
		} catch (SQLException e) {
			System.out.println("Error al conectar a la base de datos");
			return false;
		}
		
	}
	
	/**
	 * A partir de un objeto empleado, inserta todos sus datos en la tabla empleados.
	 * @param emp Objeto de tipo empleado
	 * @return 0 si no se ha insertado valor alguno. En caso contrario, el nÃºmero de filas insertadas.
	 */
	public int insertarEmpleado(Employee emp) {
		
		try { 
			if (!connectToDB()) {
				System.out.println("Error al conectar a la base de datos");
				return 0; //Devuelve 0 si la conexión falla
			} 
			
		//Creo mi statement usando la consulta de la clase SQLClassEjercicio	
			pstmt = conexion.prepareStatement(SQLClassEjercicio.SQL_INSERT);
		//Establesco valores para los parametros 
			pstmt.setInt(1, emp.getEmpleadoid());
			pstmt.setString(2, emp.getNombre());
			pstmt.setString(3, emp.getApellidos());
			pstmt.setInt(4, emp.getSalario());
		//Ejecuto 	
			numLin = pstmt.executeUpdate();
		//Retorna el numero de lineas insertadas
			return numLin > 0 ? numLin : 0; //Retorna 0 en caso de que no se hayan insertado lineas
		} catch (SQLException e) {
			System.out.println("Error al insertar en la base de datos, por favor asegurarse que no se repita el idUsuario");
			return 0; //retorna 0 si ocurre una excepcion
		} finally {
			closeResources(); //Cierra los recursos 
		}
	}
	
	/**
	 * Cierra todos los recurses relativos a la BBDD
	 * @return true si la operaciÃ³n fue correcta, false sino.
	 */
	public boolean closeResources() {
	    try {
	        // Cierra el ResultSet si no es null
	        if (rs != null && !rs.isClosed()) {
	            rs.close();
	        }

	        // Cierra el Statement si no es null
	        if (stmt != null && !stmt.isClosed()) {
	            stmt.close();
	        }

	        // Cierra el PreparedStatement si no es null
	        if (pstmt != null && !pstmt.isClosed()) {
	            pstmt.close();
	        }

	        // Cierra la conexion si conexion no es null
	        if (conexion != null && !conexion.isClosed()) {
	            conexion.close();
	        }

	        return true; // Los recursos se han cerrado correctamente
	    } catch (SQLException e) {
	        System.out.println("Error al cerrar los recursos: " + e.getMessage());
	        return false; // Los recursos no se han cerrado correctamente
	    }
	}
	/**
	 * Obtiene todos los registros de la tabla empleados
	 * @return un ArrayList de objetos de tipo Empleado mapeados a los registros de la tabla.
	 */
	public ArrayList<Employee> getAllEmpleados(){
		ArrayList<Employee> employees = new ArrayList<>();
		//Check de que la conexión se ha realizado correctamente con mi método connectToDb
		if (!connectToDB()) {
			System.out.println("Fallo al conectar a la base de datos");
			return employees; // Devuelve una lista vácia dado que la conexión ha fallado 
			} 
		try {
			//Creo mi statement 
			stmt = conexion.createStatement();
			//Ejecuto la query de la clase SQLClassEjercicio
			rs = stmt.executeQuery(SQLClassEjercicio.SQL_GETALL);
			//Recorro 
			while (rs.next()) {
				int empleadoid = rs.getInt("empleadoid");
				String nombre = rs.getString("nombre");
				String apellidos = rs.getString("apellidos");
				int salario = rs.getInt("salario");
				
				//Creo objeto Empleado y se añade a la lista 
				Employee employee = new Employee(empleadoid,nombre, apellidos, salario);
				employees.add(employee);
			}
		} catch (SQLException e) {
			System.out.println("Error al enseñar lista");
			} finally {
				closeResources();
			}
		return employees;
	}
	/**
	 * Borra el registro de la tabla asociado al objeto emp pasado como parÃ¡metro
	 * @param emp objeto Empleado que se elimina de la BBDD
	 * @return true si el borrado fue correcto, false sino.
	 */
	public boolean deleteEmpleado(Employee emp) {
		try {
			if (!connectToDB()) {
				System.out.println("Error al conectarse a la base de datos");
				return false; //Retorna falso si falla la conexion
			}
			//PreparedStatement con la query parametrizada de la clase SQLClassEjercicio
			pstmt = conexion.prepareStatement(SQLClassEjercicio.SQL_DELETE); 
			
			//Establesco el valor para el parametro (idempleado)
			 pstmt.setInt(1, emp.getEmpleadoid());
			
			//Ejecuto el statement delete 
			  numLin = pstmt.executeUpdate();
			
			  // Return true si al menos una linea fue borrada, si no, false
	            return numLin > 0;
		} catch (SQLException e) {
			System.out.println("Error al borra datos");
			return false; //Devuelve falso si ocurre una excepcion 
		} finally {
			closeResources(); 
		}
		
		
	}
	
}
	
	    
	   
