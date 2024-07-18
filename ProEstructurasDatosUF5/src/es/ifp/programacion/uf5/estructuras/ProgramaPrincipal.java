package es.ifp.programacion.uf5.estructuras;
/**
 * Clase con un programa principal para realizar pruebas de:
 * 
 * - Arrays: definición, construcción, acceso y asignación.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/**	System.out.println("===================ARRAYS=========================");
		
		//Definición de un array
		int[] arrayEnteros; 
		
		//Definiendo e inicializando un array de caracteres. 
		char[] arrayCaracteres = {'a','e','i','o','u'};
		
		//Construir un array
		arrayEnteros = new int[10];
		
		//Asignacion de valores a un array 
		arrayEnteros[0]=3; 
		arrayEnteros[9]=9;
		
		//Recorrer un array 
		
		for(int i=0;i<arrayEnteros.length;i++) {
			System.out.println("Indice:"+i+"-Valor:"+arrayEnteros[i]); 
		}
		
		
		System.out.println("Creamos, inicializamos e imprimimos un array");
	    arrayEnteros = creaIncializaArray(20,1);
	    imprimeArray(arrayEnteros);
		
		
		
		
		System.out.println("=================================================");
		System.out.println("==================FIN ARRAYS=====================");
		
	}
  */
		
	/**System.out.println("================VECTORES===================");
	
	//Definición 
	Vector <String> v;
	Vector <String> vStrings;
	
	
	//Construcción
	v = new Vector<String>();
	//Constructor con tamaño inicial y capacidad de incremento
	vStrings = new Vector<String>(10,5);
	
	
	//Asignar valores a un vector 
	v.add("Hola"); 
	//Recoger valores de una posicion determinada 
	System.out.println("Elemento en la posición 0 de v:"+v.get(0));
	
	//Recorrer un vector 
	
	int size=v.size();
	
	for(int i=0; i<size;i++) {
		System.out.println("Indice:"+i+"-Valor:"+v.get(i));
	}
	
	vStrings=recorreVectorYCopia(v);
	int sizeS=vStrings.size();
	for(int i=0;i<size;i++) {
		System.out.println("vStrings->Indice:"+i+"-Valor:"+vStrings.get(i));
	}
	
	System.out.println("===========================================");
	System.out.println("==================FIN======================");	
	
	*/
