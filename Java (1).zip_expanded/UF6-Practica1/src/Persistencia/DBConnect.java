/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alessandro
 */
public class DBConnect {

    static final String DRIVER = "com.mysql.jdbc.Driver";
    static final String PROTOCOL = "jdbc:mysql";
    static final String HOST = "127.0.0.1";
    static final String DB_NAME = "cinesdb";
    static final String USER = "myusr";
    static final String PASSWORD = "mypwd";

    static public void loadDriver() {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException ex) {
            System.out.println("Error con el driver: " + ex.getMessage());
        }
    }

    static public Connection getConnection() {
        String BD_URL = String.format("%s://%s/%s", PROTOCOL, HOST, DB_NAME);
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(BD_URL, USER, PASSWORD);
        } catch (SQLException ex) {
            System.out.println("Error con SQL: " + ex.getMessage());
        }
        return conn;
    }
}
