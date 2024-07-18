/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Model.Country;
import Vista.Vista;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alessandro
 */
public class DAOcountries {

    Vista vista = new Vista();
    String QUERY_NEVERLAND = "INSERT INTO countries VALUES (null,'Wonderland','Capital',1000,0,10000,25000)";
    String QUERY_SELECT_ALL = "SELECT * FROM countries";
    String QUERY_ESPERANZA = "SELECT * FROM countries where lifeexpectancy > ?";

    public void insertNeverlandCountry() {
        System.out.println("Insert...");
        Connection conn = DatabaseConnect.getConnection();
        if (conn != null) {
            try {
                //conexion exitosa
                Statement stm = conn.createStatement();
                String query = "INSERT INTO countries VALUES (null,'Wonderland','Capital',1000,0,10000,25000)";
                int numFilasAfectadas = stm.executeUpdate(query);
                System.out.println("Se han aplicado: " + numFilasAfectadas + " cambios");
                stm.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println("Error de SQL: " + ex.getMessage());
            }
        }
    }

    public void insertNewCountry(Country c) {
        System.out.println("Insert...");
        Connection conn = DatabaseConnect.getConnection();
        if (conn != null) {
            try {
                //conexion exitosa
                Statement stm = conn.createStatement();
                int numFilasAfectadas = stm.executeUpdate(QUERY_NEVERLAND);
                System.out.println("Se han aplicado: " + numFilasAfectadas + " cambios");
                stm.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println("Error de SQL: " + ex.getMessage());
            }
        }
    }

    public void showAllCountries() {
        System.out.println("Show all: ");
        Connection conn = DatabaseConnect.getConnection();
        //comrpuebo
        if (conn != null) {
            try {
                //statemenet
                Statement stm = conn.createStatement();
                ResultSet res = stm.executeQuery(QUERY_SELECT_ALL);
                //mostrar resultado
                vista.imprimirTodosLosPaises(res);
            } catch (SQLException ex) {
                System.out.println("Error con SQL: " + ex.getMessage());
            }
        }
    }

    public Country pedirDatosPais() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dime id: ");
        int id = scan.nextInt();
        System.out.print("Dime nombre: ");
        String name = scan.nextLine();
        System.out.print("Dime capital: ");
        String capital = scan.nextLine();
        System.out.print("Dime superficie: ");
        double surface = scan.nextDouble();
        System.out.print("Dime habitantes: ");
        double habitantes = scan.nextDouble();
        System.out.print("Dime PIB: ");
        double pib = scan.nextDouble();
        System.out.print("Dime esperanza de vida: ");
        double lifeexpectancy = scan.nextDouble();
        return (new Country(id, name, capital, habitantes, surface, pib, lifeexpectancy));
    }

    public void showCountriesEsperanza() {
        System.out.println("Esperanza de vida: ");
        ArrayList<Country> lista = new ArrayList<>();
        String vida = "77";
        Connection conn = DatabaseConnect.getConnection();
        //comrpuebo
        if (conn != null) {
            try {
                //statemenet
                PreparedStatement stm = conn.prepareStatement(QUERY_ESPERANZA);
                stm.setString(1, vida);
                ResultSet res = stm.executeQuery();
                while (res.next()) {
                    int id = res.getInt("id");
                    String name = res.getString("name");
                    String capital = res.getString("capital");
                    double surface = res.getDouble("surface");
                    double habitantes = res.getDouble("inhabitants");
                    double pib = res.getDouble("pib");
                    double lifeexpectancy = res.getDouble("lifeexpectancy");
                    Country aux = new Country(id, name, capital, habitantes, surface, pib, lifeexpectancy);
                    lista.add(aux);
                }
                //mostrar resultado
                vista.imprimeArrayListPaises(lista);
            } catch (SQLException ex) {
                System.out.println("Error con SQL: " + ex.getMessage());
            }
        }
    }
}
