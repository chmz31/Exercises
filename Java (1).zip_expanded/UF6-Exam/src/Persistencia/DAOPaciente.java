/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Modelo.Paciente;
import Vista.Vista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author alessandro
 */
public class DAOPaciente implements IPaciente {

    Vista vista;
    private final String QUERY_DELETE_PACIENTE_BY_ID = "DELETE FROM pacientes where idPaciente = ?";
    private final String QUERY_SELECT_NOMBRE = "SELECT * FROM pacientes WHERE nom = ?";
    private final String QUERY_SELECT_ALL = "SELECT * FROM pacientes";
    private final String QUERY_COUNT_NAMES = "select count(*) from pacientes WHERE nom = ?";
    private final String QUERY_ADD_PACIENTE = "INSERT INTO pacientes VALUES (?, ?, ?, ?, ?)";

    @Override
    public void buscarPacientesNombre(String nombre) {
        try {
            DBConnect db = new DBConnect();
            Connection conn = db.getConnection();
            if (conn != null) {
                //statemenet
                PreparedStatement pst = conn.prepareStatement(QUERY_SELECT_NOMBRE);
                pst.setString(1, nombre);
                ResultSet res = pst.executeQuery();
                imprimirResultado(res); //imprimimos todos los resultados

                PreparedStatement pst2 = conn.prepareStatement(QUERY_COUNT_NAMES);
                pst2.setString(1, nombre);
                ResultSet rs = pst2.executeQuery();
                //Recuperamos el resultado de la consulta
                rs.next();
                int count = rs.getInt(1);
                Vista.imprimePantalla("Numero de pacientes con ese nombre: " + count+"\n");
            }
        } catch (ClassNotFoundException ex) {
            Vista.imprimePantalla("Error con la clase: " + ex.getMessage());
        } catch (SQLException ex) {
            Vista.imprimePantalla("Error con SQL: " + ex.getMessage());
        }
    }

    @Override
    public void agregarPaciente(Paciente p) {
        Scanner scan = new Scanner(System.in);
        try {
            DBConnect db = new DBConnect();
            Connection conn = db.getConnection();
            if (conn != null) {
                //statemenet
                PreparedStatement pst = conn.prepareStatement(QUERY_ADD_PACIENTE);
                try {
                    pst.setInt(1, p.getIdPaciente());
                    pst.setString(2, p.getNom());
                    pst.setString(3, p.getCognom());
                    pst.setInt(4, p.getEdat());
                    pst.setString(5, p.getIdDoctor());
                } catch (Exception ex) {
                    Vista.imprimePantalla("Error " + ex.getMessage());
                }

                Statement stm = conn.createStatement();
                ResultSet res = stm.executeQuery(QUERY_SELECT_ALL);
                if (res.next()) {
                    boolean existePersona = false;
                    if (p.getIdPaciente() != 0) { //controlamos que no sea el paciente erroneo
                        {
                            if (res.getString("nom").equals(p.getNom()) && res.getString("cognoms").equals(p.getCognom())) {
                                existePersona = true;
                                Vista.imprimePantalla("Ya existe una persona con este nombre y apellidos. Quieres agregar otra?\n1. Si  2. No");
                                try {
                                    int opcion = scan.nextInt();
                                    if (opcion == 1) {
                                        Paciente aux = pedirDatosPaciente();
                                        agregarPaciente(aux);
                                    }
                                } catch (Exception ex) {
                                    Vista.imprimePantalla("Error " + ex.getMessage());
                                }
                            } else {
                                Vista.imprimePantalla("Persona agregada correctamente\n");
                                pst.execute();
                            }
                        }
                    }
                }

            }
        } catch (ClassNotFoundException ex) {
            Vista.imprimePantalla("Error con la clase: " + ex.getMessage());
        } catch (SQLException ex) {
            Vista.imprimePantalla("Error con SQL: " + ex.getMessage());
        }
    }

    @Override
    public void darBajaPaciente(int id) {
        try {
            DBConnect db = new DBConnect();
            Connection conn = db.getConnection();
            if (conn != null) {
                //statemenet
                PreparedStatement pst = conn.prepareStatement(QUERY_DELETE_PACIENTE_BY_ID);
                pst.setInt(1, id);
                pst.execute();

            }
        } catch (SQLException ex) {
            Vista.imprimePantalla("Error con el SQL: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Vista.imprimePantalla("Error con la clase: " + ex.getMessage());
        }
    }

    @Override
    public void listarPacientes() {
        try {
            DBConnect db = new DBConnect();
            Connection conn = db.getConnection();
            if (conn != null) {
                //statemenet
                Statement stm = conn.createStatement();
                ResultSet res = stm.executeQuery(QUERY_SELECT_ALL);
                imprimirResultado(res);
            }
        } catch (SQLException ex) {
            Vista.imprimePantalla("Error con el SQL: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Vista.imprimePantalla("Error con la clase: " + ex.getMessage());
        }
    }

    @Override
    public Paciente pedirDatosPaciente() {
        Paciente p = null;
        Scanner scan = new Scanner(System.in);
        try {
            Vista.imprimePantalla("Dime id paciente: ");
            int idPaciente = scan.nextInt();
            scan.nextLine(); //limpiar buffer
            Vista.imprimePantalla("Dime nombre: ");
            String nombre = scan.nextLine();
            Vista.imprimePantalla("Dime apellidos: ");
            String apellidos = scan.nextLine();
            Vista.imprimePantalla("Dime edad: ");
            int edad = scan.nextInt();
            scan.nextLine(); //limpiar buffer
            Vista.imprimePantalla("Dime idDoctor: ");
            String idDoc = scan.nextLine();
            p = new Paciente(idPaciente, nombre, apellidos, edad, idDoc);
        } catch (Exception ex) {
            Vista.imprimePantalla("Error: " + ex.getMessage());
            return (new Paciente(0, "", "", 0, "")); //devolvemos un paciente vacio, para controlar que no intente hacer acciones con un paciente incorrecto
        }
        return p;
    }

    public void imprimirResultado(ResultSet res) { //metodo que imprime todos las pacientes en un result set 
        Paciente p;
        try {
            while (res.next()) {
                int idPaciente = res.getInt("idPaciente");
                String nom = res.getString("nom");
                String cognoms = res.getString("cognoms");
                int edat = res.getInt("edat");
                String idDoctor = res.getString("idDoctor");
                p = new Paciente(idPaciente, nom, cognoms, edat, idDoctor);
                Vista.imprimePaciente(p);
            }
        } catch (SQLException ex) {
            Vista.imprimePantalla("Error con el SQL: " + ex.getMessage());
        }
    }
}
