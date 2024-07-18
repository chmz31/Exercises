package UF1;
import java.util.Scanner; 
public class variables_constantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String nombre, apellidos, dni, calle, codigoPostal; 
		int edad, tlf, numCalle, piso;
		boolean mayorEdad;
		float peso; 
		char letraCalle;
		Scanner sc = new Scanner(System.in);
		System.out.println("===============Ingrese sus datos==================");
		System.out.println("¿Nombre?");
		nombre = sc.nextLine();
		System.out.println("¿Apellidos?");
		apellidos = sc.nextLine();
		System.out.println("DNI");
		dni = sc.nextLine();
		System.out.println("Edad");
		edad = sc.nextInt();
		sc.nextLine(); //Limpiar Buffer 
		
		mayorEdad = (edad >= 18); 
				if (mayorEdad) {System.out.println("Es mayor de edad");
				} else {
					System.out.println("Es menor de edad");
				}
		System.out.println("Peso?");
		peso = sc.nextFloat();
		sc.nextLine(); //limpiar buffer 
		System.out.println("Telefono?");
		tlf = sc.nextInt();
		sc.nextLine();//limpiar buffer 
		System.out.println("Dirección?");
		System.out.println("Calle:");
		calle = sc.nextLine();
		System.out.println("Num de Calle:");
		numCalle = sc.nextInt();
		System.out.println("Piso");
		piso = sc.nextInt();
		sc.nextLine();
		System.out.println("Letra de calle");
		letraCalle = sc.nextLine().charAt(0);
		System.out.println("Codigo Postal:");
		codigoPostal = sc.nextLine();

		//Salida de datos 
		
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellidos: "+apellidos);
		System.out.println("DNI: "+dni);
		System.out.println("Edad: "+edad);
		System.out.println("Peso: "+peso);
		System.out.println("Telefono: "+tlf);
		System.out.println("Dirección: "+calle+ " "+numCalle+" "+piso+" "+letraCalle+" "+codigoPostal);
		
	}
	
	

}