//	System.out.println("===================Matrices=========================");
		
		//Definición, creación, acceso, recorrido y asignación.
	//	System.out.println("[MATRICES] 1.-Recogimos número de filas y columnas para crear la matriz");
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("Introduzca el número de filas:");
		//int nFilas= Integer.parseInt(sc.nextLine());
		
		//System.out.println("Introduzca el número de columnas:");
		//int nColumnas = Integer.parseInt(sc.nextLine());
		
		//Definir y construir la matriz 
		//Es necesario definir su tamaño previamente. 
	/*	double [][] matrizDouble = new double [nFilas][nColumnas]; 
		
		System.out.println("Introduzca un valor inicial para la matriz");
		double vInicial = Double.parseDouble(sc.nextLine());
		
		//Rellenamos la matriz con el valor inicial 
		for (int i=0; i<nFilas; i++)
			for (int j=0; j<nColumnas; j++)
				matrizDouble [i][j] = vInicial;
		
		System.out.println("[MATRICES] 2.-Recorremos la matriz");
		System.out.println("\n");
		
		for (int i=0; i<nFilas; i++)
			for (int j=0; j<nColumnas; j++)
				System.out.println("Celda:"+i+j+"=["+matrizDouble[i][j]+"]");

		System.out.println("Pulse para Continuar....");
		String continuar = sc.nextLine(); 
		
		System.out.println("[MATRICES] 3.-Rellenamos la matriz con valores aleatorios");
		for (int i=0; i<nFilas;i++)
			for (int j=0; j<nColumnas; j++)
				matrizDouble [i][j] = getNumeroAleatorio(); 
		
		System.out.println("[MATRICES] 4.-Recorremos la matriz");
		System.out.println("\n");
		
		for (int i=0; i<nFilas; i++) {
			for (int j=0; j<nColumnas; j++)
				System.out.println("Celda:"+i+j+"=["+matrizDouble[i][j]+"]");
	
		System.out.println("\n");
		}
	*/
	
		
		System.out.println("=============================================================");
		System.out.println("====================LISTAS - ARRAYLIST=======================");
		//Es una implementación del interfaz List basado en arrays.
		//Parecido a la clase vector pero no está sincronizado 
		//Progresión lineal en las operaciones de tiempo.
		
		//Definición, creación, acceso, recorrido y asignación.
		System.out.println("[LISTAS - ARRAYLIST] 1.- Crear un ArrayList.");
		ArrayList <String> aList = new ArrayList <String>(); 
		
		String value; 
		do {
		System.out.println("[LISTAS - ARRAYLIST] Introduzca el elemento a añadir");
		value = sc.nextLine();
		if (!value.equals("-1"))
			aList.add(value);
		} while (!value.equals("-1")); 
		
		
		System.out.println("[LISTAS - ARRAYLIST] 2.- Recorrer un ArrayList con un bucle for.");
		
		int size = aList.size();
		String tmp=null;
		for (int i=0; i<size; i++) {
		     tmp= aList.get(i);
		System.out.println(tmp+"");
		}
		
		System.out.println("\n");
		
		System.out.println("[LISTAS - ARRAYLIST] 3.- Recorrer con un iterador.");
		
		//Defino el iterador y lo obtengo de la ArrayList
		Iterator <String> it = aList.iterator();
		
		//hasNext() devuelve true si hay elementos por recorrer, false sino 
		//next () retorna el siguiente elemento de la lista 
		
		while(it.hasNext()) {
			tmp = it.next();
		    System.out.println(tmp+"");
		}
		System.out.println("\n");
		
		System.out.println("[LISTAS - ARRAYLIST] 4.- Comprobar si existe un elemento en la lista.");
		
		System.out.println("Introdzuca la cadena para comprobar si existe en la lista:");
		String palabra = sc.nextLine();
		
		if (aList.contains (palabra))
			 System.out.println("La cadena "+palabra+" se encuentra en la lista");
		 else
			 System.out.println("La cadena "+palabra+" no se encuentra en la lista");
		
		System.out.println("[LISTAS - ARRAYLIST] 5.- Eliminar un elemento de el arrayList");
		
		String elementoBorrado = aList.remove(0);  
		System.out.println("Se ha borrado el elemento: "+elementoBorrado);
		System.out.println("La lista queda como sigue:");
		Iterator <String> it2 = aList.iterator();

		while(it2.hasNext()) {
			tmp = it2.next();
		    System.out.println(tmp+"");
		}
		System.out.println("\n");
		
		
		
		System.out.println("[LISTAS - ARRAYLIST] 6.- Limpiamos el arrayList");
		
		aList.clear();
		Iterator <String> it3 = aList.iterator();

		while(it3.hasNext()) {
			tmp = it3.next();
		    System.out.println(tmp+"");
		}
		System.out.println("\n");
		
	}	
		
	public static Vector recorreVectorYCopia(Vector<String>v) {
		Vector <String> tmp = new Vector<String>();
		
		int size = v.size();
		for (int i=0;i<size;i++) {
			tmp.add(v.get(i));
		}
		
		return tmp;
	}
	
	public static int[] creaArray(int size) {
		return new int[size];
	} 
	
	public static void imprimeArray(int[] array) {
		for (int i=0; i<array.length;i++)
			System.err.println("Indice:"+i+"-Valor"+array[i]);
	}
	
	public static int[] creaIncializaArray(int size, int valorInicial) {
		int [] tmp = new int[size];
		for(int i=0; i<tmp.length; i++) {
			tmp[i]=valorInicial;
		} return tmp;
	}
	
	public static double getNumeroAleatorio() {
		return Math.random();
	}
	
	
	
	
	
	
}
