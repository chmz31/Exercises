/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Model.Country;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author alessandro
 */
public class Vista {
    
    public void imprimirTodosLosPaises(ResultSet res) {
        try {
            while (res.next()) {
                //Convertir a java
                int id = res.getInt("id");
                String name = res.getString("name");
                String capital = res.getString("capital");
                double surface = res.getDouble("surface");
                double habitantes = res.getDouble("inhabitants");
                double pib = res.getDouble("pib");
                double lifeexpectancy = res.getDouble("lifeexpectancy");
                Country aux = new Country(id, name, capital, habitantes, surface, pib, lifeexpectancy);
                System.out.println(aux);
                
            }
        } catch (SQLException ex) {
            System.out.println("Error con SQL: " + ex.getMessage());
        }
        
    }
    
    public void imprimeArrayListPaises(ArrayList<Country> al) {
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
