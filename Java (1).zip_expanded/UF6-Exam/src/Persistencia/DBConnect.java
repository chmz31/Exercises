/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumne
 */
public class DBConnect {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String BD_URL = "jdbc:mysql://" + "127.0.0.1/hospital";
    private static final String USUARI = "usrhospital";
    private static final String PASSWORD = "pwdhospital";

    public DBConnect() throws ClassNotFoundException {
        Class.forName(this.DRIVER);
    }

    /**
     *
     * @return a connection privete
     * @throws SQLException if a connection error occurs
     */
    public Connection getConnection() throws SQLException { //nos devuelve la conexion a la base de datos
        Connection conn = DriverManager.getConnection(BD_URL, USUARI, PASSWORD);
        return conn;
    }
}
