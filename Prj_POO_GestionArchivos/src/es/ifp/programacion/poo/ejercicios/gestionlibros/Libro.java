package es.ifp.programacion.poo.ejercicios.gestionlibros;
import java.util.Date;
public class Libro {

	//Definición de Atributos 
	
	private String titulo; 
	private String nomApeAutor; 
	private String isbn; 
	private String nomEdi; 
	private String sinopsis;
	private Date fechaPublicacion; 
	private float precio; 
	
	//Constructores 
	/**
	 * 
	 * @param titulo
	 * @param nomApeAutor
	 * @param isbn
	 * @param nomEdi
	 * @param sinopsis
	 * @param fechaPublicacion
	 * @param precio
	 */
	public Libro(String titulo, String nomApeAutor, String isbn, String nomEdi, String sinopsis, 
			Date fechaPublicacion, float precio) {
		
		this.titulo=titulo;
		this.nomApeAutor=nomApeAutor;
		this.isbn=isbn;
		this.nomEdi=nomEdi;
		this.sinopsis=sinopsis;
		this.fechaPublicacion=fechaPublicacion;
		this.precio=precio; 
		
		
	}
	/**
	 * 
	 * @param titulo
	 * @param nomApeAutor
	 * @param nomEdi
	 * @param sinopsis
	 * @param precio
	 */
	public Libro(String titulo, String nomApeAutor, String nomEdi, String sinopsis, float precio) {
		
		this.titulo=titulo;
		this.nomApeAutor=nomApeAutor;
		this.nomEdi=nomEdi;
		this.sinopsis=sinopsis;
		this.precio=precio; 
	}
	
	
	//Métodos 
	/**
	 * Método get que retorna el título del libro 
	 * @return un String con el título del libro
	 */
	public String getTitulo() {
		return this.titulo; 
	}
	/**
	 * Método get que retorna el nombre del autor
	 * @return String con el nombre del autor
	 */
	public String getAutor() {
		return this.nomApeAutor; 
	}
	/**
	 * Método que retorna el nombre de la editorial
	 * @return
	 */
	public String getEdi() {
		return this.nomEdi; 
	}
	/**
	 * Método que retorna la sinopsis
	 * @return
	 */
	public String getSinopsis() {
		return this.sinopsis; 
	}
	/**
	 * Método que retorna el precio
	 * @return
	 */
	public float getPrecio() {
		return this.precio; 
	}
	/**
	 * Método que retorna la fecha 
	 * @return
	 */
	public Date getDate() {
		return this.fechaPublicacion; 
	}
	/**
	 * Método que retorna el isbn
	 * @return
	 */
	public String getIsbn() {
		return this.isbn; 
	}
	
	/**
	 * Modifica el precio del libro
	 * @param nuevoPrecio es el nuevo precio del libro 
	 */
	public void setPrecio(float nuevoPrecio) {
		this.precio=nuevoPrecio;
	}
	
	
	
	
}
