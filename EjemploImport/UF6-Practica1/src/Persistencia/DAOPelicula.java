/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Controlador.ControladorMenu;
import Modelo.Pelicula;
import Vista.Vista;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alessandro
 */
public class DAOPelicula implements ICartelera {

    ControladorMenu controlador = new ControladorMenu(this);
    Vista vista;

    private final String QUERY_DELETE_TITLE = "DELETE FROM peliculas where titulo = ?";
    private final String QUERY_SELECT_ALL = "select * from peliculas";
    private final String QUERY_ADD_PELICULA = "INSERT INTO peliculas VALUES (?, ?, ?, ?, ?, ?, ?)";
    private final String QUERY_MODIFY_ALL = "UPDATE peliculas SET titulo = ?, duracion = ?, pais = ?, genero = ?, edad = ?, valoracion = ?, sinopsis = ? WHERE titulo = ?";
    private final String QUERY_SELECT_ALL_GENEROS = "SELECT DISTINCT genero FROM peliculas";
    private final String QUERY_SELECT_GENERO = "select * from peliculas where genero = ?";
    private final String QUERY_SELECT_EDAD = "select * from peliculas where edad <= ?";

    public DAOPelicula() {
        this.vista = new Vista(controlador);
    }

    @Override
    public void afegirPelicula() {
        Pelicula aux = crearPelicula();
        try {
            DBConnect db = new DBConnect();
            Connection conn = db.getConnection();
            if (conn != null) {
                //statemenet
                PreparedStatement pst = conn.prepareStatement(QUERY_ADD_PELICULA);
                pst.setString(1, aux.getTitulo());
                pst.setInt(2, aux.getDuracion());
                pst.setString(3, aux.getPais());
                pst.setString(4, aux.getGenero());
                pst.setInt(5, aux.getEdad());
                pst.setDouble(6, aux.getValoracion());
                pst.setString(7, aux.getSinopsis());
                pst.execute();

            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void eliminarPelicula() { //elimina una pelicula cuando le decimos el titulo (identificador)
        Scanner scan = new Scanner(System.in);
        Vista.imprimePantalla("Dime titulo: ");
        String titulo = scan.nextLine();

        try {
            DBConnect db = new DBConnect();
            Connection conn = db.getConnection();
            if (conn != null) {
                //statemenet
                PreparedStatement pst = conn.prepareStatement(QUERY_DELETE_TITLE);
                pst.setString(1, titulo);
                pst.execute();

            }
        } catch (SQLException ex) {
            Vista.imprimePantalla("Error con el SQL: " + ex.getMessage());
        }

    }

    @Override
    public void modificarPelicula() {
        Scanner scan = new Scanner(System.in);
        Vista.imprimePantalla("Dime titulo: ");
        String titulo = scan.nextLine();

        try {
            DBConnect db = new DBConnect();
            Connection conn = db.getConnection();
            if (conn != null) {
                //statemenet
                PreparedStatement pst = conn.prepareStatement(QUERY_MODIFY_ALL);
                pst.setString(8, titulo);
                vista.imprimePantalla("Dime nuevo titulo: ");
                String n_titulo = scan.nextLine();
                pst.setString(1, n_titulo);
                vista.imprimePantalla("Dime nueva duracion: ");
                int duracion = scan.nextInt();
                scan.nextLine();
                pst.setInt(2, duracion);
                vista.imprimePantalla("Dime nuevo pais: ");
                String pais = scan.nextLine();
                pst.setString(3, pais);
                vista.imprimePantalla("Dime nuevo genero: ");
                String genero = scan.nextLine();
                pst.setString(4, genero);
                vista.imprimePantalla("Dime nueva edad minima recomendada: ");
                int edad = scan.nextInt();
                scan.nextLine();
                pst.setInt(5, edad);
                vista.imprimePantalla("Dime nueva valoracion: ");
                double valoracion = scan.nextDouble();
                scan.nextLine();
                pst.setDouble(6, valoracion);
                if (valoracion > 5) { //nos encargamos de que no sea mayor a 5 
                    valoracion = 5;
                }
                vista.imprimePantalla("Dime nueva sinopsis: ");
                String sinopsis = scan.nextLine();
                pst.setString(7, sinopsis);
                pst.execute();
            }
        } catch (SQLException ex) {
            Vista.imprimePantalla("Error con el SQL: " + ex.getMessage());
        }
    }

    @Override
    public void listarPeliculas() {
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
        }
    }

    @Override
    public void listarPeliculasGenero() { //lista las peliculas del genero que escojamos
        Scanner scan = new Scanner(System.in);
        Vista.imprimePantalla("Escoje genero:\n");

        try {
            DBConnect db = new DBConnect();
            Connection conn = db.getConnection();
            if (conn != null) {
                //statemenet
                Statement stm = conn.createStatement();
                ResultSet res = stm.executeQuery(QUERY_SELECT_ALL_GENEROS);
                while (res.next()) {
                    System.out.println(res.getString("genero")); //muestra una lista de generos que capta de la propia base de datos, para tener en cuenta nuevos generos introducidos por el usuario
                }
                String opcion = scan.nextLine();
                PreparedStatement pst = conn.prepareStatement(QUERY_SELECT_GENERO);
                pst.setString(1, opcion);
                ResultSet res2 = pst.executeQuery();
                imprimirResultado(res2); //imprimimos todos los resultados
            }
        } catch (SQLException ex) {
            Vista.imprimePantalla("Error con el SQL: " + ex.getMessage());
        }
    }

    @Override
    public void listarPeliculasEdad() { //metodo que nos lista peliculas a partir de una edad minima
        Scanner scan = new Scanner(System.in);
        Vista.imprimePantalla("Dime edad minima de las peliculas a listar: ");
        int edad = scan.nextInt();
        scan.nextLine();//limpiar el buffer

        try {
            DBConnect db = new DBConnect();
            Connection conn = db.getConnection();
            if (conn != null) {
                //statemenet
                PreparedStatement pst = conn.prepareStatement(QUERY_SELECT_EDAD);
                pst.setInt(1, edad);
                ResultSet res = pst.executeQuery();
                imprimirResultado(res); //imprimimos todos los resultados

            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Pelicula crearPelicula() { //metodo que nos crea una pelicula con datos introducidos por teclado
        Scanner scan = new Scanner(System.in);
        vista.imprimePantalla("Dime titulo: ");
        String titulo = scan.nextLine();
        vista.imprimePantalla("Dime duracion: ");
        int duracion = scan.nextInt();
        scan.nextLine();
        vista.imprimePantalla("Dime pais: ");
        String pais = scan.nextLine();
        vista.imprimePantalla("Dime genero: ");
        String genero = scan.nextLine();
        vista.imprimePantalla("Dime edad minima recomendada: ");
        int edad = scan.nextInt();
        scan.nextLine();
        vista.imprimePantalla("Dime valoracion: ");
        double valoracion = scan.nextDouble();
        scan.nextLine();
        if (valoracion > 5) { //nos encargamos de que no sea mayor a 5 
            valoracion = 5;
        }
        vista.imprimePantalla("Dime sinopsis: ");
        String sinopsis = scan.nextLine();
        return (new Pelicula(titulo, duracion, pais, genero, edad, valoracion, sinopsis)); //devolvemos la pelicula
    }

    public void imprimirResultado(ResultSet res) { //metodo que imprime todas las peliculas en un result set
        Pelicula p;
        try {
            while (res.next()) {
                String titulo = res.getString("titulo");
                int duracion = res.getInt("duracion");
                String pais = res.getString("pais");
                String genero = res.getString("genero");
                int edad = res.getInt("edad");
                double valoracion = res.getDouble("valoracion");
                String sinopsis = res.getString("Sinopsis");
                p = new Pelicula(titulo, duracion, pais, genero, edad, valoracion, sinopsis);
                Vista.imprimePelicula(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOPelicula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
