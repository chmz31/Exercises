/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf6.exemplebasededades;

import java.sql.*;

/**
 *
 * @author alessandro
 */
public class UF6ExempleBaseDeDades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String DRIVER = "com.mysql.jdbc.Driver";
        final String BD_URL = "jdbc:odbc:dbcountry";
        final String USUARI = "usrcountry";
        final String PASSWORD = "pwdcountry";
        Connection conn = null;
        try {
            //carregar el driver
            Class.forName(DRIVER);
            //connexió amb la base de dades
            conn = DriverManager.getConnection(BD_URL, USUARI, PASSWORD);
            if (conn != null) {
                //crear un Statement per las consultas sql
                Statement stmt = conn.createStatement();
                String query = "SELECT * FROM COUNTRIES";
                //executar la consulta i obtenir el resultat en un ResulSet
                ResultSet res = stmt.executeQuery(query);
                //recórrer el ResultSet
                while (res.next()) {
                    //convertir dades a java
                    int id = res.getInt("id");
                    String nom = res.getString("name");
                    String capital = res.getString("capital");
                    double superficie_km2 = res.getDouble("surface");
                    double poblacio = res.getDouble("inhabitants");
                    double pib_dolars = res.getDouble("pib");
                    double esp_vida = res.getDouble("lifeexpectancy");
                    //printar dades
                    System.out.println(id + " \t" + nom + " \t " + capital + " \t " + superficie_km2
                            + " \t " + poblacio + " \t " + pib_dolars + " \t " + esp_vida);
                }
                res.close();
                stmt.close();
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error en la connexion sql: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Error con el driver: " + ex.getMessage());
        }
    }
}
