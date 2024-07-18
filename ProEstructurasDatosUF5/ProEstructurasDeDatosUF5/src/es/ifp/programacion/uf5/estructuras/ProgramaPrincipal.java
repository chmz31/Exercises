package es.ifp.programacion.uf5.estructuras;

import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;


/**
 * Clase con un programa principal para realizar pruebas de:
 * 
 * - Arrays: definición, construcción, acceso, recorrido y asignación.
 * - Vectores: definición, construcción, acceso, recorrido y asignación.
 * 
 * 
 */
import java.util.Vector;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		System.out.println("============ARRAYS==============");
		//Definición de un array de enteros
		int[] arrayEnteros;
		//Definiendo e inicializando un array de caracteres.
		char[] arrayCaracteres = {'a','e','i','o','u'};
		//Construir un array
		arrayEnteros = new int[10];
		//Asignación de valores a un array
		arrayEnteros[0]=3;
		arrayEnteros[9]=9;
		System.out.println("Recorrido de un array:");
		//Recorrer un array
		for(int i=0;i<arrayEnteros.length;i++) {
			System.out.println("Indice:"+i+"-Valor:"+arrayEnteros[i]);
		}
		//Genera excepción ya que me salgo fuera del rango del array
		try {
			System.out.println("Acceso a posición incorrecta:");
			System.out.println("Indice 12"+arrayEnteros[10]);
		}
		catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("ERROR:Acceso a indice fuera de rango del array");
		}
		System.out.println("Creamos, inicializamos e imprimos un array:");
		arrayEnteros = creaInicializaArray(20, 1);
		imprimeArray(arrayEnteros);
		System.out.println("================================");
		System.out.println("=========FIN ARRAYS=============");	
		
		
		System.out.println("============VECTORES==============");
		
		//Definición 
		Vector<String> v;
		Vector<String> vStrings;
		
		//Construcción
		v = new Vector<String>();
		//Constructor con tamaño inicial y capacidad de incremento.
		vStrings = new Vector<String>(10,5);
		
		//Asignar valores a un vector
		v.add("Hola");
		//Recoger valores de una posición determinada
		System.out.println("Elemento en la posición 0 de v:"+v.get(0));
		
		//Recorrer un vector
		
		int size=v.size();
		
		for (int i=0;i<size;i++) {
			System.out.println("Indice:"+i+"-Valor:"+v.get(i));
		}
		
		
		vStrings=recorreVectorYCopia(v);
		
		int sizeS=vStrings.size();
		for(int i=0;i<size;i++) {
			System.out.println("VStrings->Indice:"+i+"-Valor:"+vStrings.get(i));
		}
		
		
		
		System.out.println("================================");
		System.out.println("=========FIN VECTORES=============");
		
		
		
		
		
		System.out.println("========================================================================");
		
		System.out.println(">>>>>>>>>>>>  MATRICES");
		//Definición, creación, acceso, recorrido y asignación.
		System.out.println("[MATRICES] 1.-Recogemos número de filas y columnas para crear la matriz.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el número de filas:");
		int nFilas = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduzca el número de columnas:");
		int nColumnas = Integer.parseInt(sc.nextLine());
		
		//Definir y construir la matriz
		//Es necesario definir su tamaño previamente.
		double [][] matrizDouble = new double[nFilas][nColumnas];
		
		
		System.out.println("Introduzca un valor inicial para la matriz:");
		double vInicial = Double.parseDouble(sc.nextLine());
		
		//Rellenamos la matriz con el valor inicial
		for (int i=0;i<nFilas;i++)
			for(int j=0;j<nColumnas;j++)
				matrizDouble[i][j]=vInicial;
		
		
		
		System.out.println("[MATRICES] 2.-Recorremos la matriz.");
		System.out.println("\n");
		
		for (int i=0;i<nFilas;i++)
			for (int j=0;j<nColumnas;j++)
				System.out.println("Celda:"+i+j+"=["+matrizDouble[i][j]+"]");
		
		System.out.println("Pulse para continuar...");
		String continuar = sc.nextLine(); 
		
		
		
		
		System.out.println("[MATRICES] 3.- Rellenamos la matriz con valores aleatorios");
		
		for (int i=0;i<nFilas;i++)
			for (int j=0;j<nColumnas;j++)
				matrizDouble[i][j]=getNumeroAleatorio();
		
		
		System.out.println("[MATRICES] 4.-Recorremos la matriz.");
		System.out.println("\n");
		for (int i=0;i<nFilas;i++) {
			for (int j=0;j<nColumnas;j++)
				System.out.println("Celda:"+i+j+"=["+matrizDouble[i][j]+"]");
		
			System.out.println("\n");
		}
	
		
		
		
		System.out.println("========================================================================");
		
		System.out.println(">>>>>>>>>>>>  LISTAS - ARRAYLIST");
		
		//Es una implementación del interfaz List basado en arrays.
		//Parecido a la clase vector pero no está sincronizado.
		//Progresión lineal en las operaciones de tiempo. 
		
		
		
		//Definición, creación, acceso, recorrido y asignación.
		System.out.println("[LISTAS - ARRAYLIST] 1.- Crear un ArrayList.");
		ArrayList<String> aList = new ArrayList<String>();
		sc = new Scanner(System.in);
		String value;
		do {
		System.out.println("Introduzca el elemento a añadir (-1 para terminar):");
		value = sc.nextLine();
		if (!value.equals("-1"))
			aList.add(value);
		}while (!value.equals("-1"));
		
		System.out.println("[LISTAS - ARRAYLIST] 2.- Recorrer un ArrayList con un bucle for");
		
		int sizeList = aList.size();
		String tmp=null;
		for (int i=0;i<sizeList;i++) {
			tmp = aList.get(i);
			System.out.print(tmp+" ");
		}
		System.out.println("\n");
		
		System.out.println("[LISTAS - ARRAYLIST] 3.- Recorrer un ArrayList con un iterador");
		
		//Defino el iterador y lo obtengo del ArrayList
		Iterator<String> it = aList.iterator();
		
		//hasNext() devuelve true si hay elementos por recorrer, false sino.
		//next() retorna el siguiente elemento en la lista
		
		//   Elemento1  Elemento2  Elemento3
		//|
		
		
		while(it.hasNext()) {
			tmp = it.next();
			System.out.print(tmp+" ");
		}
		
		System.out.println("\n");
		
		System.out.println("[LISTAS - ARRAYLIST] 4.- Comprobar si existe un elemento en la lista");
		
		
		System.out.println("Introduzca la cadena para comprobar si existe en la lista:");
		String palabra = sc.nextLine();
		
		if (aList.contains(palabra))
			System.out.println("La cadena "+palabra+" se encuentra en la lista");
		else
			System.out.println("La cadena "+palabra+" no se encuentra en la lista");
		
		
		System.out.println("[LISTAS - ARRAYLIST] 5.- Eliminar un elemento del arrayList");
		
		String elementoBorrado=aList.remove(0);
		System.out.println("Se borrado el elemento:"+elementoBorrado);
		System.out.println("La lista queda como sigue:");
		
		Iterator<String> it2 = aList.iterator();
		
		while(it2.hasNext()) {
			tmp = it2.next();
			System.out.print(tmp+" ");
		}
		
		
		System.out.println("\n");
		
		System.out.println("[LISTAS - ARRAYLIST] 6.- Limpiamos el arrayList");
		
		aList.clear();
		
		System.out.println("[LISTAS - ARRAYLIST] 7.- Limpiamos el arrayList");
		
		it = aList.iterator();
		while(it.hasNext()) {
			tmp = it.next();
			System.out.print(tmp+" ");
		}
		
		System.out.println("El tamaño de la lista es:"+aList.size());
		
		
		
		
		System.out.println("========================================================================");
		
		System.out.println(">>>>>>>>>>>>  LISTAS - LINKEDLIST");
		
		/**
		 * LinkedList es una implementación del interfaz List utilizando una lista doblemente enlazada.
		 * Esto significa que el recorrido de la lista puede hacerse desde el principio o desde el final,
		 * encontrándo el índice que se desea buscar de forma más rápida que un ArrayList.
		 * 
		 * No está sincronizada.
		 */
		
		//Definición, creación, acceso, recorrido y asignación.
		System.out.println("[LISTAS - LINKEDLIST] 1.- Crear una LinkedList.");
		
		LinkedList<String> dList = new LinkedList<String>();
		
		
		System.out.println("[LISTAS - LINKEDLIST] 2.- Añadir elementos.");
		String elemento;
		sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Introduzca valor para añadir a la lista (-1 para salir):");
			elemento = sc.nextLine();
			if (!elemento.equals("-1"))
				dList.add(elemento);
					
		}while (!elemento.equals("-1"));
		
		
		
		System.out.println("[LISTAS - LINKEDLIST] 3.- Obtenemos elementos con un bucle for.");
		
		int sizeDList = dList.size();
		for (int i=0;i<sizeDList;i++) {
			tmp = dList.get(i);
			System.out.print(tmp+" ");
		}
		
		
		System.out.println("[LISTAS - LINKEDLIST] 4.- Obtenemos elementos con un iterador.");
		
		Iterator<String> itLList = dList.iterator();
		String ele;
		while (itLList.hasNext()) {
			ele = itLList.next();
			System.out.print(ele+" ");
		}
		
		System.out.println("\n");
		
		System.out.println("\n");
		
		System.out.println("Pulse para continuar...");
		continuar = sc.nextLine();

		
		
		System.out.println("[LISTAS - LINKEDLIST] 5.- Comprobar si existe un elemento en la lista.");
		
		
		System.out.println("Introduzca el elemento a buscar:");
		String eleTmp = sc.nextLine();
		
		if (dList.contains(eleTmp))
			System.out.println("Elemento "+eleTmp+" encontrado.");
		else
			System.out.println("Elemento "+eleTmp+" no encontrado.");
			
		
		System.out.println("[LISTAS - LINKEDLIST] 6.- Borrar elemento de la lista.");
		
		System.out.println("Introduzca el índice del elemento a borrar:");
		int num = Integer.parseInt(sc.nextLine());
		String eleBorrado = dList.remove(num);
		System.out.println("Se borrado el elemento:"+eleBorrado);
		System.out.println("\n");
		
		it = dList.iterator();
		while (it.hasNext())
			System.out.print(it.next()+" ");

		
		System.out.println("[LISTAS - LINKEDLIST] 7.- Limpiar la lista.");
		dList.clear();
		
		System.out.println("\n");
		System.out.println("El tamaño de la lista es:"+dList.size());
		
		
		System.out.println("========================================================================");
		System.out.println(">>>>>>>>>>>>  LISTAS - HASHTABLE");
		
		/**
		 * Estructura de pares clave valor. 
		 * No admite null como valor ni como clave.
		 * No mantiene el orden de inserción.
		 * Está sincronizada.
		 */
		
		
		System.out.println("[HASHTABLE] 1.- Creamos una tabla hash de pares String-String");
		Hashtable<String, String> hashTable = new Hashtable<String, String>();
		String key;
		String val;
		sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduzca la clave:");
			key = sc.nextLine();
			System.out.println("Introduzca el valor (-1 para salir):");
			val = sc.nextLine();
			if (!v.equals("-1"))
				hashTable.put(key,val);
			
		}while (!val.equals("-1"));
		
		
		
		System.out.println("[HASHTABLE] 2.- Recorremos las tabla hash:");
		
		//Enumerations
		
		Enumeration<String> keys;
		Enumeration<String> values;
		
		
		values = hashTable.elements();//Saco los valores de la hash y las paso a un Enumeration
		keys = hashTable.keys(); //Saco las claves de la hash y las paso a un Enumeration
		String clave;
		String valor;
		
		while(keys.hasMoreElements()) {
			clave = keys.nextElement();
			valor = values.nextElement();
			System.out.println("Key:"+clave+"-Valor:"+valor);
		}
		
		
		 value = hashTable.get("1");
		
		
		
		
		

		//System.out.println("========================================================================");
		//System.out.println(">>>>>>>>>>>>  HASHMAP");
		
		/**
		 * Estructura de pares clave valor. 
		 * Si admite null como valor y como claves.
		 * No mantiene el orden de inserción, pero otras clases de la estructura Map, sí. TreeMap
		 * No está sincronizada.
		 */
		
		
		System.out.println("[HASHMAP] 1.- Creamos una hashmap de pares String-String");
		sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();
		String ke;
		String va;
		do {
		
		System.out.println("Introduzca clave para añadir al HashMap:");
		ke = sc.nextLine();
		System.out.println("Introduzca valor para añadir al HashMap (-1 para salir):");
		va = sc.nextLine();
		
		if (!va.equals("-1"))
			map.put(ke, va);
		
		}
		while(!value.equals("-1"));
		
		System.out.println("[HASHMAP] 2.- Recorremos el hashMap");
		
		int sizeHashMap = map.size();
		
		for (String claveSet : map.keySet())
			System.out.println("Key:"+claveSet+"-Valor:"+map.get(claveSet));
		
		
		System.out.println("[HASHMAP] 3.- Borrar elemento por su clave");
		System.out.println("Introduzca la clave del elemento a borrar:");
		key = sc.nextLine();
		
		String valorBorrado = map.remove(key);
		System.out.println("Se ha borrado la clave:"+key+ " y el valor:"+valorBorrado);
		
		
		sizeHashMap = map.size();
		
		for (String claveSet : map.keySet())
			System.out.println("Key:"+claveSet+"-Valor:"+map.get(claveSet));
		
		
		
		System.out.println("========================================================================");
		System.out.println(">>>>>>>>>>>>  SET");
		
		/**
		 * Implementa la interfaz Set. 
		 * Permite elementos null. 
		 * No permite duplicados.
		 * No se garantiza el orden de inserción
		 * No está sincronizada.
		 */
		
		
		System.out.println("[HASHSET] 1.- Creamos un set con un HashSet");
		sc = new Scanner(System.in);
		
		HashSet<Object> set = new HashSet<Object>(100);
		
		
		System.out.println("[HASHSET] 2.- Rellenamos con elementos (0-99)");
		
		for (int i=0;i<100;i++)
			set.add(i);
		
		
		System.out.println("[HASHSET] 3.- Recorremos el set");
		
		Iterator<Object> itSet = set.iterator();
		Object obj;
		while (itSet.hasNext()) {
			obj = itSet.next();
			System.out.println("Elemento:"+obj);
		}
		System.out.println("\n");
		
		
		System.out.println("========================================================================");
		System.out.println(">>>>>>>>>>>>  TREEMAP - TREESET");
		
		//Definido y creado el treeMap
		TreeMap<String,String > tMap = new TreeMap<String, String>();
		
		//Definición y creado el treeset
		TreeSet<String> tSet = new TreeSet<String>();
		
		
		
		
		
	} 	
	
	
	public static double getNumeroAleatorio() {
		return Math.random();
	}
	
	public static Vector<String> recorreVectorYCopia(Vector<String> v) {
		Vector<String> tmp=new Vector<String>();
		
		int size = v.size();
		for (int i=0;i<size;i++) {
			tmp.add(v.get(i));
		}
		return tmp;
	}
	
	
	
	public static void imprimeArray(int[] array) {
		for (int i=0;i<array.length;i++)
			System.out.println("Indice:"+i+"-Valor:"+array[i]);
	}
	
	
	
	public static int[] creaArray(int size) {
		return new int[size];
	}
	

	public static int[] creaInicializaArray(int size, int valorInicial) {
		int[] tmp = new int[size];
		for(int i=0;i<tmp.length;i++) {
			tmp[i]=valorInicial;
		}
		
	return tmp;
	}
	
	
	
}
