package es.ifp.programacion.uf5.genericos;

import java.util.ArrayList;


public class Maleta <T> {
	
	private ArrayList<T> contenido = new ArrayList<T>();
	
	
	
	public void add(T objeto) {
		contenido.add(objeto);
	}
	
	public ArrayList<T> getProducts(){
		return this.contenido;
	}
	
	

}
