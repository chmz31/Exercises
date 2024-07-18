/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia;

import Modelo.Pelicula;

/**
 *
 * @author alessandro
 */
interface ICartelera { //metodos a implementar en la cartelera

    public void afegirPelicula();

    public void eliminarPelicula();

    public void modificarPelicula();

    public void listarPeliculas();

    public void listarPeliculasGenero();

    public void listarPeliculasEdad();

}
