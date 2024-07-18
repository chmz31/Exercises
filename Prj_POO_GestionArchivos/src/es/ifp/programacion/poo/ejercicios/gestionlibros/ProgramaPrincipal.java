package es.ifp.programacion.poo.ejercicios.gestionlibros;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		String titulo;
		
		Libro libro1 = new Libro("2665","Roberto Bolaño","Anagrama","Lorem Ipsum",40);
		
		Libro libro2 = new Libro("El peligro de estar cuerdo", "Rosa Montero", "Seix Barral", "Lore ipsum",(float) 19.85);
		
        titulo = libro1.getTitulo(); 
        System.out.println("El titulo del libro1 es"+titulo); 
        
        titulo = libro2.getTitulo();
        System.out.println("El titulo del libro2 es"+titulo);
	}

}
