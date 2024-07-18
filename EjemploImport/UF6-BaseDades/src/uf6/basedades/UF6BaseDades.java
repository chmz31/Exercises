/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf6.basedades;

import Model.Country;
import Model.Menu;
import Persistencia.DAOcountries;
import Persistencia.DatabaseConnect;

/**
 *
 * @author alessandro
 */
public class UF6BaseDades {

    DAOcountries dao = new DAOcountries();
    Menu menu = new Menu();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UF6BaseDades app = new UF6BaseDades();

        app.run();
    }

    private void run() {
        int opcion;
        DatabaseConnect.loadDriver();
        do {
            opcion = menu.showMenu();
            switch (opcion) {
                case 1:
                    addNeverland();
                    break;
                case 2:
                    showAllCountries();
                    break;
                case 3:
                    addNewCountry();
                    break;
                case 0:
                    System.out.println("Salir...");
                    break;
                case 4:
                    showEsperanza();
                    break;
                default:
                    System.out.println("Has introducido una opcion no valida.");
            }

        } while (opcion != 0);
    }

    private void addNeverland() {
        dao.insertNeverlandCountry();
    }

    private void showAllCountries() {
        dao.showAllCountries();
    }

    private void addNewCountry() {
        Country c = dao.pedirDatosPais();
        dao.insertNewCountry(c);
    }

    private void showEsperanza() {
        dao.showCountriesEsperanza();
    }
}
